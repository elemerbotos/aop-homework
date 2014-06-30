package com.epam.training.warcraft.domain;

public class Person {
	private final Classes myClass;
	private final Races myRace;
	private String name;
	private Weapon weapon;
	private Integer healthPoints;

	protected Person(Classes myClass, Races myRace, String name,
			Integer healthPoints) {
		this.myClass = myClass;
		this.myRace = myRace;
		this.name = name;
		this.healthPoints = healthPoints;
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
		if(!tryToCastASpell(person)) {
			person.sufferDamage(weapon);
		}
	}
	
	public boolean tryToCastASpell(Person person) {
		try {
			((MagicUser) myClass).castASpell(person);
			return true;
		} catch (IllegalArgumentException|ClassCastException e) {
			return false;
		}
	}


	public boolean isDead() {
		return healthPoints == 0;
	}

	protected void sufferDamage(Weapon weapon2) {
		int damage = (int)(myClass.getResistance(weapon2)
				* myRace.getResistance(weapon2) * ((float) weapon2.getDamage()));
		healthPoints = healthPoints >= damage ? healthPoints - damage : 0;
	}

	@Override
	public String toString() {
		return "[ Name: " + name + " weapon:" + weapon.toString() + " ]";
	}
}
