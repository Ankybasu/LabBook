package mutilevelinheritance;

public class Square extends Rectangle{
	@Override
	public String toString() {
		return "Square [" + super.toString() + "]";
	}

	private double side;
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}


	@Override
	public void setWidth(double side) {
		// TODO Auto-generated method stub
		super.setWidth(side);
	}

	@Override
	public void setLength(double side) {
		// TODO Auto-generated method stub
		super.setLength(side);
	}

}
