package com.design.pattern;

interface Products {
	void create();
}

class ConcreteProdA implements Products {
	public void create() {
		System.out.println("This is first 1st create Method");
	}
}

class ConcreteProdB implements Products {
	public void create() {
		System.out.println("This is Second 2nd create Method");
	}
}

abstract class Creat {
	abstract Products createCreator();
}

class ConcreteA extends Creat {
	public Products createCreator() {
		return new ConcreteProdA();
	}
}
class ConcreteB extends Creat {
	public Products createCreator() {
		return new ConcreteProdB();
	}
}

public class Main {
	public static void main(String[] args) {
		Creat ca = new ConcreteA();
//		Products p1 = ca.createCreator();
		ca.createCreator().create();
		System.out.println("--------------------------------");
		ConcreteB cb = new ConcreteB();
		Products p2 = cb.createCreator();
		p2.create();
	}
}
