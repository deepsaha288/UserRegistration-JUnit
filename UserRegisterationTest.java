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
    public void mobileNumber_IsTrue() {
        boolean result = user.validateMobilNum("91 9916522077");
        Assertions.assertTrue(result);
    }
    @Test
    public void mobileNumber_IsFalse() {
        boolean result = user.validateMobilNum("123456789055");
        Assertions.assertFalse(result);
    }
}
