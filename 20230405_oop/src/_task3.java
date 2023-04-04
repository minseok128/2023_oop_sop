public class _task3 {
	public static void main(String[] args) throws Exception {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "Swedish");
		s.show();
	}
}

class Song {
	private String name;
	private String artist;
	private int year;
	private String country;

	public Song() {
	}

	public Song(String name, String artist, int year, String country) {
		this.name = name;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.println(this.name + " sung by " + this.country + " " + this.artist + " in " + this.year);
	}
}