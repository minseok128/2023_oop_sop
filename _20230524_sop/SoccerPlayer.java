public class SoccerPlayer implements Player {
	private String name;
	private double speed;
	private String[] tools;
	private double kickSpeed;

	public String getName() {
		return name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setTools(String[] tools) {
		this.tools = tools;
	}

	public SoccerPlayer(String name, double kickSpeed) {
		this.name = name;
		this.kickSpeed = kickSpeed;
	}

	public void setKickSpeed(double kickSpeed) {
		this.kickSpeed = kickSpeed;
	}

	@Override
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
		System.out.println("Kick speed: " + (kickSpeed == 0 ? "No information" : kickSpeed));
	}
}
