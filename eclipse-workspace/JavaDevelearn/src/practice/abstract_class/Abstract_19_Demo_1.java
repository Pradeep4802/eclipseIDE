package practice.abstract_class;

abstract class Abstract_19_1 {
	void demo() {
		System.out.println("Java Concrete");
	}
	protected abstract void show();
}

abstract class Abstract_19_2 extends Abstract_19_1{
	protected abstract void display();
	protected void abs1() {
		System.out.println("Abs 1 are executed");
	}
}

public class Abstract_19_Demo_1 extends Abstract_19_2{
	protected void show() {
		System.out.println("Overrided Python show");
	}
	public void abs1() {
		System.out.println("ABS! Overrded");
	}
	protected void display() {
		System.out.println("Mera Wala Dance");
	}
	public static void main(String[] args) {
		Abstract_19_2 ab1 = new Abstract_19_Demo_1();
		ab1.demo();
		ab1.show();
		ab1.abs1();
	}
}
