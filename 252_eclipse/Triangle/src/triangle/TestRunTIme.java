package triangle;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TestRunTIme {

	Triangle tri;

	@BeforeEach
	void setUp() {
		tri = new Triangle();
	}
	
	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundFirstAndLast() {
		assertEquals("Not a triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE), "1", String.valueOf(Integer.MAX_VALUE)));
		 
	}
	
	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundFirstAndSecond() {
		assertEquals("Not a triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MAX_VALUE),"1"));
		 
	}
	
	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundLastAndSecond() {
		assertEquals("Not a triangle", tri.computeType("1",String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MAX_VALUE)));
		 
	}
	
	@Tag("isNotTriangle")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundLast() {
		assertEquals("Not a triangle", tri.computeType("1","3454", String.valueOf(Integer.MAX_VALUE)));
		 
	}
	
	@Tag("isTriangle")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAll() {
		assertEquals("equilateral triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MAX_VALUE),String.valueOf(Integer.MAX_VALUE)));
	}
	
	@Tag("isTriangle")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllMinusOne() {
		assertEquals("equilateral triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE-1), String.valueOf(Integer.MAX_VALUE-1),String.valueOf(Integer.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllOfFloat() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Float.MAX_VALUE-1),String.valueOf(Float.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllOfFloatFirst() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Integer.MAX_VALUE-1),String.valueOf(Integer.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllOfFloatSecond() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Integer.MAX_VALUE-1), String.valueOf(Float.MAX_VALUE-1),String.valueOf(Integer.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	void MaxBoundAllOfFloatLast() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Integer.MAX_VALUE-1), String.valueOf(Integer.MAX_VALUE-1),String.valueOf(Float.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllOfFloatLastAndFirst() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Integer.MAX_VALUE-1),String.valueOf(Float.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllOfFloatSecondAndFirst() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Float.MAX_VALUE-1),String.valueOf(Integer.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllOfFloatSecondAndLast() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Integer.MAX_VALUE-1), String.valueOf(Float.MAX_VALUE-1),String.valueOf(Float.MAX_VALUE-1)));
	}
	
	
	@Tag("isNotTriangle")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundAllPlusLimit() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Integer.MAX_VALUE+30000000), String.valueOf(Integer.MAX_VALUE+30000000),String.valueOf(Integer.MAX_VALUE+30000000)));
	}
	
	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void MaxBoundFirst() {
		assertEquals("Not a triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE),"1","3454"));
		 
	}
	@Tag("Isosceles")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testForIsoscelesFirstTwoEqual() {
		assertEquals("Isosceles triangle", tri.computeType("6", "6", "4"));
	}

	@Tag("Isosceles")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testForIsoscelesFirstAndLastEqual() {
		assertEquals("Isosceles triangle", tri.computeType("6", "4", "6"));
	}

	@Tag("Isosceles")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testForIsoscelesSecondAndLastEqual() {
		assertEquals("Isosceles triangle", tri.computeType("4", "6", "6"));
	}

	@Tag("equilateral")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testForequilateral() {
		assertEquals("equilateral triangle", tri.computeType("6", "6", "6"));
	}

	@Tag("Scalene")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testForScaleneSumOfFirstAndSecondGreaterThanLast() {
		assertEquals("Scalene Triangle", tri.computeType("2", "3", "4"));
	}
	
	@Tag("Scalene")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testForScaleneSumOfLasttAndSecondGreaterThanFirst() {
		assertEquals("Scalene Triangle", tri.computeType("2", "6", "5"));
	}
	
	@Tag("Scalene")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testForScaleneSumOfLasttAndFirstGreaterThanSecond() {
		assertEquals("Scalene Triangle", tri.computeType("6", "2", "5"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testALLNulls() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, null, null));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void testTwoNullsSecondAndLast() {
		assertEquals("Invalid input could not parse to int", tri.computeType("1", null, null));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestTwoNullsFirstAndSecond() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, null, "1"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestTwoNullsFirstAndLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, "1", null));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestNullLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType("1", "1", null));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestNullSecond() {
		assertEquals("Invalid input could not parse to int", tri.computeType("1", null, "1"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestNullFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, "1", "1"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForNoNumericSecond() {
		assertEquals("Invalid input could not parse to int",tri.computeType("2", "one", "1"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForNoNumericFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType("two", "1", "1"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForNoNumericLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType("1", "1", "oine"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForNoNumericLastAndFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType("on5e", "1", "onwe"));
	}
	
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForNoNumericSecondAndFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType("one", "one1", "1"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForNoNumericSecondAndLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType("1", "one1", "1tone"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForAllNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "-2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForFirstNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "2", "3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForSecondNegative() {
		assertEquals("Not a triangle",tri.computeType("1", "-2", "3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForLastNegative() {
		assertEquals("Not a triangle",tri.computeType("1", "2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForLastAndFirstNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForLastAndSecondNegative() {
		assertEquals("Not a triangle",tri.computeType("1", "-2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void TestForFirstAndSecondNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "-2", "3"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void OneSumGreaterThanOther1() {
		assertEquals("Not a triangle", tri.computeType("1", "1", "15"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void OneSumGreaterThanOther2() {
		assertEquals("Not a triangle", tri.computeType("2", "1", "1"));
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void OneSumGreaterThanOther3() {
		assertEquals("Not a triangle", tri.computeType("1", "4", "1"));
	}
	
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void OneSumGreaterThanOther4() {
		assertEquals("Not a triangle", tri.computeType("1", "4", "100000"));
	}

	@Test
	@Timeout(value = 1, unit = TimeUnit.SECONDS)
	void OneSumGreaterThanOther5() {
		assertEquals("Not a triangle", tri.computeType("10", "4432", "100000"));
	}

}
