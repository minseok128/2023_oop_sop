package _20230524_sop;

public class Player {
	private String name;
	private double speed;
	private String[] tools;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setTools(String[] tools) {
		this.tools = tools;
	}

	public void showDetail() {
		System.out.println("Name: " + (name == null ? "No information" : name));
		System.out.println("Speed: " + (speed == 0 ? "No information" : speed));
		System.out.println("Tools: ");
		for (int i = 0; i < tools.length; i++) {
			System.out.println((i + 1) + "th: " + (tools[i] == null ? "No information" : tools[i]));
		}
	}
}