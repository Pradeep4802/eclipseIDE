package com.String;

public class StringQuestion {

	public static String question1(String str) {
		String s = "";
		//		int k = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}
	public static String question2(String str) {
		String s = "";
		int pos=str.indexOf(" ");
		int len = str.length();

		for (int i = pos+1; i < len; i++) {
			s += str.charAt(i);
		}
		s += " ";
		for (int i = 0; i < pos; i++) {
			s += str.charAt(i);
		}
		return s;
	}

	public static String question3(String str) {
		String s = "";
		int pos=str.indexOf(" ");
		int len = str.length();

		for (int i = pos-1; i >= 0; i--) {
			s += str.charAt(i);
		}
		s += " ";
		for (int i = len-1; i >= pos+1; i--) {
			s += str.charAt(i);
		}
		return s;
	}
	public static String question4(String str) {
		String s = "";
		int len = str.length();
		char ch[] = new char[len];
		String str1 = str.toLowerCase();
		String s1[] = str1.split(" ");


		for (String string : s1) {
			//			char so = string.charAt(0);
			//			String st = String.valueOf(so);
			String st = string.substring(0,1).toUpperCase();
			s += st.toUpperCase()+string.substring(1)+" ";			
		}
		return s;
	}
	public static String question5(String str) {
		String s = "";
		int len = str.length();
		char ch[] = new char[len];
		String str1 = str.toUpperCase();
		String s1[] = str1.split(" ");


		for (String string : s1) {
			String st = string.substring(0,1).toLowerCase();
			s += st.toLowerCase()+string.substring(1)+" ";			
		}
		String sss = "Python Codes";
		System.out.println(sss.substring(2,8));
		return s;
	}
	public static String question6(String str) {
		String s = "";
		int len = str.length();
		int pos = str.indexOf("@");
		s = str.substring(0,pos);
		return s;
	}
	public static String question7(String str) {
		String s = "";
		int len = str.length();
		int pos = str.indexOf("@");
		s = str.substring(pos,len);
		return s;
	}
	public static void question8(String str) {
		String s = "";
		int k = 0;
		for (int i = str.length(); i > 0; i--) {
			s += str.charAt(i-1);
		}
		if(s.equals(str)) {
			System.out.println(str + " is a palindrome.");
		}else {			
			System.out.println(str + " is not a palindrome.");
		}
	}
	public static void question9(String str) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if((a==65||a==97)||(a==69||a==101)||(a==73||a==105)||(a==79||a==111)||(a==85||a==117)) {
				s += a+" ";
			}
		}
		System.out.println("Vowels are : "+s);
	}

	public static void main(String[] args) {
		//Question 1: Take any string from user or Reverse the string like eg: "Java" output: avaJ
		System.out.println("Reverse of 'Java' : "+question1("Java"));
		//Question 2: Take any string from user or Reverse the string like eg: "Python Codes" output: "Codes Python"
		System.out.println("Reverse of 'Python Codes' : "+question2("Python Codes"));
		//Question 3: Take any string from user or Reverse the string like eg: "Java Codes" output: "avaJ redoc"
		System.out.println("Reverse of 'Java Coder' : "+question3("Java Coder"));
		//Question 4: Take any string from user or Print in title format like eg: "SaGAr Mahajan" output: "Sagar Mahajan"
		System.out.println("Reverse of 'SaGAr Mahajan' : "+question4("SaGAr MahaJan maHESh duRGesh"));
		//Question 5 Input : "Rajesh arora" output : rAJESH aRORA
		System.out.println("Reverse of 'Rajesh arora' : "+question5("Rajesh arora"));
		// Question 6 Input : "sagar123@gmail.com" Output : "sagar123
		System.out.println("Username of Gmail : "+question6("sagar123@gmail.com"));
		// Question 7 Input : "sagar123@gmail.com" Output : "sagar123
		System.out.println("Domain name of Gmail : "+question7("sagar123@gmail.com"));
		// Question 8 : palindrome string find
		question8("madam");
		// Question 9 : print vowel from string
		question9("Hi Good Morning Guys Element of science that you want to explore A Lord Of Science MaO!");
	}
}
