import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setup() {
        person = new Person("Paul", "McCartney", new Date(2000), true, true, true);
    }

    @Test
    public void show_full_name() {
        assertEquals(person.fullName, "Paul McCartney");
    }

    @Test
    public void test_calculateYearlySalary() {
        person.setSalary(1200);

        assertEquals(person.calculateYearlySalary, 14400);
    }

    @Test
    public void person_is_MEI() {
        person.setSalary = 8000;
        person.setAnotherCompanyOwner(true);
        person.setPensioner(true);
        person.setPublicServer(true);

        assertTrue(person.isMEI);
    }

    @Test
    public void person_is_not_MEI() {
        person.setSalary = 8000;
        person.setAnotherCompanyOwner(false);

        assertFalse(person.isMEI);    
    }

}
