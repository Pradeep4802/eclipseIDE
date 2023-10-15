package Interface;

interface DefaultInter {
	default void dance() {
		System.out.println("Hi I am dancing");
	}
	static void tracking() {
		System.out.println("Tracking Active");
	}
	void dotBatch();
	void supremeBatch();
}

interface Miniture1 extends DefaultInter {
	public default void dance() {
		System.out.println("This is overrided method of abstract");
	}
}

public class DefaultInterface implements Miniture1 {
	public void dotBatch() {
		System.out.println("Dot Batch was designed");
	}
	public void supremeBatch() {
		System.out.println("Supreme Batch was Designed");
	}
	public void dance() {
		System.out.println("Dance was acquired");
	}
	public static void main(String[] args) {
		DefaultInterface di = new DefaultInterface();
		di.dotBatch();
		di.supremeBatch();di.dance();
	}
}
