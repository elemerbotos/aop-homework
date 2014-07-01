package com.epam.training.warcraft.domain;

import java.util.List;

public abstract class Battle {
	
	private List<Person> soldiers;
	private String name;
	
	public Battle() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getSoldiers() {
		return soldiers;
	}

	public void addSoldier(Person soldier) {
		this.soldiers.add(soldier);
	}
	
	public void setSoldiers(List<Person> soldiers) {
		this.soldiers = soldiers;
	}
}
