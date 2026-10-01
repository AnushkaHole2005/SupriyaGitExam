
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Aunticationservicetest {

        private Aunticationservice authService;

        @BeforeEach
        void setUp() {
            authService = new Aunticationservice();
        }

        @Test
        @DisplayName("Test 1: Successful login with valid credentials")
        void testLogin_ValidCredentials_ReturnsTrue() {
            boolean result = authService.login("admin_user", "SecurePass123!");
            assertTrue(result, "Login should succeed with valid credentials.");
        }

        @Test
        @DisplayName("Test 2: Failed login with invalid password")
        void testLogin_InvalidCredentials_ReturnsFalse() {
            boolean result = authService.login("admin_user", "WrongPassword");
            assertFalse(result, "Login should fail with incorrect password.");
        }

        @Test
        @DisplayName("Test 3: Failed login with blank username")
        void testLogin_BlankUsername_ReturnsFalse() {
            boolean result = authService.login("", "SecurePass123!");
            assertEquals(false, result, "Login should fail when username is blank.");
        }

        @Test
        @DisplayName("Test 4: Verify exception thrown on null input handling if strict check is requested")
        void testLogin_NullInput_ReturnsFalse() {
            boolean result = authService.login(null, "SecurePass123!");
            assertFalse(result, "Login should fail gracefully when username is null.");
        }
    }

