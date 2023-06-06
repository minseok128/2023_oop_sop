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
		int new_y, new_x, dir;

		while (true) {
			dir = rand.nextInt(4);
			new_y = y + dy[dir] * distance;
			new_x = x + dx[dir] * distance;

			if (new_x >= 0 && new_x < 20 && new_y > 0 && new_y < 10)
			{
				x = new_x;
				y = new_y;
				break ;
			}
		}
	}

	@Override
	public char getShape() {
		return ('F');
	}
}
