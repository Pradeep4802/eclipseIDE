package com.inheritance;

public class ReturnObject {
	public ReturnObject() {
		System.out.println("King Of Cricket : " + "King Kohli");
	}
	public ReturnObject(String name) {
		System.out.println("King OF FootBall : " + name);
	}
	public String show() {
		return "Show was Called";
	}

	public ReturnObject objectInit() {
		ReturnObject ro = new ReturnObject();
		return new ReturnObject();
	}

	public int returnInt(ReturnObject ro) {
		otherMethod();
		System.out.println(ro);
		return 105;
	}

	public void otherMethod() {
		objectInit();
		new ReturnObject("RONALDO");
	}

	public static void main(String[] args) {
		ReturnObject ro1 = new ReturnObject();  // King of Cricket : King Kohli
		ro1.show();  // This line will not print anything
		System.out.println(ro1.returnInt(new ReturnObject()));  
		// King of Cricket : King Kohli
		// King of FootBall : RONALDO
		// hashCode of class
		// 105
	}

}
