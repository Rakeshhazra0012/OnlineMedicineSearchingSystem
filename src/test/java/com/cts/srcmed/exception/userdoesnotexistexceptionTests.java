package com.cts.srcmed.exception;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserDoesNotExistExceptionTest {

    @Test
    void testUserDoesNotExistException() {
        String message = "User does not exist.";
        UserDoesNotExistException exception = new UserDoesNotExistException(message);
        assertEquals(message, exception.getMessage());
    }
}

