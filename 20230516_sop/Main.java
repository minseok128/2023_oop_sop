public class Main {
	public static void main(String[] args) {
		Shape[] shapesList = new Shape[3];
		shapesList[0] = new Circle(10);
		shapesList[1] = new Oval(20, 30);
		shapesList[2] = new Rect(10, 40);

		for (int i = 0; i < 3; i++) {
			shapesList[i].redraw();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Area: " + shapesList[i].getArea());
		}

		Angular[] angularList = new Angular[2];
		angularList[0] = new Rect(20, 30);
		angularList[1] = new Line(10, 40);
		for (int i = 0; i < 2; i++) {
			angularList[i].printVertex();
		}
	}
}

class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("Circle with radius " + radius);
	}

	public double getArea() {
		return PI * radius * radius;
	}
}

class Oval implements Shape {
	private double radius1;
	private double radius2;

	public Oval(double radius1, double radius2) {
		this.radius1 = radius1;
		this.radius2 = radius2;
	}

	public void draw() {
		System.out.println("Oval with radius " + radius1 + "x" + radius2);
	}

	public double getArea() {
		return PI * radius1 * radius2;
	}
}

class Rect implements Shape, Angular {
	private double width;
	private double height;

	public Rect(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("Rectangle with " + width + "x" + height);
	}

	public double getArea() {
		return width * height;
	}

	public void printVertex() {
		System.out.print("Vertex: ");
		for (int i = 0; i < 4; i++)
			System.out.print(
					" (" + width / 2 * (i == 0 || i == 1 ? -1 : 1) + "," + height / 2 * (i == 0 || i == 2 ? -1 : 1)
							+ ")");
		System.out.println();
	}
}

class Line implements Angular {
	private int leftX;
	private int length;

	public Line(int leftX, int length) {
		this.leftX = leftX;
		this.length = length;
	}

	@Override
	public void printVertex() {
		System.out.print("Vertex: ");
		System.out.println(" (" + leftX * -1 + ",0) (" + (leftX * -1 + length) + ",0)");
	}
}