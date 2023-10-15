package com.file.handle;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo1 {
	
	public void fileHandle1() throws IOException {
		String  loc = "/home/pradeepkumar/Desktop/JavaFile/demo.txt";
		FileOutputStream file = new FileOutputStream(loc);
		file.write(65);
		byte by[] = {65,90,67,45,34,89,99,102 	 };
		file.write(by);
		String name = "My Name is Pradeep";
		file.write(name.getBytes());
		file.close();
		System.out.println("Success");
	}
	
	public void fileRead() throws IOException {
		String  loc = "/home/pradeepkumar/Desktop/JavaFile/demo.txt";
		FileInputStream filein = new FileInputStream(loc);
		System.out.println(filein.read());
		int i = 0;
		while((i = filein.read()) != -1) {
			System.out.print((char)i);
		}
		System.out.println();
		filein.close();
	}
	
	public static void main(String[] args) throws IOException {
		FileDemo1 file1 = new FileDemo1();
//		file1.fileHandle1();
		file1.fileRead();
	}
}
