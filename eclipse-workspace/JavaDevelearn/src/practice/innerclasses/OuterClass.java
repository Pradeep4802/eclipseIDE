package practice.innerclasses;

public class OuterClass {
	private int outerField = 10;

	public void outerMethod() {
		// Local Inner Class
		final int x = 20;
		class LocalInner {
			public void innerMethod() {
				System.out.println("Inner method");
				System.out.println("Accessing outerField: " + outerField + x);
			}
		}

		// Create an instance of the local inner class
		LocalInner inner = new LocalInner();

		// Call the method of the local inner class
		inner.innerMethod();
	}

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
//		LocalInner inner = new LocalInner();
		outer.outerMethod();
	}
}
