package com.epam.training.warcraft.domain;

import java.util.HashSet;
import java.util.Set;

public abstract class MagicUser implements Classes {

	private static final int MAXMANA = 100;
	protected Set<Spell> spells;
	protected int mana;
	
	MagicUser() {
		spells = new HashSet<Spell>();
		mana = MAXMANA;
	}
	
	public abstract void castSpell(Person person, Spell spell);
	
	public abstract void castASpell(Person person);
	
	public void learnSpell(Spell spell) {
		if(!spells.add(spell)){
			throw new IllegalArgumentException("Spell already known! ");
		}
	}

	public int getMana() {
		return mana;
	}
	
	public void restoreMana(int mana) {
		int newMana = mana + this.mana;
		this.mana = newMana > MAXMANA ? MAXMANA : newMana;
	}

}
