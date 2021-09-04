package defensiveCoding.flights.util;

import defensiveCoding.util.RequestInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RequestInputTest {
    RequestInput requestInput;

    @BeforeEach
    void init() {
        requestInput = new RequestInput();
    }

    @Test
    void shouldValidatePossibleString() {
        String str = requestInput.validateStringInput("hello");
        assertEquals("hello", str);
    }

    @Test
    void shouldValidatePossibleIntegerRange() {
        String arg = "3";
        int val = requestInput.validateIntegerInput(arg);
        assertEquals(3, val,
                () -> "Error calling validateIntegerInput method with argument: "+arg);
    }

    @Test
    void throwExceptionIfIncorrectIntegerPassed() {
        Throwable error = assertThrows(new IllegalArgumentException().getClass(), () -> {
            requestInput.validateIntegerInput("f");
        });
        assertEquals("Invalid Integer. Input argument for passengerCount should be 1 to 7", error.getMessage());
    }
}