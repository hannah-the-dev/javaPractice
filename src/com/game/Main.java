package com.game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("수퍼맨", 100);
		Hero hero1 = new Hero("수퍼맨1", 100);
		Hero hero2 = new Hero("수퍼맨2", 100);
		
		int money = Hero.MONEY;  // 고용돈이라서 static 이고, 모두가 같이 쓰는 돈이라 hero2도 1도 아님
		
		
		
		Slime slime = new Slime("슬라임1", 50);
//		Slime slime2 = new Slime("슬라임2", 50);
		
//		hero.attack(slime1);
		
		
		Cleric cleric1 = new Cleric("스님"); 
		Cleric cleric2 = new Cleric("신부님", 100); 
		Cleric cleric3 = new Cleric("수녀님", 70, 30); 
		
		cleric1.setHp(30);
		cleric1.selfAid();
		
		SuperHero superHero = new SuperHero("아이언 맨", 100);
		
		superHero.fly();
		superHero.attack(slime);
		
//		Charactor chr = new Charactor();  //상속 불가
		Wizard wizard = new Wizard("wizard", 20, 50);
		wizard.attack(slime);
	}
}


