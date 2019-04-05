package com.yr.weapon;

public abstract class Weapon implements Attack {
	private String name;
	private int upgrade;
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUpgrade() {
		return upgrade;
	}
	public void setUpgrade(int upgrade) {
		this.upgrade = upgrade;
	}
	
}
