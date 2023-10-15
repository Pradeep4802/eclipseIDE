package com.design.pattern;

interface Character {
	void attack();
	void move();
}

abstract class BaseCharacter implements Character {
	abstract void specialAttack();
	abstract void castSpell();
}

class Warrior extends BaseCharacter {
	public void attack() {
		System.out.println("Warrior Attack");
	}
	public void move() {
		System.out.println("Warrior Move");
	}
	void specialAttack() {
		System.out.println("Warrior Special Attack");
	}
	void castSpell() {
		System.out.println("Warrior Cast Spell");
	}
}

class Mage extends BaseCharacter {
	public void attack() {
		System.out.println("Mage Attack");
	}
	public void move() {
		System.out.println("Mage Move");
	}
	void specialAttack() {
		System.out.println("Mage Special Attack");
	}
	void castSpell() {
		System.out.println("Mage Cast Spell");
	}
}

abstract class CharacterFactory {
	abstract Character createCharacter();
	abstract BaseCharacter createBase();
}

class WarriorFactory extends CharacterFactory  {
	Character createCharacter() {
		return new Warrior();
	}
	BaseCharacter createBase() {
		return new Warrior();
	}
}
class MageFactory extends CharacterFactory {
	Character createCharacter() {
		return new Mage();
	}
	BaseCharacter createBase() {
		return new Mage();
	}
}

public class MainFight {
	public static void main(String[] args) {
		CharacterFactory cf1 = new WarriorFactory();
		Character w1 = cf1.createCharacter();
		BaseCharacter m1 = cf1.createBase();
		w1.attack();
		w1.move();
		m1.specialAttack();
		m1.castSpell();
		System.out.println("-------------------------------------");
		CharacterFactory cf2 = new MageFactory();
		Character w2 = cf2.createCharacter();
		BaseCharacter m2 = cf2.createBase();
		w2.attack();
		w2.move();
		m2.specialAttack();
		m2.castSpell();
	}
}
