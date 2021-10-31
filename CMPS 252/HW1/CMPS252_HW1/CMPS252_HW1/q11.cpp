#include <iostream>
#include <fstream>
#include <map>
#include <algorithm>
int main() {
    std::string word;
    int max_val = 0;
    std::map<std::string, int> words;
    std::ifstream file("C:\\Users\\Public\\cool\\constitution.txt");
    while (file >> word) {
        if (word.size() >= 5) {
            if (words.count(word) > 0) {
                words[word] += 1;
                if (words[word] > max_val) max_val = words[word];
            }
            else words.insert({ word,1 });
        }
    }

    // for part a
//    for (auto i :words) {
//        std::cout << i.first << " : " << i.second << std::endl;
//    }

//for part b
    for (int i = 0; i < max_val; ++i) {

        std::cout << i << " : ";
        for (const auto& pair : words) {
            if (pair.second == i) {
                std::cout << pair.first << "|";
            }
        }
        std::cout << std::endl;
    }



}
