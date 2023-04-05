public class _task4 {
	public static void main(String[] args) throws Exception {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		r.show();
		System.out.println("Area of s is " + s.square());
		if (t.contains(r))
			System.out.println("t contains r");
		if (t.contains(s))
			System.out.println("t contains s");
	}
}

class Rectangle {
	public int x, y, width, height;

	public Rectangle() {
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return (this.height * this.width);
	}

	public void show() {
		System.out.println("Square of size " + this.width + "x" + this.height + " at (" + this.x + "," + this.y + ")");
	}

	public boolean contains(Rectangle b) {
		if (b.x > this.x && b.x + b.width < this.x + this.width && b.y > this.y
				&& b.y + b.height < this.y + this.height)
			return (true);
		return (false);
	}
}

class Circle {
	public int x, y, r;

	public Circle() {
		this(0, 0, 0);
	}

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public boolean isOverlapped(Circle b) {
		return ((this.r + b.r) * (this.r + b.r) < (this.x - b.x) * (this.x - b.x) + (this.y - b.y) * (this.y - b.y));
	}
}