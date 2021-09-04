package javaFundamentals.database;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tddJunit.database.Credentials;
import tddJunit.database.Database;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DatabaseAccessTest {

    @Mock
    private Database database;

    private Credentials credentials = new Credentials("user", "password");

    @Test
    void testUserSuccessfulLogin() {
        when(database.login(credentials)).thenReturn(true);
        Credentials sameCredentials = new Credentials("user", "password");
        assertTrue(database.login(sameCredentials));
    }

    @Test
    void testUserFailedLogin() {
        Credentials otherCredentials = new Credentials("otherUser", "otherPassword");
        assertNotEquals(credentials.getUsername(), otherCredentials.getUsername());
        assertNotEquals(credentials.getPassword(), otherCredentials.getPassword());
        assertNotEquals(credentials.hashCode(), otherCredentials.hashCode());
        assertFalse(database.login(otherCredentials));

    }
}
