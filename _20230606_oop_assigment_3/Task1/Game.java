public class Game {
	static Bear bear;
	static Fish fish;
	static int turn;

	static {
		bear = new Bear();
		fish = new Fish();
		turn = 0;
	}

	public static void main(String[] args)
	{
		System.out.println("** Start Bear's Fish Eating Game **");
		
		while (true) {
			if (turn > 2)
				fish.move();
			printMap();
			if (bear.collide(fish)) {
				System.out.println("Bear wins!");
				break;
			}
			bear.move();
			turn = (turn + 1) % 5;
		}
	}

	static void printMap()
	{
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++)
			{
				if (i == bear.getY() && j == bear.getX())
					System.out.print(bear.getShape());
				else if (i == fish.getY() && j == fish.getX())
					System.out.print(fish.getShape());
				else
					System.out.print('_');
			}
			System.out.println();
		}
	}
}