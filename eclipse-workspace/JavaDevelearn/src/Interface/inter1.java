package Interface;

interface ABC {
	int x = 20;
	void show();
}

public class inter1 implements ABC{
	static int d = 10;
	public void show() {
		System.out.println("Java");
	}
	
	public static void main(String args[]) {
		inter1 ab = new inter1();
		ab.show();
		System.out.println(inter1.x);
		System.out.println(d);
	}
}
