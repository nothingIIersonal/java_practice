import java.lang.*;

public class Circle extends Shape {
	protected double radius;

	public Circle() {

	}	

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}

	@Override
	public double getPerimeter() {
		return 2*3.14*radius;
	}

	@Override
	public String toString() {
		return "\nFrom circle: " + this.radius + "\nRadius: " + this.getRadius() + "\nGetArea: " + this.getArea() + "\nGetPerimeter: " + this.getPerimeter() + "\n\n";
	}
}