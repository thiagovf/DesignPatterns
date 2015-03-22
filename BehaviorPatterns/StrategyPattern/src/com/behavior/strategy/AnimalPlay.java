package com.behavior.strategy;

public class AnimalPlay {
	public static void main(String[] args) {

		Animal sparky = new Dog();
		Animal tweety = new Bird();

		System.out.println("Dog: " + sparky.tryToFly());

		System.out.println("Bird: " + tweety.tryToFly());

		// This allows dynamic changes for flyingType

		// Tweety broke wing
		tweety.setFlyingAbility(new CantFly());
		System.out.println("Bird: " + tweety.tryToFly());

	}
}
