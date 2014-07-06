package com.epam.training.warcraft.domain;

public class Person {
	private Classes myClass;
	private Races myRace;
	private String name;
	private Weapon weapon;
	private Integer healthPoints;

	public Integer getHealthPoints() {
		return healthPoints;
	}



	public void setHealthPoints(Integer healthPoints) {
		this.healthPoints = healthPoints;
	}



	public void setMyClass(Classes myClass) {
		this.myClass = myClass;
	}



	public void setMyRace(Races myRace) {
		this.myRace = myRace;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) throws IllegalArgumentException {
		if (!myClass.doIAcceptThisWeapon(weapon)) {
			throw new IllegalArgumentException("I cannot use this weapon! ");
		}
		this.weapon = weapon;
	}

	public Classes getMyClass() {
		return myClass;
	}

	public Races getMyRace() {
		return myRace;
	}

	public String getName() {
		return name;
	}

	public void Attack(Person person) {
			person.sufferDamage(weapon);
	}

	public boolean isDead() {
		return healthPoints == 0;
	}

	protected void sufferDamage(Weapon weapon2) {
		int damage = (int)(myClass.getResistance(weapon2)
				* myRace.getResistance(weapon2) * ((float) weapon2.getDamage()));
		healthPoints = healthPoints > damage ? healthPoints - damage : 0;
	}

	@Override
	public String toString() {
		return "[ Name: " + name + " weapon:" + weapon.toString() + " ]";
	}
}
