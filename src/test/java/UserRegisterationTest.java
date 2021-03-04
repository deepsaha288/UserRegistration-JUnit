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
    public void firstName_WhenTrue() {
        boolean result = user.validateFirstName("Deep");
        Assertions.assertTrue(result);

    }

    @Test
    public void firstName_WhenFalse() {
        boolean result = user.validateFirstName("De^^G9916522077");
        Assertions.assertFalse(result);

    }

    @Test
    public void lastName_WhenTrue() {
        boolean result = user.validateLastName("Saha");
        Assertions.assertTrue(result);

    }

    @Test
    public void lastName_WhenFalse() {
        boolean result = user.validateLastName("Saha$^GG");
        Assertions.assertFalse(result);
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

    @Test
    public void mobileNumber_IsTrue() {
        boolean result = user.validateMobilNum("91 9916522077");
        Assertions.assertTrue(result);
    }
    @Test
    public void mobileNumber_IsFalse() {
        boolean result = user.validateMobilNum("123456789055");
        Assertions.assertFalse(result);
    }

    @Test
    public void Password_IsTrue() {
        boolean result = user.validatePassword("Deeps(*^12345");
        Assertions.assertTrue(result);
    }
    @Test
    public void Password_IsFalse() {
        boolean result = user.validatePassword("deps9");
        Assertions.assertFalse(result);
    }
}