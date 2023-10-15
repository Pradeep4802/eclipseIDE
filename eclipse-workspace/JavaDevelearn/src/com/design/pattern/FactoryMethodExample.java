package com.design.pattern;

//Abstract Product
interface Product {
 void doSomething();
}

//Concrete Products
class ConcreteProductA implements Product {
 public void doSomething() {
     System.out.println("Concrete Product A does something.");
 }
}

class ConcreteProductB implements Product {
 public void doSomething() {
     System.out.println("Concrete Product B does something.");
 }
}

//Abstract Factory
abstract class Creator {
 abstract Product createProduct();
 
// void operate() {
//     Product product = createProduct();
//     product.doSomething();
// }
}

//Concrete Factories
class ConcreteCreatorA extends Creator {
 Product createProduct() {
     return new ConcreteProductA();
 }
}

class ConcreteCreatorB extends Creator {
 Product createProduct() {
     return new ConcreteProductB();
 }
}

public class FactoryMethodExample {
 public static void main(String[] args) {
     Creator creatorA = new ConcreteCreatorA();
     creatorA.createProduct().doSomething();
//     creatorA.operate(); // Creates and uses ConcreteProductA

     Creator creatorB = new ConcreteCreatorB();
     creatorB.createProduct().doSomething();
//     creatorB.operate(); // Creates and uses ConcreteProductB
 }
}

