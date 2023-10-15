package Interface;

class MyCheck {
	
	interface InsideInter {
		void demo();
		void show();
	}
}

public class WithinInterface implements MyCheck.InsideInter{
	public void demo() {
		System.out.println("Demo was called");
	}
	public void show() {
		System.out.println("Show was called");
	}
	public static void main(String args[]) {
		WithinInterface mc = new WithinInterface();
		mc.demo();
		mc.show();
	}
}
