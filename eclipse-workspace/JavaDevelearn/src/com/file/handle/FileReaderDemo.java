package com.file.handle;

import java.io.*;

public class FileReaderDemo {
	public void FileReader1() throws IOException {
		String loc = "/home/pradeepkumar/Desktop/JavaFile/NewText.txt";
		try (FileWriter fw1 = new FileWriter(loc)) {
			fw1.write('A');
			fw1.write('B');	
			fw1.write('C');
		}
		System.out.println("Success");
	}
	
	public void fileReader() throws IOException {
		String loc = "/home/pradeepkumar/Desktop/JavaFile/NewText.txt";
		FileReader fr = new FileReader(loc);
		System.out.println(fr.read());
		System.out.println(fr.read());
	}
	
	public static void main(String[] args) throws IOException {
		FileReaderDemo fd = new FileReaderDemo();
		fd.FileReader1();
		fd.fileReader();
	}
}
