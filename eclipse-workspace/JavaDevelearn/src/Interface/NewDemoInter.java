package Interface;

interface Question1_A {
	default void show() {
		System.out.println("Ronaldo");
	}
}

interface Question1_B {
	default void show() {
		System.out.println("Messi");
	}
}

interface Question3_A {
	void MyDemo(int value); 
}

interface Question3_B {
	void MyDemo(String Name); 
}

interface Question4_A {
	default void myDemo() {
		System.out.println("Interface 4A Demo");
	}
}
interface Question4_B extends Question4_A{
	default void myDemo() {
		System.out.println("Interface 4B Demo");
	}
}

public class NewDemoInter implements Question4_B{

	public void MyDemo(int a) {
		System.out.println("Value is :"+a);
	}
	public void MyDemo(String str) {
		System.out.println("Name is :"+str);
	}
//	public void myDemo() {
//		
//	}

	public static void main(String[] args) {
		NewDemoInter ndi = new NewDemoInter();
		//		ndi.show();
//		ndi.MyDemo("Pradeep");
		ndi.myDemo();
	}
	//	public void show() {
	//		Question1_B.super.show();
	//	}
}
