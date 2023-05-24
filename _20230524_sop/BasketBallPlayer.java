public class BasketBallPlayer extends Player {
	private double jump;

	public BasketBallPlayer(String name) {
		super(name);
	}

	public void setJump(double jump) {
		this.jump = jump;
	}

	public void showDetail() {
		super.showDetail();
		System.out.println("Jump: " + (jump == 0 ? "No information" : jump));
	}
}
