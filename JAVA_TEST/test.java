public class test {
	public static void main(String[] args)
	{
		B b = new B();
		b.bb();
	}
}

abstract class A {
	abstract void bb();
}

class B extends A {
	int a;

	@Override
	void bb()
	{
		a = 2;
		System.out.println(a);
	}
}

interface in {
	default int add(int a, int b){
		return (a + b);
	}
}