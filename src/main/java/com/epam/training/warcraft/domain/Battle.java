package com.epam.training.warcraft.domain;

import java.util.List;

public abstract class Battle {
	
	protected List<Person> soldiersFirstSide;
	protected List<Person> soldiersSecondSide;
	private String name;
	
	public abstract void run();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getSoldiersFirstSide() {
		return soldiersFirstSide;
	}

	public void addSoldierToFirstSide(Person soldier) {
		this.soldiersFirstSide.add(soldier);
	}
	
	public void setSoldiersFirstSide(List<Person> soldiers) {
		this.soldiersFirstSide = soldiers;
	}
	
	public List<Person> SoldiersSecondSide() {
		return soldiersSecondSide;
	}

	public void addSoldierToSecondSide(Person soldier) {
		this.soldiersSecondSide.add(soldier);
	}
	
	public void setSoldiersSecondSide(List<Person> soldiers) {
		this.soldiersSecondSide = soldiers;
	}
}
