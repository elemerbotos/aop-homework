package com.epam.training.warcraft.domain;

public class Bow implements Weapon{

	private int damage;
	private String name;
	
	public Bow(int damage, String name) {
		this. damage = damage;
		this.name = name;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public String getType() {
		return "Bow";
	}
	
	public String getName() {
		return name;
	}

}
