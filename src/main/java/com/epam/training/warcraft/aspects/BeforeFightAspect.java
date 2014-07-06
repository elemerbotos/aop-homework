package com.epam.training.warcraft.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.epam.training.warcraft.domain.Person;

@Aspect
@Component
public class BeforeFightAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(BeforeFightAspect.class);
			
	@Before("execution (* com.epam.training.warcraft.domain.Person.Attack(..)) && args(person)")
    public void beforeFight(Person person) {
		
        LOGGER.info(person.getName() + " is hit " );
        
    }
}
