package curs2;

public class TestRectangle {

	public static void main(String[] args) {
	
		Rectangle rectangle1 = new Rectangle (4, 6);
		System.out.println(rectangle1.calculateArea());
		
		Rectangle rectangle2 = new Rectangle (10, 8);
		System.out.println(rectangle2.calculateArea());
		
		Rectangle rectangle3 = new Rectangle (20, 16);
		System.out.println(rectangle3.calculateArea());

	}

}
