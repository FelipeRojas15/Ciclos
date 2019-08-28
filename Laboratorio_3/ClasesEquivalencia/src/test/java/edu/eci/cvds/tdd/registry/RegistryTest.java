package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void debeSerMenorDeEdad() {
    	registry = new Registry();
    	Person personaA= new Person("Marcelo Vaca",01,8,Gender.MALE,true);
    	 RegisterResult result = registry.registerVoter(personaA);
         Assert.assertEquals(RegisterResult.UNDERAGE,result);

        
    }
    
    
}