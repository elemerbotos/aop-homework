package com.epam.training.warcraft.domain;

public class Orcs implements Races {

	private static final float SWORDRESIST = 0.9f;
	private static final float BOWRESIST = 0.9f;

	public float getResistance(Weapon weapon2) {
		float resist = 1f;
		if(weapon2 instanceof Bow) {
			resist = BOWRESIST;
		}
		if(weapon2 instanceof Sword) {
			resist = SWORDRESIST;
		}
		return resist;
	}

}
