package com.yr.pc;

import com.yr.weapon.Stick;

public class Magition extends Hero{
	
	private int mp;      // Hero 에서 추가로 들어가는 변수
	private Stick stick;

	public Stick getStick() {
		return stick;
	}

	public void setStick(Stick stick) {
		this.stick = stick;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}       
}
