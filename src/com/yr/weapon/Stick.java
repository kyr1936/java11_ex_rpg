package com.yr.weapon;

public class Stick extends Weapon{
	private int power;

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void spell () {
		System.out.println("주문을 외움");
	}

	@Override
	public void attack() {
		this.spell();
		
	}
	
	
}
