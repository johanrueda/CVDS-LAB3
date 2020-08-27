package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;


public class RegistryTest {

    private Registry registry = new Registry();

	@Test
    public void registryDeadP() {
        Person person = new Person("joel",10,20,Gender.MALE,false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }
	
	@Test
    public void registryInvalidAgeP() {
        Person person = new Person("joel",11,-5,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
	
	@Test
    public void registryDuplicateP() {
        Person person = new Person("joel",12,20,Gender.MALE,true);
		registry.registerVoter(person);
		Person person_d = new Person("joel",12,20,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person_d);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
	
	@Test
    public void registryUnderAgeP() {
        Person person = new Person("joel",15,12,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

	@Test
    public void registryValidateP() {
        Person person = new Person("joel",25,20,Gender.MALE,true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
}