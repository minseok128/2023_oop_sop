package Task2;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, res = 0;
		char op;
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		System.out.print("Enter two operands and an operator >> ");
		a = sc.nextInt();
		b = sc.nextInt();
		op = sc.next().charAt(0);
		switch (op) {
			case '+':
				add.setValue(a, b);
				res = add.calculate();
				break;
			case '-':
				sub.setValue(a, b);
				res = sub.calculate();
				break;
			case '*':
				mul.setValue(a, b);
				res = mul.calculate();
				break;
			case '/':
				div.setValue(a, b);
				res = div.calculate();
				break;
		}
		System.out.println(res);
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