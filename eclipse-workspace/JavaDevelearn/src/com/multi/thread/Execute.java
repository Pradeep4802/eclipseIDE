package com.multi.thread;
//import java.util.*;

public class Execute {
	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		Husband h = new Husband(b1);
		Wife w = new Wife(b1);
		h.start();
		w.start();
		
	}
}
