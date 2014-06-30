package com.epam.training.warcraft.domain;

import java.util.Iterator;

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
		if(getMana()>spell.manaCost()) {
			spell.cast(person);
			mana -= spell.manaCost();
		} else {
			throw new IllegalArgumentException("Not enough mana! ");
		}
		
	}

	@Override
	public void castASpell(Person person) {
		if(spells.isEmpty()) {
			throw new IllegalArgumentException("No known spell! ");
		}
		Spell spell = null;
		int index = (int)(Math.random() * (float)spells.size());
		Iterator<Spell> iter = spells.iterator();
		for(int i = 0 ; i < index && iter.hasNext() ; ++i) {
			iter.next();
		}
		castSpell(person, iter.next());
	}
}