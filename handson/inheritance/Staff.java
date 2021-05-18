package inheritance;

public class Staff extends Person{
	private String school;
	private double pay;
	@Override
	public String toString() {
		return "Staff ["+super.toString() +",school=" + school + ", pay=" + pay +  "]";
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
}
