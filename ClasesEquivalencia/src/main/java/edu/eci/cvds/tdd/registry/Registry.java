package edu.eci.cvds.tdd.registry;

import java.util.HashMap;

public class Registry {
    private HashMap<Integer, Person> votantes;

    public Registry(){
        votantes = new HashMap<Integer, Person>();
    }
    public RegisterResult registerVoter(Person p) {
        int id= p.getId();
        RegisterResult registerResult = RegisterResult.VALID;
        boolean vida= p.isAlive();
        int edad = p.getAge();


        if(votantes.containsKey(id)){
            registerResult = RegisterResult.DUPLICATED;
        } else if (!vida) {
            registerResult = RegisterResult.DEAD;
        } else if (edad <= 0) {
            registerResult = RegisterResult.INVALID_AGE;
        } else if (edad < 18) {
            registerResult  = RegisterResult.UNDERAGE;
        } else{
            votantes.put(id,p);
        }
        return registerResult;
    }
}
