package labbook4;

public class Book extends WrittenItem{

	@Override
	public String toString() {
		return "Book [" + super.toString() + "]";
	}

	public Book(int identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}

}
