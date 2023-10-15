package AbdulBariInner;

//abstract class AnonyInner {
//	abstract public void show();
//}

interface AnonyInner1 {
	abstract public void show();
}

class LocalOuter {
	public void display() {
//		class Inner {
//			public void show() {
//				System.out.println("Hello");
//			}
//		}
//		
//		new Inner().show();
		
		new AnonyInner1() {
			public void show() {
				System.out.println("Helllllllo");
			}
		}.show();
//		ai.show();
		
	}
}

public class LocalInner {
	public static void main(String args[]) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}
}
