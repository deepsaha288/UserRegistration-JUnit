import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
    UserRegistration user;

    @BeforeEach
    public void setup() {
        user = new UserRegistration();
    }


    @Test
    public void email_IsTrue() {
        boolean result = user.validateEmail("deepsaha@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void email_IsFalse() {
        boolean result = user.validateEmail("deep.saha^@gmail^..com");
        Assertions.assertFalse(result);
    }
}
