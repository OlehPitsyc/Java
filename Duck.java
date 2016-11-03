package com.qagroup.lec2oop;

public class Duck extends Animal {
	public Duck() {
		super("Duck");
	}

	@Override
	public void move() {
		System.out.println(getName() + " can fly!");
	}

	@Override
	public void giveVoice() {
		System.out.println(getName() + " cria");
	}
}