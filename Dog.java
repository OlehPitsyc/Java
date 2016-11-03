package com.qagroup.lec2oop;

public class Dog extends Animal {
	public Dog() {
		super("Dog");
	}

	@Override
	public void move() {
		System.out.println(getName() + " can run!");
	}

	@Override
	public void giveVoice() {
		System.out.println(getName() + " gav");
	}
}
