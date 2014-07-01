package com.epam.training.warcraft.domain;

import java.util.Iterator;
import java.util.Set;

public abstract class MagicUser implements Classes {

	private static final int MAXMANA = 100;
	protected Set<Spell> spells;
	protected int mana;
	
	public MagicUser() {
		mana = MAXMANA;
	}
	
	public abstract void initSpellSet();
	
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
	
	protected boolean hasMoreManaThan(int manaCost) {
		return mana>manaCost;
	}
	
	protected Spell selectRandomeSpell() {
		int index = (int)(Math.random() * (float)spells.size());
		Iterator<Spell> iter = spells.iterator();
		for(int i = 0 ; i < index && iter.hasNext() ; ++i) {
			iter.next();
		}
		return iter.next();
	}
	
	protected void useMana(int manaCost) {
		mana -= manaCost;
	}

}
