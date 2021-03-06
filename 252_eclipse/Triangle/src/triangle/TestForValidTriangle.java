package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

class TestForValidTriangle {

	Triangle tri;

	@BeforeEach
	void setUp() {
		tri = new Triangle();
	}

	@Tag("Isosceles")
	@Test
	void testForIsoscelesFirstTwoEqual() {
		assertEquals("Isosceles triangle", tri.computeType("6", "6", "4"));
	}

	@Tag("Isosceles")
	@Test
	void testForIsoscelesFirstAndLastEqual() {
		assertEquals("Isosceles triangle", tri.computeType("6", "4", "6"));
	}

	@Tag("Isosceles")
	@Test
	void testForIsoscelesSecondAndLastEqual() {
		assertEquals("Isosceles triangle", tri.computeType("4", "6", "6"));
	}

	@Tag("equilateral")
	@Test
	void testForequilateral() {
		assertEquals("equilateral triangle", tri.computeType("6", "6", "6"));
	}

	@Tag("Scalene")
	@Test
	void testForScaleneSumOfFirstAndSecondGreaterThanLast() {
		assertEquals("Scalene Triangle", tri.computeType("2", "3", "4"));
	}
		
	@Tag("Scalene")
	@Test
	void testForScaleneSumOfLasttAndSecondGreaterThanFirst() {
		assertEquals("Scalene Triangle", tri.computeType("2", "6", "5"));
	}
	
	@Tag("Scalene")
	@Test
	void testForScaleneSumOfLasttAndFirstGreaterThanSecond() {
		assertEquals("Scalene Triangle", tri.computeType("6", "2", "5"));
	}
	

}
