package edu.eci.cvds.tdd.registry;

import java.util.*;

public class Registry {
    /**
       @param identificador lista de identificaciones de votanes 
    */
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
    	else if (p.getAge()<18 && p.isAlive()) {
        	return RegisterResult.UNDERAGE;
        }
        
        
        else if (identificador.contains(p.getId())){       
            return RegisterResult.DUPLICATED;
        }
        
     
        
        identificador.add(p.getId());      
        return RegisterResult.VALID;
        
    }
}
