package com.String;

public class AllMethodString {
	public boolean startsWithFunc() {
		String str = "Java is platform independent language.";
		return str.startsWith("Java");
	}
	public boolean endsWithFunc() {
		String str = "Java is platform independent language.";
		return str.endsWith("Java");
	}
	public boolean containsFunc() {
		String str = "Java is platform independent language.";
		return str.contains("independent");
	}
	public boolean equalsFunc() {
		String str1 = "Java is platform independent language.";
		String str2 = "Java is platform independent language.";
		return str1.equals(str2);
	}
	public boolean equalsIgnoreCaseFunc() {
		String str1 = "JavA is plAtforM Independent Language.";
		String str2 = "JaVa is platform indePenDent langUage.";
		return str1.equalsIgnoreCase(str2);
	}
	public int compareToFunc() {
		String str1 = "JavA is plAtforM Independent Language.";
		String str2 = "JaVa is platform indePenDent langUage.";
		return str1.compareTo(str2);
	}
	public int compareToIgnoreCaseFunc() {
		String str1 = "JavA is plAtforM Independent Language.";
		String str2 = "JaVa is platform indePenDent langUage.";
		return str1.compareToIgnoreCase(str2);
	}
	public String toUpperCaseFunc() {
		String str1 = "JavA is plAtforM Independent Language.";
		return str1.toUpperCase();
	}
	public String toLowerCaseFunc() {
		String str1 = "JavA is plAtforM Independent Language.";
		return str1.toLowerCase();
	}
	public String trimFunc() {
		String str1 = "            Reduce The space                 ";
		return str1.trim();
	}
	public char[] toCharArrayFunc() {
		char ch[] = {'P','R','A','D','E','E','P'};
		String str = new String(ch);
		char str1[] = str.toCharArray();
		return str1;
	}
	public String[] splitFunc() {
		String str = "Java#is#a#Programme";
		String ch[] = str.split("#");
		return ch;
	}
	public void getCharsFunc() {
		char[] ch = new char[10];  
		String str = new String("hello javatpoint how r u");   
		str.getChars(6, 16, ch, 0);
		System.out.print("getChars return : ");
		System.out.println(ch);
	}
	public int indexOfFunc() { 
		String str = new String("hello javatpoint how r u");   
		return str.indexOf('j');
	}
	public void formatFunc() { 
		String str = "Pradeep";
		String str2 = String.format("My name is %s", str);
		System.out.println("format str1 : "+str2);
	}
	public String subStringFunc() { 
		String str = "Pradeep is a good boy";
		return str.substring(5,14);
	}
	public String replaceAllFunc() { 
		String str = "Pradeep is a good boy";
		return str.replaceAll("is","are");
	}

	public static void main(String[] args) {
		AllMethodString ams = new AllMethodString();

		// startswith method -- return boolean 
		System.out.println("Starts With 'Java' : "+ams.startsWithFunc());

		// endswith method -- return boolean 
		System.out.println("Ends With 'Java' : "+ams.endsWithFunc());

		// contains method -- return boolean 
		System.out.println("Contains With 'independent' : "+ams.containsFunc());

		// equals method -- return boolean 
		System.out.println("Equals str1 and str2 : "+ams.equalsFunc());

		// equalsIgnoreCase method -- return boolean 
		System.out.println("EqualsIgnoreCase str1 and str2 : "+ams.equalsIgnoreCaseFunc());

		// compateTo method -- return int 
		System.out.println("compareTo str1 and str2 : "+ams.compareToFunc());

		// compareToIgnoreCase method -- return int 
		System.out.println("compareToIgnoreCase str1 and str2 : "+ams.compareToIgnoreCaseFunc());

		// toUpperCase method -- return String 
		System.out.println("toUpperCase of str1  : "+ams.toUpperCaseFunc());

		// toLowerCase method -- return String 
		System.out.println("toLowerCase of str1  : "+ams.toLowerCaseFunc());

		// trim method -- return String 
		System.out.println("trim of str1  : "+ams.trimFunc());

		// toChar method -- return char[] array 
		char ch[] = ams.toCharArrayFunc();
		System.out.print("toChar Array str is : ");
		for (char c : ch) {
			System.out.print(c+" ");
		}
		System.out.println();

		// split method -- return String[] array 
		String str[] = ams.splitFunc();
		System.out.print("Split of str is : ");
		for (String string : str) {
			System.out.print(string+" ");
		}
		System.out.println();

		// getChars method -- return String 
		ams.getCharsFunc();

		// indexOf method -- return int 
		System.out.println("indexOf of str1  : "+ams.indexOfFunc());
		
		// format method -- return String 
		ams.formatFunc();
		
		// substring method -- return String 
		System.out.println("Substring of str1 : "+ams.subStringFunc());
		
		// replaceAll method -- return String 
		System.out.println("replaceAll of str1 : "+ams.replaceAllFunc());
	}
}
