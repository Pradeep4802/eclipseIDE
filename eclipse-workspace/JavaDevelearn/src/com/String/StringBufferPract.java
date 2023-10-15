package com.String;

import java.util.StringJoiner;

public class StringBufferPract {
	public static void main(String[] args) {
		Object s;
//		String s = "Rajesh";
//		System.out.println(s);
//		System.out.println(s.concat("Patil"));
//		System.out.println(s);
//		System.out.println(s.replace("a", "@"));
//		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("Sagar");
//		System.out.println(sb);
//		System.out.println(sb.append("Sharma"));
//		System.out.println(sb.reverse());
//		System.out.println(sb);
//		System.out.println(sb.charAt(sb.length()-1));
//		System.out.println(sb.length());
//		System.out.println(sb.insert(4, "@#$"));
//		System.out.println(sb.length());
//		System.out.println(sb.substring(6));
//		System.out.println(sb.length());
//		System.out.println(sb.delete(5,8));
//		System.out.println(sb.length());
		
		String x = "Sagar";
		String y = new String("Sagar");
		
		StringBuffer sa1 = new StringBuffer("Raj");
		StringBuffer sa2 = new StringBuffer("Raj");
//		System.out.println("==================");
//		System.out.println(sa1==sa2);
//		System.out.println(sa1.equals(sa2));
//		System.out.println(sa1.equals(sa1));
//		System.out.println(sa1==sa1);
//		System.out.println("==================");

		String demo[]= {"Seema"};
		String xd="Seema";
//		System.out.println(demo[0]==xd);
		
//		System.out.println(x.equals(y));
//		System.out.println(sa1.equals(sa2));
//		System.out.println(sa1.equals(y));
		
		StringJoiner sj = new StringJoiner("-","{","}");
		sj.add("Pradeep");
		sj.add("Suraj");
		sj.add("Abhinay");
		System.out.println(sj);
		
	}
}
