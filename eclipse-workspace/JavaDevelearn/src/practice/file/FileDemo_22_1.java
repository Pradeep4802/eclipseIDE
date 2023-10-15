package practice.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FileDemo_22_1 {

	public void fileWriteMode1() throws IOException {
		Scanner sc = new Scanner(System.in);
		String loc = "/home/pradeepkumar/Desktop/JavaFile/NewOutput.txt";
		FileOutputStream fout = new FileOutputStream(loc);
		System.out.println("Enter the Text : ");
		String str = sc.nextLine();
		fout.write(str.getBytes());
		fout.write(10);
		//		fout.write(10);
	}

	public void fileReadMode1() throws IOException {
		String loc = "/home/pradeepkumar/Desktop/JavaFile/NewOutput.txt";
		FileInputStream fin = new FileInputStream(loc);
		int i = 0;
		while((i = fin.read()) != -1) {
			System.out.print((char)i);
		}

		System.out.println(fin.read());
	}

	public void fileWriter1() throws IOException {
		String loc = "/home/pradeepkumar/Desktop/JavaFile/readDemo.txt";
		FileWriter fin = new FileWriter(loc);
		String name = "My Name is Manish";
		fin.write(name);
		System.out.println("Success");
		fin.close();
	}

	public void fileReader1() throws IOException {
		String loc = "/home/pradeepkumar/Desktop/JavaFile/readDemo.txt";
		FileReader fin = new FileReader(loc);
		
		System.out.println(fin.read());
		
		fin.close();
	}

	public static void main(String[] args) throws IOException {
		FileDemo_22_1 fd = new FileDemo_22_1();
		//		fd.fileWriteMode1();
		//		fd.fileReadMode1();
		fd.fileWriter1();
	}
}
