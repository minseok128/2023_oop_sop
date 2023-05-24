public class ColorPoint extends Point {
	String color;

	public ColorPoint() {
		this(0, 0, "Black");
	}

	public ColorPoint(int x, int y) {
		this(x, y, "Black");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public void setXY(int x, int y) {
		move(x, y);
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return ("the " + this.color.toLowerCase() + " point at (" + getX() + ", " + getY() + ")");
	}
}
