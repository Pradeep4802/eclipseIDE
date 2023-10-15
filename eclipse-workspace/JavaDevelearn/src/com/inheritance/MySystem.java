package com.inheritance;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public final class MySystem {
	static OutputStream fout = new OutputStream() {
		
		@Override
		public void write(int arg0) throws IOException {
			// TODO Auto-generated method stub
			System.out.println(arg0);
		}
	};
	public static PrintStream out = new PrintStream(fout);
}
