package com.game;

public class Slime {
	private String name;
	private int hp;
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
	public Slime(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
}
