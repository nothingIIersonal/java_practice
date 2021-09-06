import java.lang.*;

public class Square extends Rectangle {
	public Square() {

	}

	public Square(double side) {
		this.width = side;
		this.length = side;
	}

	public Square(double side, String color, boolean filled) {
		this.width = side;
		this.length = side;
		this.color = color;
		this.filled = filled;
	}

	public double getSide() {
		return this.width;
	}

	public void setSide(double side) {
		this.width = width;
		this.length = width;
	}

	public void setWidth(double width) {
		this.width = width;
		this.length = width;
	}

	public void setLength(double length) {
		this.width = width;
		this.length = width;
	}

	@Override
	public String toString() {
		return "\nFrom square: " + "\nSide: " + this.getSide() + "\nGetArea: " + this.getArea() + "\nGetPerimeter: " + this.getPerimeter() + "\n\n";
	}
}