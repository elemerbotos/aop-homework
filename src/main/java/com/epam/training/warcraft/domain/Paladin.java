package com.epam.training.warcraft.domain;

public class Paladin implements Classes {

private final static String weapons[] = {"Sword"}; 
	
	public boolean doIAcceptThisWeapon(Weapon weapon) {
		boolean accept = false;
		String weaponName = weapon.getType();
		for(String name : weapons) {
			accept |= name.equals(weaponName);
		}
		return accept;
	}

	public float getResistance(Weapon weapon2) {
		float resist = 1f;
		if(weapon2 instanceof Sword) {
			resist = 0.8f;
		}
		return resist;
	}

}
