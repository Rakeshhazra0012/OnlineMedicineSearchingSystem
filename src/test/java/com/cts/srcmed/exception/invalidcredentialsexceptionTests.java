package com.cts.srcmed.exception;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvalidCredentialsExceptionTest {

    @Test
    void testInvalidCredentialsException() {
        String message = "Invalid credentials.";
        InvalidCredentialsException exception = new InvalidCredentialsException(message);
        assertEquals(message, exception.getMessage());
    }
}

