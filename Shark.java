package com.qagroup.lec2oop;

public class Shark extends Animal {
	public Shark() {
		super("Shark");
	}

	@Override // ��������(�����������, �����) ����� �� ������������ �����
	public void move() {
		System.out.println(getName() + " can swim!");
	}

	@Override
	public void giveVoice() {
		System.out.println(getName() + " silent");
	}
}