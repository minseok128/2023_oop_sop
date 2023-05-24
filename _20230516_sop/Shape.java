public interface Shape {
	final double PI = 3.14f;

	void draw();

	double getArea();

	default public void redraw() {
		System.out.print("---Redrawing.... ");
		draw();
	}
}