package Interface;

interface InterNested {
	void demo();
	void display();
	
	interface Nested1 extends InterNested{
		void add();
		void sub();
	}
}

public class MyNest1 implements InterNested,InterNested.Nested1{
	public void demo() {
		System.out.println("Demo Was Called");
	}
	public void display() {
		System.out.println("Display was Called");
	}
	public void add() {
		System.out.println("Add also called");
	}
	public void sub() {
		System.out.println("Sub was called");
	}
	public static void main(String args[]) {
		MyNest1 mn = new MyNest1();
		mn.demo();
		mn.display();
		mn.add();
		mn.sub();
	}
}


