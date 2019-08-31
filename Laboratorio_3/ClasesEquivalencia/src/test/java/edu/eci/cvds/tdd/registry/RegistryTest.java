package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();
    
    @Test
    public void debeSerMenorDeEdad() {
    	registry = new Registry();
    	Person personaA= new Person("Marcelo Vaca",1,8,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(personaA);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);     
        Person personB = new Person("Radamel Garcia",2,1,Gender.MALE,true);
        result = registry.registerVoter(personB);
        Assert.assertEquals(RegisterResult.UNDERAGE,result);
        Person personC = new Person("Danny Marin", 4,-1, Gender.MALE, true); //limite superior
        result = registry.registerVoter(personC);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person personaD= new Person("Andres Gomez",1,17,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(personaD);
        Assert.assertEquals(RegisterResult.UNDERAGE,result); 
        Person personaE= new Person("Paulo Londra",1,19,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(personaE);
        Assert.assertEquals(RegisterResult.VALID,result); 
    }    
    @Test    
    public void debeEstarMuerto(){
        registry = new Registry();
        Person personaB = new Person("Jesse Ventura",4,38,Gender.MALE,false);
        RegisterResult result = registry.registerVoter(personaB);
        Assert.assertEquals(RegisterResult.DEAD,result);
        Person personC = new Person("Felipe Bernal", 3,288, Gender.MALE, false); 
        result = registry.registerVoter(personC);
        Assert.assertEquals(RegisterResult.DEAD,result);
        Person personaE= new Person("Paulo Londra",1,19,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(personaE);
        Assert.assertEquals(RegisterResult.VALID,result);
    }
    @Test
    public void debeTenerEdadInvalida(){
        registry = new Registry();
        Person personaC = new Person("El atrocidad",03,-19,Gender.UNIDENTIFIED,true);
        RegisterResult result = registry.registerVoter(personaC);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person personaE= new Person("Paulo Londra",1,-1,Gender.MALE,true);
    	RegisterResult result = registry.registerVoter(personaE);
        Assert.assertEquals(RegisterResult.INVALID_AGE,result);
        Person personF = new Person("Danny Marin", 4,0, Gender.MALE, true); //limite superior
        result = registry.registerVoter(personF);
        Assert.assertEquals(RegisterResult.VALID,result);
    }
    @Test
    public void debeEstarDuplicado(){
        registry = new Registry();
        Person personaD = new Person("Simon Marin",04, 19,Gender.MALE,true);
        registry.registerVoter(personaD);
        RegisterResult result = registry.registerVoter(personaD);
        Assert.assertEquals(RegisterResult.DUPLICATED,result);
        Person personC = new Person("Danny Marin", 5,0, Gender.MALE, true); //limite superior
        result = registry.registerVoter(personC);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person personE = new Person("Danny Marin", 5,19, Gender.MALE, true);
        result = registry.registerVoter(personE);
        Assert.assertEquals(RegisterResult.DUPLICATED,result);
    }
    @Test
    public void debeSerValido (){
        registry = new Registry();
        Person personaE = new Person("James Weisnner",52,21,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(personaE);
        Assert.assertEquals(RegisterResult.VALID,result);
        Person personA = new Person("CVDS", 1,35, Gender.MALE, true);
       RegisterResult result = registry.registerVoter(personA);
       Assert.assertEquals(RegisterResult.VALID,result);   
       Person personB = new Person("Juliana Garcia", 2,20, Gender.FEMALE, true);
       result = registry.registerVoter(personB);
       Assert.assertEquals(RegisterResult.VALID,result);
    }
    
}
