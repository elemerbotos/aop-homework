package com.epam.training.warcraft.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WrongWeaponAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(WrongWeaponAspect.class);
	
	@AfterThrowing(pointcut = "execution (* com.epam.training.warcraft.domain.Person.setWeapon(..))",
        	throwing = "ex")
	public void wrongWeapon(final JoinPoint joinPoint, final IllegalArgumentException ex) {
		
		LOGGER.info("Haven't you learned anything about warcraft?! Oh dear...");
	 
	}
}
