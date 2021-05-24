package mutilevelinheritance;

public class Shape {
	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	private String color="red";
	private boolean filled=true;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
}
