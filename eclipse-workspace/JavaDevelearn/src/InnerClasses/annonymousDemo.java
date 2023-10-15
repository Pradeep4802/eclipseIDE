package InnerClasses;

abstract class AC1{
	
	void show() {
		System.out.println("Java");
	}
}

abstract class AC2{
	int i = 10;
	
	void display() {
		System.out.println("Pyhton");
	}
}

abstract class AC3{
	void data() {
		System.out.println("PHP");
	}
	abstract void demo(); 
}

interface PractAnon {
	void dog();
	void lion();
}

class MeraDance {
	MeraDance(int a) {
		System.out.println("Constructor was called " + a);
	}
	void dance() {
		System.out.println("Mera Dance");
	}
}

public class annonymousDemo extends AC1 {

	public static void main(String[] args) {
		
		annonymousDemo a=new annonymousDemo();
		a.show();
		
		new AC2() {
			
		}.display();// annonymous class
		System.out.println("----------------------");
		
		AC3 cd=new AC3() {
			
			void demo() {
				System.out.println("THane ");
			}
		};
		
		cd.demo();		
		cd.data();
		
		System.out.println("------------------------");
		
		PractAnon pa = new PractAnon() {
			public void dog() {
				System.out.println("Dog was Bark");
			}
			public void lion() {
				System.out.println("Lion was honk");
			}
		};
		
		
		
		pa.dog();
		pa.lion();
		
		System.out.println("------------------------");
		MeraDance md = new MeraDance(67) {
			void dance() {
				System.out.println("It is my new dance");
			}
		};
		md.dance();
	}
}
