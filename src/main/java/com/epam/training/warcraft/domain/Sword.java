package com.epam.training.warcraft.domain;

public class Sword implements Weapon {

	private int damage;
	private String name;
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void setName(String name) {
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
