import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;

public class PersonTest {

    Person person;

    @BeforeAll
    public void setup() {
        person = new Person();
    }

    @ParameterizedTest(name = "Verifica se a senha está dentro do padrão")
    @ValueSource(strings = { "PaulMcCartney2", "PaulMcCartney2" })
    public void check_user_valid() {
        assertTrue(person.checkUser(null));
    }


}
