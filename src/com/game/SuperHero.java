package com.game;

public class SuperHero extends Hero {
	// field 추가
	private boolean isFlying;
	//superclass인 Hero를 상속받아서 그 생성자를 동일하게 가져온다.
	public SuperHero(String name, int hp) {
		super(name, hp);
		// TODO Auto-generated constructor stub
	}
	
	public void fly() {
		isFlying = true;
	}
	
	
	public void land() {
		isFlying = false;
	}

	@Override
	public void attack(Object enemy) {
		// TODO Auto-generated method stub
		super.attack(enemy);
		if (isFlying) {
			System.out.println("꿀밤 한대 더!");
			super.attack(enemy);
		}
	}
	
	
	
}
