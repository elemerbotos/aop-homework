package com.epam.training.warcraft.domain;

import java.util.HashSet;


public class Mage extends MagicUser {

	private final static String weapons[] = {"Staff"}; 
	
	public boolean doIAcceptThisWeapon(Weapon weapon) {
		boolean accept = false;
		String weaponName = weapon.getType();
		for(String name : weapons) {
			accept |= name.equals(weaponName);
		}
		return accept;
	}

	public float getResistance(Weapon weapon2) {
		return 1f;
	}

	@Override
	public void castSpell(Person person, Spell spell) {
		if(hasMoreManaThan(spell.manaCost())) {
			spell.cast(person);
			useMana(spell.manaCost());
		} else {
			throw new IllegalArgumentException("Not enough mana! ");
		}
		
	}

	@Override
	public void castASpell(Person person) {
		if(spells.isEmpty()) {
			throw new IllegalArgumentException("No known spell! ");
		}
		castSpell(person, selectRandomeSpell());
	}

	@Override
	public void initSpellSet() {
		spells = new HashSet<>();	
	}

}