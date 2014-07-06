package com.epam.training.warcraft.domain;

public class Spell implements Weapon{
	private int manaCost;
	private String name;
	private int damage;
	
	public int getManaCost() {
		return manaCost;
	}



	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setDamage(int damage) {
		this.damage = damage;
	}

	public void cast(Person person) {
		person.sufferDamage(this);
	}
	
	public int manaCost() {
		return manaCost;
	}

	public int getDamage() {
		return damage;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return "Spell";
	}
}
