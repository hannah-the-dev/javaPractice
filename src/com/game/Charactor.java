package com.game;

public abstract class Charactor {
	protected String name;
	protected int hp;
		
	
	public void run() {
		System.out.println("뛰었다");  // 추상클래스에 추상이 아닌 매서드 가능
	}
	public abstract void attack(Slime slime);
	}
