package com.design.pattern;

class FCDemo {
	public void display() {
		System.out.println("Good morning");
	}

	public void data() {
		System.out.println("Might be return object");
	}
}

abstract class MyDemo {
	public void show() {
		System.out.println("This is show method");
	}
	public void demo() {
		System.out.println("This is demo emthod");
	}
}

abstract class MyDemo2 {
	abstract void clean();
	abstract void clear();
	public void show() {
		System.out.println("This is show method");
	}
	public void demo() {
		System.out.println("This is demo emthod");
	}
}

interface Demo1 {
	void dest1();
	void dest2();
}

interface Demo2 {
	void dest3();
	void dest4();
}

class ConcreteDemo2 implements Demo2 {
	public void dest3() {
		System.out.println("Interface dest3");
	}
	public void dest4() {
		System.out.println("Interface dest4");
	}
}

public class FactoryDemo {
	Demo2 concreteDemo2() {
		return new ConcreteDemo2();
	}
	
	// This factory method is returning Demo1 interface object by anonymous
	Demo1 retDemo1() {
		return new Demo1() {
			public void dest1() {
				System.out.println("Interface dest1");
			}
			public void dest2() {
				System.out.println("Interface dest2");
			}
		};
	}

	FCDemo fcDemo() {
		FCDemo fc1 = new FCDemo();
		return fc1;
	}

	FCDemo fcDemo1() {
		return new FCDemo();
	}

	MyDemo secondObject() 
	{
		return new MyDemo() {};
	}

	MyDemo2 absObject() {
		return new MyDemo2() {
			public void clean() {
				System.out.println("Cleaner was used");
			}
			public void clear() {
				System.out.println("Clear was cleared");
			}
		};
	}
	public static void main(String[] args) {
		FCDemo fc = new FCDemo();
		fc.display();
		fc.data();
		System.out.println("----------------------------");
		FactoryDemo fd = new FactoryDemo();
		fd.fcDemo().display();
		fd.fcDemo().data();
		System.out.println("----------------------------");
		FactoryDemo fd1 = new FactoryDemo();
		fd1.fcDemo1().display();
		fd1.fcDemo1().data();
		System.out.println("----------------------------");
		MyDemo md = fd.secondObject();
		md.show();
		md.demo();
		System.out.println("----------------------------");
		MyDemo2 md2 = fd1.absObject();
		md2.clean();
		md2.clear();
		System.out.println("----------------------------");
		FactoryDemo de = new FactoryDemo();
		de.retDemo1().dest1();
		de.retDemo1().dest2();
		System.out.println("----------------------------");
		FactoryDemo fd2 = new FactoryDemo();
		fd2.concreteDemo2().dest3();
		fd2.concreteDemo2().dest4();
	}
}
