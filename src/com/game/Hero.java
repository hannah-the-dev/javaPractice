package com.game;

public class Hero {
	public static int MONEY = 100; // 공용돈임
	
	
	private String name;
	private int hp;
	private Sword sword;
	
	
	public Sword getSword() {
		return sword;
	}
	public void setSword(Sword sword) {
		this.sword = sword;
	}
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
	public Hero(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		if (hp != other.hp)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}
	public void attack(Object enemy) {
	if (sword == null) {
		System.out.println(name + "이 " + enemy.getClass().getName().toString()+"을 주먹으로 공격했다.");
	} else {
		System.out.println(name + "이 " + enemy.getClass().getName().toString()+"을 칼 "+ sword +"로 공격했다.");
		
	}
	}

	

}
