package InnerClasses;

public class InnerStatic {
	static int b = 30;
	int a = 20;
	static class NewStatic1 {
		int c = 50;
		InnerStatic is = new InnerStatic();
		void demo() {
			System.out.println("Java");
			System.out.println(is.a+" "+b+" "+c);
			is.show();
			display();
		}
		
	}
	void show() {
		System.out.println("Java");
	}
	static void display() {
		System.out.println("Python");
	}
	public static void main(String args[]) {
		NewStatic1 b = new NewStatic1();
		b.demo();
	}
}
