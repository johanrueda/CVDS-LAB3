package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
	
	private ArrayList<Integer> registrados = new ArrayList<>();
	
    public RegisterResult registerVoter(Person p) {
		if (!p.isAlive()) {
            return RegisterResult.DEAD;
		} else if (registrados.contains(p.getId())) {
            return RegisterResult.DUPLICATED;
        } else if (p.getAge() < 0) {
            return RegisterResult.INVALID_AGE;
        } else if (p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        } else { 
            registrados.add(p.getId());
            return RegisterResult.VALID;
        }
    }
}