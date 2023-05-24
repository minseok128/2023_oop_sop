public class Won2Dollar extends Converter {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar();
		toDollar.run();
	}

	protected double convert(double src) {
		return src / ratio;
	}

	protected String getSrcString() {
		return ("KRW");
	}

	protected String getDestString() {
		return ("USD");
	}
}
