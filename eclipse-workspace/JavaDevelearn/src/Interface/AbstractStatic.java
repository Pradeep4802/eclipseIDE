package Interface;
import Interface.Tax.Gate;

interface abs {
	void show();
	static void display() {
		System.out.println("Display show was called");
	}
	default void demo() {
		System.out.println("Abs demo was called withd default keyword");
	}
}

interface Tax {
	default void demo() {
		System.out.println("Tax demo was called withd default keyword");
	}
	interface Gate {
		void gate1();
		void gate2();
	}
}

public class AbstractStatic implements abs,Tax{
	public void show() {
		System.out.println("Show was called");
	}
	public void demo() {
		System.out.println("AbstractDemo Demo was called withd default keyword");
	}
	public void gate1() {
		System.out.println("Gate 1 was here");
	}
	public void gate2() {
		System.out.println("Gate 2 was here!!");
	}
	
	public static void main(String args[]) {
		AbstractStatic as = new AbstractStatic();
		as.show();
		abs.display();  // To call static method of interface type interface_name.method_name;
		as.demo();
		as.gate2();
		as.gate1();
	}
}
