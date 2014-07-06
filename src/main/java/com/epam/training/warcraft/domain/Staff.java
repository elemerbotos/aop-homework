package com.epam.training.warcraft.domain;

public class Staff implements Weapon {
	
	private Integer damage;
	private String name;
	
	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getDamage() {
		return damage;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return "Staff";
	}

}