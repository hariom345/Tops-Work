package Module2;

abstract class Shape{
	abstract void rectangleArea(double length , double breadth);
	abstract void squareArea(double side);
	abstract void circleArea(double radius);
}

class Area7 extends Shape{
	public void rectangleArea(double length ,double breadth) {
		double area = length * breadth;
		System.out.println("Here the area of rectangle :"+area);
	}
	
	public void squareArea(double side) {
		double area = side * side;
		System.out.println("Here the area of square :"+area);
	}
	
	public void circleArea(double radius) {
		double area  = 3.14 * radius * radius;
		System.out.println("Here the area of circle :"+area);
	}
}
public class Q_32 {
	public static void main(String[] args) {
		/*
		 * We have to calculate the area of a rectangle, a square and a circle. Create
		 * an abstract class 'Shape' with three abstract methods namely 'RectangleArea'
		 * taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter
		 * each. The parameters of 'RectangleArea' are its length and breadth, that of
		 * 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create
		 * another class 'Area' containing all the three methods 'RectangleArea',
		 * 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and
		 * circle respectively. Create an object of class 'Area' and call all the three
		 * methods
		 */
		
		Area7 a = new Area7();
		a.rectangleArea(4, 5);
		a.squareArea(5);
		a.circleArea(5);
	}
}
