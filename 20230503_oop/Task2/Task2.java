import java.util.Scanner;

public class Task2 {
	public static void main(String[] args)
	{
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);

		iptv.printProperty();
	}
}

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	protected int getColor() {
		return color;
	}

	public void printProperty() {
		System.out.println(getSize() + " inch " + getColor() + " color");
	}
}

class IPTV extends ColorTV {
	private String ip;
	
	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	protected String getIP() {
		return ip;
	}

	public void printProperty() {
		System.out.print("IP " + getIP() + " ");
		super.printProperty();
	}
}