package com.game;

public class Wizard extends Charactor {
//	private String name;
//	private int hp;
	private int mp;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	@Override
	public void attack(Slime slime) {
		// TODO Auto-generated method stub
		// 마법사의 공격을 정의한다.
		System.out.println("마법사 " + name + "이 슬라임 " + slime.getName() + "을 공격했다.");
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public Wizard(String name, int hp, int mp) {
		super();
		this.mp = mp;
	}
	
	
}


