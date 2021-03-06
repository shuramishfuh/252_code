package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNotValidTriangle {

	Triangle tri;

	@BeforeEach
	void setUp() {
		tri = new Triangle();
	}

	@Test
	void OneSumGreaterThanOther1() {
		assertEquals("Not a triangle", tri.computeType("1", "1", "15"));
	}
	
	@Test
	void OneSumGreaterThanOther2() {
		assertEquals("Not a triangle", tri.computeType("2", "1", "1"));
	}
	
	@Test
	void OneSumGreaterThanOther3() {
		assertEquals("Not a triangle", tri.computeType("1", "4", "1"));
	}
	
	
	@Test
	void OneSumGreaterThanOther4() {
		assertEquals("Not a triangle", tri.computeType("1", "4", "100000"));
	}

	@Test
	void OneSumGreaterThanOther5() {
		assertEquals("Not a triangle", tri.computeType("10", "4432", "100000"));
	}
}
