package temacurs2;

public class Shape {

	public Shape( int lenght) {
		
		int squareArea = calculateSquareArea(lenght);
		System.out.println("The area of the square is : " + squareArea );
	}
	

	public Shape(int lenght, int width) {
		
		int rectangleArea = calculateRectangleArea(lenght, width);
		System.out.println("The area of the rectangle is : " + rectangleArea );
	}
	
	public Shape(double radius) {
		double circleRadius = radius * radius * Math.PI;
		System.out.println("The area of the circle is : " + circleRadius );
	}
	
	//metoda calculateSqareArea
	
	public int calculateSquareArea(int lenght) {
		return lenght * lenght;
	}
	
	//metoda calculateRectangleArea
	public int calculateRectangleArea(int lenght, int width) {
		return lenght * width;
	}
	
}
