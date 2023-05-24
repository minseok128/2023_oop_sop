import java.util.Scanner;

public abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio = 1300;

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Convert " + getSrcString() + " to " + getDestString());
		System.out.print("Enter " + getSrcString() + ">> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("Converted: " + res + getDestString());
		sc.close();
	}
}
