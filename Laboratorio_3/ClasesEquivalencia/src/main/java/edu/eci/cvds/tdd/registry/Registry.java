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
        
        //esto se suponia que miraba si un man ya estaba registrado no?
        /**
    	else if (p.getAge() >= 18 && p.isAlive()) {           antes esta asi
        	return RegisterResult.DUPLICATED;   
        }
        */ 
        
        else if (identificador.contains(p.getId())){        //ahora asi, no se si la cague pero lo de arriba se veia muy extraño
            return RegisterResult.DUPLICATED;
        }
        
        //}else if(p.getAge() >= 18 && p.isAlive()){
          //      return RegisterResult.VALID;              //esta vaina sobraba porque al final ya todo eso se reviso
        //} 
        
        
        identificador.add(p.getId());       //al final agrega el id del man a la lista y bota valid
        return RegisterResult.VALID;
        
    }
}
