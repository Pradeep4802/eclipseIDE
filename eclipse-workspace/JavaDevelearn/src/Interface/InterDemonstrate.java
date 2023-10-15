package Interface;

interface Pract {
	int a = 10;
	void demo();
	default void show() {
		System.out.println("java");
	}
	static void display() {
		System.out.println("Python");
	}
}

interface Pract3 {
	void demo1();
	static String dance() {
		return "Prabhudeva";
	}
}

interface Pract4 extends Pract3{
	default void dancePlus() {
		System.out.println("Dance Master is : "+Pract3.dance());
	}
}

interface Pract1 extends Pract,Pract3,Pract4{
	void demon1();
	default void show() {
		System.out.println("PHP");
	}
	static void display() {
		System.out.println("Substarction is: "+(5-1));
	}
	default void demo1() {
		System.out.println("Multiply");
	}
}

public class InterDemonstrate implements Pract1{
	public void demo() {
		System.out.println("Pradeep");
		System.out.println(a);
	}
	public void demon1() {
		System.out.println("Addition of two number is : "+(4+9));
	}
	public static void main(String[] args) {
		InterDemonstrate it = new InterDemonstrate();
		it.demo();
		it.show();
		Pract.display();
		it.demon1();
		it.show();
		Pract1.display();
		it.demo1();
		System.out.println("--------------------------");
		it.dancePlus();
	}
}
