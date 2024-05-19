package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width + height) * 2.0; 
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height); 
	}
	
	public String toString() {
		return "AREA = "
				+ String.format("%.2f%n", area())
				+ "PERIMETER = "
				+ String.format("%.2f%n", perimeter())
				+ "DIAGONAL = "
				+ String.format("%.2f%n", diagonal());
	}
}
