package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TestValidInput {
   Triangle tri;
	@BeforeEach
	void setUp()  {
		tri = new Triangle();
	}

	@Test
	void testALLNulls() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, null, null));
	}
	
	@Test
	void testTwoNullsSecondAndLast() {
		assertEquals("Invalid input could not parse to int", tri.computeType("1", null, null));
	}
	
	@Test
	void TestTwoNullsFirstAndSecond() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, null, "1"));
	}
	
	@Test
	void TestTwoNullsFirstAndLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, "1", null));
	}
	
	@Test
	void TestNullLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType("1", "1", null));
	}
	
	@Test
	void TestNullSecond() {
		assertEquals("Invalid input could not parse to int", tri.computeType("1", null, "1"));
	}
	
	@Test
	void TestNullFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType(null, "1", "1"));
	}
	
	@Test
	void TestForNoNumericSecond() {
		assertEquals("Invalid input could not parse to int",tri.computeType("2", "one", "1"));
	}
	
	@Test
	void TestForNoNumericFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType("two", "1", "1"));
	}
	
	@Test
	void TestForNoNumericLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType("1", "1", "oine"));
	}
	
	@Test
	void TestForNoNumericLastAndFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType("on5e", "1", "onwe"));
	}
	
	
	@Test
	void TestForNoNumericSecondAndFirst() {
		assertEquals("Invalid input could not parse to int",tri.computeType("one", "one1", "1"));
	}
	
	@Test
	void TestForNoNumericSecondAndLast() {
		assertEquals("Invalid input could not parse to int",tri.computeType("1", "one1", "1tone"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	void TestForAllNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "-2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	void TestForFirstNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "2", "3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	void TestForSecondNegative() {
		assertEquals("Not a triangle",tri.computeType("1", "-2", "3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	void TestForLastNegative() {
		assertEquals("Not a triangle",tri.computeType("1", "2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	void TestForLastAndFirstNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	void TestForLastAndSecondNegative() {
		assertEquals("Not a triangle",tri.computeType("1", "-2", "-3"));
	}
	
	@Tag("TestForNegativeInput")
	@Test
	void TestForFirstAndSecondNegative() {
		assertEquals("Not a triangle",tri.computeType("-1", "-2", "3"));
	}

}
