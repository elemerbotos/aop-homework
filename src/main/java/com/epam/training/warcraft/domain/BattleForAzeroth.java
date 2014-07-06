package com.epam.training.warcraft.domain;

import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattleForAzeroth extends Battle {

	private static final Logger LOGGER = LoggerFactory.getLogger(BattleForAzeroth.class);
	
	public BattleForAzeroth() {
		setName("Battle for Azeroth");
		soldiersFirstSide = new ArrayList<>();
		soldiersSecondSide = new ArrayList<>();
	}
	
	@Override
	public void run() {
		LOGGER.info(getName() + " started! ");
		int sizeFirst = soldiersFirstSide.size();
		int sizeSecond = soldiersSecondSide.size();
		
		int first = 0;
		int second = 0;
		
		while(first < sizeFirst && second < sizeSecond) {
			Person firstSoldier = soldiersFirstSide.get(first);
			Person secondSoldier = soldiersSecondSide.get(second);
			duel(firstSoldier, secondSoldier);
			if(firstSoldier.isDead()) {
				++first;
			}
			if(secondSoldier.isDead()) {
				++first;
			}
		}
		
		logTheResultsOfTheBattle(sizeFirst, sizeSecond, first, second);
	}

	private void logTheResultsOfTheBattle(int sizeFirst, int sizeSecond,
			int first, int second) {
		if(first == sizeFirst && second == sizeSecond) {
			LOGGER.info("Battle has finished! There is no winner!");
		} else {
			if(first == sizeFirst) {
				LOGGER.info("Battle has finished! Second team won!");
			} else {
				LOGGER.info("Battle has finished! First team won!");
			}
		}
	}

	private void duel(Person firstSoldier, Person secondSoldier) {
		while(!firstSoldier.isDead() && !secondSoldier.isDead()) {
			
			if(Math.random() < 0.5f) {
				firstSoldier.Attack(secondSoldier);
				retaliate(firstSoldier, secondSoldier);
			} else {
				secondSoldier.Attack(firstSoldier);
				retaliate(secondSoldier, firstSoldier);
			}

		}
	}

	private void retaliate(Person firstSoldier, Person secondSoldier) {
		if(!secondSoldier.isDead()) {
			secondSoldier.Attack(firstSoldier);
		}
	}
}
