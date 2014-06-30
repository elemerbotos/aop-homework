package com.epam.training.warcraft.domain;

public class NightElves implements Races {

	private static final float BOWRESIST = 0.75f;

	public float getResistance(Weapon weapon2) {
		float resist = 1f;
		if(weapon2 instanceof Bow) {
			resist = BOWRESIST;
		}
		return resist;
	}

}
