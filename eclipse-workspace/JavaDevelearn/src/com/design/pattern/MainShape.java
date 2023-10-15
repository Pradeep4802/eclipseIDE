package com.design.pattern;

interface Shape {
	void shape();
}

class Circle implements Shape {
	public void shape() {
		System.out.println("Circle Shape");
	}
}
class Rectangle implements Shape {
	public void shape() {
		System.out.println("Rectangle Shape");
	}
}

abstract class ShapeFactory {
	abstract Shape createFactory();
}

class CircleShapeFactory extends ShapeFactory {
	Shape createFactory() {
		return new Circle();
	}
}
class RectangleShapeFactory extends ShapeFactory {
	Shape createFactory() {
		return new Rectangle();
	}
}

public class MainShape {
	public static void main(String[] args) {
		ShapeFactory sf1 = new CircleShapeFactory();
		sf1.createFactory().shape();
		System.out.println("------------------------------------");
		ShapeFactory sf2 = new RectangleShapeFactory();
		sf2.createFactory().shape();
	}
}
