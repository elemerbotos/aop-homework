package com.epam.training.warcraft.domain;

public class Spell implements Weapon{
	private final int manaCost;
	private final String name;
	private int damage;
	
	public Spell(int manaCost, String name, int damage) {
		this.manaCost = manaCost;
		this.name = name;
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
