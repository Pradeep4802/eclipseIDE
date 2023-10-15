package practice.inheritance;

class Window{
	Window(int mark) {
		System.out.println("Window ("+mark+")");
	}
}

class House {
	Window w1 = new Window(1);
	House() {
		System.out.println("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f() {
		System.out.println("f()");
	}
	Window w3 = new Window(3);
	Window w4 = new Window(43);
}

public class OrderInitialize {
	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
}
