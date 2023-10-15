package Interface;

class MyInterface1 implements MyA, MyB
{
	public void bothInter(int x,int y) {
		System.out.println("Hi I am C++ from MyInterface1");
		System.out.println("Addtion of two number was : "+(x+y));
	}
	
	public void bothInter() {
		System.out.println("This is non param bothInter()");
	}
	
	public void Pract() {
		System.out.println("This is Pract DEmo");
	}
	public void myDemo() {
		System.out.println("This is second demo");
	}
	public void display() {
		System.out.println("Interface was initialized");
	}
}
public class InterDemo1 implements MyABC{
	
	public void bothInter(int m,int n) {
		System.out.println("Addition of two number in InterDemo1 : "+(m+n));
	}

	@Override
	public void Pract() {
		System.out.println("Java is useful");
	}

	@Override
	public void myDemo() {
		System.out.println("Python was suss");
	}

	@Override
	public void display() {
		System.out.println("Kata was thick");
	}
	
	public void bothInter() {
		System.out.println("Hi I am C++ from InterDemo1");
	}
	public static void main(String args[]) {
		InterDemo1 in = new InterDemo1();
		MyInterface1 my = new MyInterface1();
		in.myDemo();
		in.Pract();
		in.display();
		my.bothInter(x,y);
	}
}
