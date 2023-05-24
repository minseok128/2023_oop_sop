public abstract class Calc {
	protected int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
}

class Add extends Calc {
	@Override
	int calculate() {
		return (a + b);
	}
}

class Sub extends Calc {
	@Override
	int calculate() {
		return (a - b);
	}
}

class Mul extends Calc {
	@Override
	int calculate() {
		return (a * b);
	}
}

class Div extends Calc {
	@Override
	int calculate() {
		return (a / b);
	}
}
