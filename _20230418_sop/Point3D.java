public class Point3D extends Point {
	int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	protected void moveUp() {
		this.z++;
	}

	protected void moveDown() {
		this.z--;
	}

	public String toString() {
		return ("the point at (" + getX() + ", " + getY() + ", " + getZ() + ")");
	}
}
