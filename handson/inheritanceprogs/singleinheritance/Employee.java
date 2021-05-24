package single;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Id=" + Id + ", dob=" + dob + ", doj=" + doj + "]";
	}
	private String name;
	private int Id;
	private Date dob;
	private Date doj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(String dob) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		this.dob = sdf.parse(dob);
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(String doj)throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		this.doj = sdf.parse(doj);
	}
}
