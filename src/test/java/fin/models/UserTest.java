package fin.models;

import fin.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUserModel() {
        User user = new User("username", "fullName",  "city", "phoneNumber", "password", null);

        assertEquals("username", user.getUserName());
        assertEquals("fullName", user.getFullName());
        assertEquals("city", user.getCity());
        assertEquals("phoneNumber", user.getPhoneNumber());
        assertEquals("password", user.getPassword());

    }
}

