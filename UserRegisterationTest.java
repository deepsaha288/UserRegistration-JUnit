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
    public void Password_IsTrue() {
        boolean result = user.validatePassword("Deepsaha");
        Assertions.assertTrue(result);
    }
    @Test
    public void Password_IsFalse() {
        boolean result = user.validatePassword("deeps9");
        Assertions.assertFalse(result);
    }
}
