public class SoccerPlayer extends Player {
	private double kickSpeed;

	public SoccerPlayer(String name, double kickSpeed) {
		super(name);
		this.kickSpeed = kickSpeed;
	}

	public void setKickSpeed(double kickSpeed) {
		this.kickSpeed = kickSpeed;
	}

	@Override
	public void showDetail() {
		super.showDetail();
		System.out.println("Kick speed: " + (kickSpeed == 0 ? "No information" : kickSpeed));
	}
}
