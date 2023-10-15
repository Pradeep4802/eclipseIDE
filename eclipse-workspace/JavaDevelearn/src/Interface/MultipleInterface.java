package Interface;

interface Multi1 {
	void demo1();
	void dada();
}

interface Multi2 extends Multi1{
	void demo1();
	void dodeshwar();
}

abstract class Multi3 implements Multi2 {
	public void demo1() {
		System.out.println("Demo was called from abstarct");
	}
}
 
public class MultipleInterface extends Multi3{
//	public void demo1() {
//		System.out.println("Demo 1 Was init");
//	}
	public void dada() {
		System.out.println("Dada Was init");
	}
	public void dodeshwar() {
		System.out.println("Dodeshwar is executed");
	}
	
	public static void main(String args[]) {
		MultipleInterface mi = new MultipleInterface();
		mi.dada();
		mi.demo1();
	}
}
