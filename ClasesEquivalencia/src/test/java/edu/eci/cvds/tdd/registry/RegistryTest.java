package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;



public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person("Santiago", 1000594484, 19, Gender.MALE, true );
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateDuplicate() {
        Person person = new Person("Santiago", 1000594484, 19, Gender.MALE, true );
        RegisterResult result1 = registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }
    @Test
    public void validateIsDead() {
        Person person = new Person("Trevor", 1678889923, 35, Gender.MALE, false );
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateIsMinior() {
        Person person = new Person("Juliana", 1343565776, 15, Gender.FEMALE, true );
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateWrongAge() {
        Person person = new Person("Carlos", 1376348879, -24, Gender.MALE, true );
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
}