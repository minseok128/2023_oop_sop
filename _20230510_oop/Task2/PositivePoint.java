public class PositivePoint extends Point {
	public static void main(String[] args)
	{
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString());
		p.move(-5, 5);
		System.out.println(p.toString());
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()); 
	}

	public PositivePoint() {
		super(0, 0);
	}
	
	public PositivePoint(int x, int y) {
		super(x, y);
		if (x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	protected void move(int x, int y) {
		if (x >= 0 && y >= 0) {
			super.move(x, y);
		}
	}
	public String toString() {
		return ("(" + getX() + ", " + getY() + ") point");
	}

}

class Point {
	private int x, y;

	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}
