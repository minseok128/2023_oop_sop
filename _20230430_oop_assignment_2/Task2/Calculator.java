package Task2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, op;
		Operator[] arr = new Operator[4];
		arr[0] = new Add();
		arr[1] = new Sub();
		arr[2] = new Mul();
		arr[3] = new Div();

		System.out.print("Enter two operands and an operator >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		op = sc.next().charAt(0);
		op = op == '+' ? 0 : op == '-' ? 1 : op == '*' ? 2 : op == '/' ? 3 : -1;
		if (op != -1) {
			arr[op].setValue(a, b);
			System.out.println(arr[op].calculate());
		}
		sc.close();
	}
}

class Operator {
	int a;
	int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return (0);
	}
}

class Add extends Operator {
	@Override
	int calculate() {
		return (this.a + this.b);
	}
}

class Sub extends Operator {
	@Override
	int calculate() {
		return (this.a - this.b);
	}
}

class Mul extends Operator {
	@Override
	int calculate() {
		return (this.a * this.b);
	}
}

class Div extends Operator {
	@Override
	int calculate() {
		return (this.a / this.b);
	}
}