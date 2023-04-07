public class Day {
	private String work;

	void set(String work) {
		this.work = work;
	}

	String get() {
		return (work);
	}

	void show() {
		if (this.work == null)
			System.out.print("Nothing");
		else
			System.out.print("There is [" + this.get() + "]");

	}
}
