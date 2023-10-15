package com.file.handle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class FilePattern1 {
	public void patter1() throws IOException {
		String  loc = "/home/pradeepkumar/Desktop/JavaFile/pattern1.txt";
		
		
		FileOutputStream fout = new FileOutputStream(loc);
		for(int i = 1;i <= 3; i++) {
			for(int j=5; j > i; j--) {
				fout.write(32);
			}
			for(int j = i;j >= 1; j--) {
				fout.write(42);
				fout.write(32);
			}
			fout.write(10);
		}
		for(int i = 1;i <= 5; i++) {
			for(int j=5; j > i; j--) {
				fout.write(32);
			}
			for(int j = i;j >= 1; j--) {
				fout.write(42);
				fout.write(32);
			}
			fout.write(10);
		}
	}

	public static void main(String[] args) throws IOException {
		FilePattern1 fp1 = new FilePattern1();
		fp1.patter1();
	}
}
