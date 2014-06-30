package com.epam.training.warcraft.domain;

public class Sword implements Weapon {

	private int damage;
	private String name;
	
	public Sword(int damage, String name) {
		this. damage = damage;
		this.name = name;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public String getType() {
		return "Sword";
	}

	public String getName() {
		return name;
	}

}
