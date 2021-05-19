package labbook4;

public class CD extends MediaItem{
	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", " + super.toString() + "]";
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Artist : "+artist);
		System.out.println("Genre : "+genre);
	}
	private String artist;
	private String genre;
	public CD(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(identificationNumber, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

}
