package com.game;

public class Cleric {
	private static final int MAX_HP = 50;  //field 아님
	private static final int MAX_MP = 10;
//	static 선언하기 때문에 성직자 캐릭터가 새로 생기더라도 차지하는 메모리가 추가되지 않는다.
	
	private String name; //field
	private int hp;
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
		System.out.println(hp);
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	public void selfAid() {
		if (mp < 5) {
			return;
		}
		mp -= 5;
		hp = MAX_HP;
		System.out.println("성직자 " + name + "이 Self Aid를 시전했다.");
		System.out.println("성직자 " + name + "의 hp: " + hp + "	mp: " + mp);
	}
	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Cleric(String name) {
//		this.name = name;
//		this.hp = MAX_HP;
//		this.mp = MAX_MP;
		this(name, MAX_HP, MAX_MP);
	}
	
	public Cleric(String name, int hp) {
//		this.name = name;
//		this.hp = hp;
//		this.mp = MAX_MP;
		this(name, hp, MAX_MP);
	}
	
	public void pray(int sec) {
		mp = Math.min(mp + sec, MAX_HP);
	}
}	
