package mutilevelinheritance;

public class Circle extends Shape{
	@Override
	public String toString() {
		return "Circle ["+ super.toString()+",radius=" + radius + "]";
	}
	private double radius=1.0;
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return Math.PI*2*radius;
	}

}
