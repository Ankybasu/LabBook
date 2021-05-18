package inheritance;

public class Student extends Person{
	@Override
	public String toString() {
		return "Student ["+ super.toString()+",program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
	private String program;
	private int year;
	private double fee;
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}


	
}
