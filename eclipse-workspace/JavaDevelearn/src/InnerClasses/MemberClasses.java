package InnerClasses;

public class MemberClasses {
	static int b=78;
	int a=45;
	void demo() {
		System.out.println("KALA");
	}
	class MInner {  // Member Inner Class
		int c=70;
		protected void show() {
			System.out.println(a+b+c);
			System.out.println("Developer");
			data();
			demo();
		}	
	}

	static void data() {
		System.out.println("Mala");
	}

	void call() {
		MInner m=new MInner();
		m.show();
	}

	public static void main(String[] args) {
		MemberClasses b=new MemberClasses();
		b.call();
//		b.show();
		System.out.println("-------------------");

		MInner mv=b.new MInner();
		mv.show();

		System.out.println("-------------------");
		MInner mx=new MemberClasses().new MInner();
		mx.show();

	}
}
