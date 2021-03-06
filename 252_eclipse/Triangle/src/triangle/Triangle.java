package triangle;

public class Triangle implements ITriangle {

	@Override
	public String computeType(String side1, String side2, String side3) {
		int a;
		int b;
		int c;
		try {
			a = Integer.parseInt(side1);
			b = Integer.parseInt(side2);
			c = Integer.parseInt(side3);
			
			// handles overflow
			if( (a<0 || b<0 || c<0 ) &&( String.valueOf(a).length() >10  || String.valueOf(b).length() >10 || String.valueOf(c).length() >10   )) return "Invalid input could not parse to int";
			
			if( a==0 || b==0 || c==0) return "Not a triangle";

			
		} catch (NumberFormatException ex) {
			return "Invalid input could not parse to int";
		}

		if (a == b && b == c)
			return "equilateral triangle";

		else if (((a == b && b != c) || (a == c && b != a) || (c == b && c != a)) && ( (a + b > c) && (a + c > b) && (b + c > a)))
			return "Isosceles triangle";

		else if ((a + b > c) && (a + c > b) && (b + c > a))
			return "Scalene Triangle";

		else
			return "Not a triangle";

	}

}
