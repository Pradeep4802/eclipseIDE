package AbdulBariInner;

class Outer {
//	int v = 20;
	int x = 10;
//	Inner i = new Inner();
	
	
	// When we extends the outer class we cannot create inner class
	// object 
	class Inner extends Outer{
		int y = 20;
		public void innerDisplay() {
			System.out.println(x+" "+y);
		}
	}
	
//	Inner i = new Inner();
	
	public void outerDisplay() {
//		i.innerDisplay();
		System.out.println("Heeloo");
	}
}

public class NestedInner {
	public static void main(String args[]) {
//		Outer o = new Outer();
//		o.outerDisplay();
//		Outer.Inner u = new Outer().new Inner();
//		u.innerDisplay();
//		Outer.Inner u = o.new Inner();
		
		Outer.Inner in = new Outer().new Inner();
		in.outerDisplay();
		in.innerDisplay();
	}
}
