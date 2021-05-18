package mutilevelinheritance;

public class Rectangle extends Shape{
	@Override
	public String toString() {
		return "Rectangle [ "+ super.toString() +",width=" + width + ", length=" + length +  "]";
	}
	private double width=1.0;
	private double length=1.0;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
}
