package labbook4;

public class Video extends MediaItem{
	@Override
	public String toString() {
		return "Video [director=" + director + ", genre=" + genre + ", year=" + year + ","
				+ super.toString() + "]";
	}
	private String director;
	private String genre;
	private int year;
	public Video(int identificationNumber, String title, int numberOfCopies, int runtime, String director, String genre,
			int year) {
		super(identificationNumber, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Director : "+director);
		System.out.println("Genre : "+genre);
		System.out.println("Year of Release : "+year);
	}
}
