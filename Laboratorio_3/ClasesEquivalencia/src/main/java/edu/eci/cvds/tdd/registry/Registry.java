package edu.eci.cvds.tdd.registry;

import java.util.*;

public class Registry {
    
    public ArrayList<Integer> identificador;
    public Registry() {
		identificador = new ArrayList<>();
	}
    public RegisterResult registerVoter(Person p) {
    	
    	if (p.isAlive()==false ) {
    		return RegisterResult.DEAD;
    	}
    	else if (p.getAge()<0) {
    		return RegisterResult.INVALID_AGE; 
    	}
    	else if (p.getAge()<18 && p.isAlive() == true) {
        	return RegisterResult.UNDERAGE;
        }
    	else if (p.getAge() >= 18 && p.isAlive()==true ) {
        	return RegisterResult.DUPLICATED; 
        }else if(p.getAge() >= 18 && p.isAlive() == true){
                return RegisterResult.VALID;
        } 
        return RegisterResult.VALID;
    }
}
