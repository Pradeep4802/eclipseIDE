package practice.exception;

public class FInallyDemo_23_1 {
	public static void main(String[] args) {
		try {
			//			int a = 12/0;
			//			System.out.println(a);
			String data = null;

			if (data == null) {
				throw new NullPointerException("Data cannot be null");
			}
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally executed");
		}

		System.out.println("Pradeep Was present");
	}
}
