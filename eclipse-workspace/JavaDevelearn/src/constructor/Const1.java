package constructor;

public class Const1 {
	int id;
	String name;
	
	public Const1() {
		System.out.println("Zero Constructor Called");
	}
	
	public Const1(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	public Const1(String n,int i) {
		id = i;
		name = n;
		System.out.println("Para second constructor Called...");
	}
	
	public void show() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String args[]) {
		Const1 s = new Const1();
		s.show();
		
		Const1 sd = new Const1(1,"Pradeep");
		sd.show();
		
//		Const1 sd = new Const1("Pradeep",1);
//		sd.show();
	}
}
