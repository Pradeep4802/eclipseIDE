package Interface;

public class InterfaceRules implements Suraj{
	public void age() {
		System.out.println("Age is 21");
	}
	public void style() {
		System.out.println("Suraj is ");
	}
	
	public static void main(String args[]) {
		InterfaceRules ir = new InterfaceRules();
		ir.age();
		ir.style();
	}
}
