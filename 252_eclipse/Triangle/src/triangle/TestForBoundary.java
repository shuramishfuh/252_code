package triangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TestForBoundary {

	Triangle tri;

	@BeforeEach
	void setUp() {
		tri = new Triangle();
	}

	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	void MaxBoundFirstAndLast() {
		assertEquals("Not a triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE), "1", String.valueOf(Integer.MAX_VALUE)));
		 
	}
	
	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	void MaxBoundFirstAndSecond() {
		assertEquals("Not a triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MAX_VALUE),"1"));
		 
	}
	
	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	void MaxBoundLastAndSecond() {
		assertEquals("Not a triangle", tri.computeType("1",String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MAX_VALUE)));
		 
	}
	
	@Tag("isNotTriangle")
	@Test
	void MaxBoundLast() {
		assertEquals("Not a triangle", tri.computeType("1","3454", String.valueOf(Integer.MAX_VALUE)));
		 
	}
	
	@Tag("isTriangle")
	@Test
	void MaxBoundAll() {
		assertEquals("equilateral triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE), String.valueOf(Integer.MAX_VALUE),String.valueOf(Integer.MAX_VALUE)));
	}
	
	@Tag("isTriangle")
	@Test
	void MaxBoundAllMinusOne() {
		assertEquals("equilateral triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE-1), String.valueOf(Integer.MAX_VALUE-1),String.valueOf(Integer.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	void MaxBoundAllOfFloat() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Float.MAX_VALUE-1),String.valueOf(Float.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	void MaxBoundAllOfFloatFirst() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Integer.MAX_VALUE-1),String.valueOf(Integer.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
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
	void MaxBoundAllOfFloatLastAndFirst() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Integer.MAX_VALUE-1),String.valueOf(Float.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	void MaxBoundAllOfFloatSecondAndFirst() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Float.MAX_VALUE-1), String.valueOf(Float.MAX_VALUE-1),String.valueOf(Integer.MAX_VALUE-1)));
	}
	
	@Tag("Invalid")
	@Test
	void MaxBoundAllOfFloatSecondAndLast() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Integer.MAX_VALUE-1), String.valueOf(Float.MAX_VALUE-1),String.valueOf(Float.MAX_VALUE-1)));
	}
	
	
	@Tag("isNotTriangle")
	@Test
	void MaxBoundAllPlusLimit() {
		assertEquals("Invalid input could not parse to int", tri.computeType(String.valueOf(Integer.MAX_VALUE+30000000), String.valueOf(Integer.MAX_VALUE+30000000),String.valueOf(Integer.MAX_VALUE+30000000)));
	}
	
	@Tag("isNotTriangle")
	@Tag("Isosceles")
	@Test
	void MaxBoundFirst() {
		assertEquals("Not a triangle", tri.computeType(String.valueOf(Integer.MAX_VALUE),"1","3454"));
		 
	}


}
