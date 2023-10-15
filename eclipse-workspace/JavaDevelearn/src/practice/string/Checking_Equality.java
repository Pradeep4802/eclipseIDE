package practice.string;

public class Checking_Equality {
	public static void main(String[] args) {
		String name = "hello";
		String name1 = "hello";
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println(str1 == str2); // false (references to different objects)
		System.out.println(name == str1);
		System.out.println(name == name1);
		
		int i = 10;
		String value = "";
		String val = String.valueOf(i);
		System.out.println(val);
		
		String str = "Welcome TO JAva World";
//		System.out.println(String.swapCase(str));
	}
}
