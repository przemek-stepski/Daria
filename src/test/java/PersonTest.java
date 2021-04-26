import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PersonTest {

    @Test
    public void testCheckAge() {
        Person person1 = new Person("Adam", 12);;

        Assertions.assertTrue(person1.getAge() == 12);
        Assertions.assertEquals(12, person1.getAge());
    }

    @Test
    public void testCheckName() {
        Person person1 = new Person("Adam", 12);;

        Assertions.assertTrue(person1.getName().equals("Adam"));
    }

    @Test
    public void testChangeAge() {
        Person person1 = new Person("Adam", 12);
        int newAge = 13;

        person1.setAge(newAge);

        Assertions.assertTrue(person1.getAge() == newAge);
    }

    @Test
    public void testChangeName() {
        Person person1 = new Person("Adam", 12);
        String newName = "Marta";

        person1.setName(newName);

        Assertions.assertTrue(person1.getName().equals(newName));
    }
}