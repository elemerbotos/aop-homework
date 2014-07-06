package com.epam.training.warcraft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.training.warcraft.domain.BattleForAzeroth;
import com.epam.training.warcraft.domain.Bow;
import com.epam.training.warcraft.domain.Person;


public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")){
		LOGGER.info("Battle read in from beans.xml");
		BattleForAzeroth battle = applicationContext.getBean("battle", BattleForAzeroth.class);
		battle.run();
		 
		Person person = applicationContext.getBean("nightElfPaladin", Person.class);
		person.setWeapon(applicationContext.getBean("simpleBow", Bow.class));
		
		}
	}

}
