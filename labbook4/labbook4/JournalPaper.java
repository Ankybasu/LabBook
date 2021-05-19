package labbook4;

public class JournalPaper extends WrittenItem{
	@Override
	public String toString() {
		return "JournalPaper [year=" + year + "," + super.toString() + "]";
	}

	private int year;
	public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author,int year) {
		super(identificationNumber, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
		this.year=year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


}
