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
}
