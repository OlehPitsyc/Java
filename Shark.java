package com.qagroup.lec2oop;

public class Shark extends Animal {
	public Shark() {
		super("Shark");
	}

	@Override // переписує(переозначаю, копіюю) метод із батьківського класу
	public void move() {
		System.out.println(getName() + " can swim!");
	}

	@Override
	public void giveVoice() {
		System.out.println(getName() + " silent");
	}
}