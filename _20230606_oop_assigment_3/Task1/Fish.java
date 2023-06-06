import java.util.Random;

class Fish extends GameObject {
	static Random rand = new Random();
	static int[] dy = {1, -1, 0, 0}, dx = {0, 0, 1, -1};

	Fish() {
		super(6, 6, 1);
	}

	@Override
	public void move()
	{
		int new_y, new_x, direction;

		while (true) {
			direction = rand.nextInt(4);
			new_y = this.y + dy[direction] * distance;
			new_x = this.x + dx[direction] * distance;

			if (new_x >= 0 && new_x < 20 && new_y > 0 && new_y < 10)
			{
				this.x = new_x;
				this.y = new_y;
				break ;
			}
		}
	}

	@Override
	public char getShape() {
		return ('F');
	}
}
