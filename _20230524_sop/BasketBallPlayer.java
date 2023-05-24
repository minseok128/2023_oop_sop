public class BasketBallPlayer implements Player {
	private String name;
	private double speed;
	private String[] tools;
	private double jump;

	public String getName() {
		return name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setTools(String[] tools) {
		this.tools = tools;
	}

	public BasketBallPlayer(String name) {
		this.name = name;
	}

	public void setJump(double jump) {
		this.jump = jump;
	}

	public void showDetail() {
		System.out.println("Name: " + (name == null ? "No information" : name));
		System.out.println("Speed: " + (speed == 0 ? "No information" : speed));
		System.out.print("Tools: ");
		if (tools != null)
		{
			System.out.println();
			for (int i = 0; i < tools.length; i++)
				System.out.println((i + 1) + "th: " + (tools[i] == null ? "No information" : tools[i]));
		}
		else
			System.out.println("No information");
		System.out.println("Jump: " + (jump == 0 ? "No information" : jump));
	}
}
