package Interface;

interface Question5_A {
	void myMethodA();
}
interface Question5_B {
	void myMethodB();
}

interface Question5_C extends Question5_A,Question5_B {
	default void myMethodA() {
		System.out.println("Java");
	}
}

public class DemoInterface implements Question5_C{
	public void myMethodB() {
		System.out.println("Python");
	}
	public void ownMeth() {
		System.out.println("Own Method");
	}
	public static void main(String[] args) {
		DemoInterface di1 = new DemoInterface();
		di1.myMethodA();
		di1.myMethodB();
		Question5_C qc = di1;
		qc.myMethodA();
//		di1.ownMeth();
		System.out.println(qc instanceof DemoInterface);
	}
}
