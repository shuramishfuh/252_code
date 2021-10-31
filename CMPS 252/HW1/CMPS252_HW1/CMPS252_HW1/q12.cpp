#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <algorithm>
#include <list>
#include <map>
using namespace std;

class date {
public:
    date(int day, int month, int year) : day(day), month(month), year(year) {}

public:   int getDay() const {
    return day;
}

public:  int getMonth() const {
    return month;
}

public: int getYear() const {
    return year;
}


private:
    int day;
    int month;
    int year;
};


class info {
public:
    info(int newCase, const date& date, int death) : new_Case(newCase), date(date), death(death) {}

public: int getNewCase() const {
    return new_Case;
}

      const date& getDate() const {
          return date;
      }

public: int getDeath() const {
    return death;
}


private:
    int new_Case;
    date date;
    int death;

};

void tokenize(std::string const& str, const char delim,
    std::vector<std::string>& out)
{
    size_t start;
    size_t end = 0;

    while ((start = str.find_first_not_of(delim, end)) != std::string::npos)
    {
        end = str.find(delim, start);
        out.push_back(str.substr(start, end - start));
    }
}


int main() {
    //  variables

    vector<info> all;
    string iso_code;
    string continent;
    string location;
    string _date;
    string total_cases;
    string new_cases;
    string new_cases_smoothed;
    string total_deaths;
    string new_deaths;
    string total_cases_per_million;
    string new_cases_per_million;
    string new_cases_smoothed_per_million;
    string total_deaths_per_million;
    string new_deaths_smoothed_per_million;
    string test;



    // open file
    ifstream csv_file("C:\\Users\\Public\\cont\\lebanon-covid.csv");

    if (!csv_file.is_open())
        std::cout << "File Not Open" << '\n';




    // read file
    int i = 0;
    while (csv_file.good()) {
        getline(csv_file, iso_code, ',');
        getline(csv_file, continent, ',');
        getline(csv_file, location, ',');
        getline(csv_file, _date, ',');
        getline(csv_file, total_cases, ',');
        getline(csv_file, new_cases, ',');
        getline(csv_file, new_cases_smoothed, ',');
        getline(csv_file, total_deaths, ',');
        getline(csv_file, new_deaths, ',');
        getline(csv_file, total_cases_per_million, ',');
        getline(csv_file, new_cases_per_million, ',');
        getline(csv_file, new_cases_smoothed_per_million, ',');
        getline(csv_file, total_deaths_per_million, ',');
        getline(csv_file, new_deaths_smoothed_per_million, ',');
        getline(csv_file, test, '\n');

        // skip headers
        if (i == 0) {
            i++;
            continue;
        }
        else {

            const char delim = '/';
            std::vector<std::string> out;
            tokenize(_date, delim, out);
            date d = date(stoi(out[0]), stoi(out[1]), stoi(out[2]));
            if (new_deaths.empty() || new_deaths == " " || new_deaths.size() < 1) {
                info inf = info(stoi(new_cases), d, 0);
                all.push_back(inf);
            }
            else {
                info inf = info(stoi(new_cases), d, stoi(new_deaths));
                all.push_back(inf);
            }
        }
    }


    cout << " Please select your inputs " << endl;
    cout << "  (a) for Print the average number of daily new cases" << endl;
    cout << "  (b) the average number of new cases per month per year" << endl;
    cout << "  (c) the average number of daily deaths " << endl;
    cout << "  (d) average number of deaths per month per year" << endl;
    char in;
    cin >> in;

    if (in == 'a') {
        int sum = 0;
        for (auto x : all) {
            sum += x.getNewCase();
        }
        cout << sum / all.size();
    }

    if (in == 'c') {
        float sum = 0;
        for (auto x : all) {
            sum += x.getDeath();
        }
        cout << sum / all.size();
    }
    else {

        int years[]{ 2020, 2021 };
        std::map<int, int> months;
        months.insert_or_assign(1, 31);
        months.insert_or_assign(2, 28);
        months.insert_or_assign(3, 31);
        months.insert_or_assign(4, 30);
        months.insert_or_assign(5, 31);
        months.insert_or_assign(6, 30);
        months.insert_or_assign(7, 31);
        months.insert_or_assign(8, 31);
        months.insert_or_assign(9, 30);
        months.insert_or_assign(10, 31);
        months.insert_or_assign(11, 30);
        months.insert_or_assign(12, 31);

        if (in == 'b') {
            cout << "Average number of new cases per month per year:" << endl;
            float sum = 0;
            for (auto x : years) {
                for (auto y : months) {
                    for (auto u : all) {
                        if (u.getDate().getDay() == y.first && u.getDate().getYear() == x) {
                            sum += u.getNewCase();

                        }
                    }
                    cout << y.first << "/" << x << " : " << sum / y.second << endl;
                }


            }
        }
        if (in == 'd') {
            cout << "Average number of deaths per month per year::" << endl;
            float sum = 0;
            for (auto x : years) {
                for (auto y : months) {
                    for (auto u : all) {
                        if (u.getDate().getDay() == y.first && u.getDate().getYear() == x) {
                            sum += u.getDeath();

                        }
                    }
                    cout << y.first << "/" << x << " : " << sum / y.second << endl;
                }
            }

        }
    }
}