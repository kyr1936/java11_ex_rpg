package com.yr.pc;

import java.util.ArrayList;
import java.util.Stack;

import com.yr.weapon.Stick;
import com.yr.weapon.Sword;

public class RpgMain {

	public static void main(String[] args) {
		Worrier w = new Worrier();
		Magition m = new Magition();
		
	/*	ArrayList<Hero> ar = new ArrayList<Hero>();
		ar.add(w);
		ar.add(m);
		*/
		Sword s = new Sword();
		//칼 속성 부여
		s.setName("단검");
		s.setDamage(10);
		s.setUpgrade(0);
		Stick st = new Stick();
		st.setName("나무지팡이");
		/*
		//전사에게 칼 장착
		w.setWeapon(s);
		
		w.getWeapon().attack();
		w.setWeapon(st);
		w.getWeapon().attack();
		*/
		w.setAttack(s);
		w.getAttack().attack();
		

	}

}
