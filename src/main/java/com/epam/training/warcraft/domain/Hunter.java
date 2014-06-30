package com.epam.training.warcraft.domain;

public class Hunter implements Classes {

private final static String weapons[] = {"Bow"};
private static final float BOWRESIST = 0.8f; 
	
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
		if(weapon2 instanceof Bow) {
			resist = BOWRESIST;
		}
		return resist;
	}

}
