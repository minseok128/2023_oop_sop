public class MyPoint {
	int x, y;
	String str;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	boolean equals(MyPoint p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		}
		return false;
	}
}
