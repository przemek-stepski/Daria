package ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

    @BeforeEach
    public void createPersonBeforeTest() {
        Person person1 = makePerson();
    }

    @Test
    public void testCheckAge() {
       Person person1 = makePerson();
        // Assertions.assertTrue(person1.getAge() == 12);
        Assertions.assertEquals(12, person1.getAge());
        ;
    }

    @Test
    public void testCheckName() {
        Person person1 = makePerson();

        Assertions.assertTrue(person1.getName().equals("Adam"));
        Assertions.assertEquals("Adam", person1.getName());
    }

    @Test
    public void testChangeAge() {
        Person person1 = makePerson();
        final int newAge = 13;

        person1.setAge(newAge);

        //Assertions.assertTrue(person1.getAge() == newAge);
        Assertions.assertEquals(newAge, person1.getAge());
    }

    @Test
    public void testChangeName() {
        Person person1 = makePerson();
        String newName = "Marta";

        person1.setName(newName);

        Assertions.assertTrue(person1.getName().equals(newName));
    }

    public Person makePerson() {
        return new Person("Adam", 12, 1, 8);
    }
}