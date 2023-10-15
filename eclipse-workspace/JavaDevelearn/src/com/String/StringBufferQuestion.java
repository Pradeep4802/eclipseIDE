package com.String;

public class StringBufferQuestion {
	private static void modifyString(StringBuffer strBuf, String str) {
        strBuf.append(str);
        str = "New World";
    }
	private static void modifyString(StringBuffer strBuf) {
        strBuf.append(" Modified");
        strBuf = new StringBuffer("New StringBuffer");
    }
	
	public static void mod(StringBuffer str) {
		str.append(" Yadav");
		str = new StringBuffer("Abhinay");
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// Question 1
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = sb1;

		sb1.append(" World");
		sb1 = new StringBuffer("New");
		StringBuffer sb3 = sb1;
		//        System.out.println(sb2);
		//        System.out.println(sb3);

		sb1.append(" MyWorld");
		sb3.append("Galaxy");
		//        System.out.println(sb3);
		//        System.out.println(sb1);

		//        Question 2:
		StringBuffer sb = new StringBuffer("Initial");
		System.out.println(sb);
        modifyString(sb);
        System.out.println(sb);
        StringBuffer str = sb;
        str.insert(4, "*&&^%");
        System.out.println(sb);
        System.out.println(str);
        
        System.out.println("---------------------------------");
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = str1;
        System.out.println(str1);
        str2.insert(1,"a");
        System.out.println(str1);
        str1 = new StringBuffer("Abhinay");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("------------------------------------");
        StringBuffer stf = new StringBuffer("Suraj");
        System.out.println(stf);
        mod(stf);
        System.out.println(stf);
        
        // question 3
        System.out.println("------------------------------------");
        StringBuffer s1 = new StringBuffer("Hello");
        String st1 = " World";
        modifyString(s1, st1);
        System.out.println(s1);
        System.out.println(st1);
        System.out.println("------------------------------------");
        
        // Question 4
	}
}
