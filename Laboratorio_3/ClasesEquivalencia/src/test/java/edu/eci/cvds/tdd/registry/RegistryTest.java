package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    //private Registry registry = new Registry();
    /**
    @Test
    public void debeSerMenorDeEdad() {
    	registry = new Registry();
    	Person personaA= new Person("Marcelo Vaca",01,8,Gender.MALE,true);
    	 RegisterResult result = registry.registerVoter(personaA);
         Assert.assertEquals(RegisterResult.UNDERAGE,result);        
    }    
    @Test    
    public void debeEstarMuerto(){
        registry = new Registry();
        Person personaB = new Person("Jesse Ventura",02,38,Gender.MALE,false);
        RegisterResult result = registry.registerVoter(personaB);
        Assert.assertEquals(RegisterResult.DEAD,result);
    }
    @Test
    public void debeTenerEdadInvalida(){
        registry = new Registry();
        Person personaC = new Person("El atrocidad",03,-19,Gender.UNIDENTIFIED,true);
        RegisterResult result = registry.registerVoter(personaC);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
    }
    @Test
    public void debeEstarDuplicado(){
        registry = new Registry();
        Person personaD = new Person("Simon Marin",04, 19,Gender.MALE,true);
        registry.registerVoter(personaD);
        RegisterResult result = registry.registerVoter(personaD);
        Assert.assertEquals(RegisterResult.DUPLICATED,result);
    }
    @Test
    public void debeSerValido (){
        registry = new Registry();
        Person personaE = new Person("James Weisnner",52,21,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(personaE);
        Assert.assertEquals(RegisterResult.VALID,result);
    }
   */ 
}