package com.epam.training.warcraft.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterBattleAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(AfterBattleAspect.class);
			
	@After("execution (* com.epam.training.warcraft.domain.BattleForAzeroth.run(..))")
    public void theEnd() {
		
        LOGGER.info("Battle has ended! Says the aspect after the function");
        
    }
}
