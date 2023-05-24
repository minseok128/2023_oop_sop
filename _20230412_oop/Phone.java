public class Phone {
	String name, Tel;

	Phone(String name, String Tel) {
		this.name = name;
		this.Tel = Tel;
	}

	void show() {
		System.out.println("Tel number of " + name + " is " + Tel);
	}
}
