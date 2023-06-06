import java.util.Scanner;

public class Bear extends GameObject {
	static Scanner sc = new Scanner(System.in);

	Bear() {
		super(0, 0, 1);
	}

	@Override
	public void move() {
		char c;
		int dx, dy;
		
		while (true) {
			dx = dy = 0;
			System.out.print("Left(a) down(s) up(d) right(f)>> ");
			c = sc.next().charAt(0);
	
			if (c == 'a') dx = -1 * distance;
			else if (c == 's') dy = 1 * distance;
			else if (c == 'd') dy = -1 * distance;
			else if (c == 'f') dx = 1 * distance;
			
			if (this.x + dx < 0 || this.x + dx >= 20 || this.y + dy < 0 || this.y + dy >= 10)
				System.out.println("You can't go there!");
			else {
				this.x += dx;
				this.y += dy;
				break;
			}
		}
	}

	@Override
	public char getShape() {
		return ('B');
	}
}