package practice.innerclasses;

class InnerClass_21_2 {
	int x = 10;
	
}

public class InnerClass_21_1 {
	int x = 20;
	protected static void staticDemo() {
		System.out.println("Python Demo");
	}
	private void outerDemo() {
		System.out.println("Outer Java");
	}
	class InnerClass_21_3 {
		int m = 20;
		void meth1() {
			System.out.println(x*m);
			System.out.println("-------------------------------");
			outerDemo();
			staticDemo();
		}
	}
	public static void main(String[] args) {
		InnerClass_21_1 in1 = new InnerClass_21_1();
		InnerClass_21_3 in2 = in1.new InnerClass_21_3();
		in2.meth1();
		in1.outerDemo();
		staticDemo();
	}
}
