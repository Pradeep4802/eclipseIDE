package practice.innerclasses;

public class StaticInner_21_1 {
	
	static int x = 10;
	int y = 20;
	
	static void match() {
		System.out.println("Outer Java Instance");
	}
	
	public void great() {
		System.out.println("Outer Python Instance");
	}
	
	static class InnerCLasses_21_4 {
		int k = 30;
		static int m = 40;
		StaticInner_21_1 ii = new StaticInner_21_1();
		public void InnerDemo() {
			System.out.println("Inner PHP Instance ");
			match();
			ii.great();
			
			System.out.println(x*m);
			System.out.println(ii.y*30);
		}
	}
	
	public static void main(String[] args) {
		StaticInner_21_1 i1 = new StaticInner_21_1();
		InnerCLasses_21_4 i2 = new InnerCLasses_21_4();
		i2.InnerDemo();
	}
}
