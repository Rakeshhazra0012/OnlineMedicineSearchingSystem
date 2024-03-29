package com.cts.srcmed.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    void testToString_ReturnsExpectedStringRepresentation() {
        // Arrange
        User user = new User();
        user.setUserId(1);
        user.setDesignation("Manager");
        user.setFname("John");
        user.setLname("Doe");
        user.setPhone("1234567890");
        user.setEmail("john.doe@example.com");
        user.setUsername("johndoe");
        user.setPassword("password");

        String expectedString = "User [userId=1, designation=Manager, fname=John, lname=Doe, phone=1234567890, email=john.doe@example.com, username=johndoe, password=password]";

        // Act
        String actualString = user.toString();

        // Assert
        assertEquals(expectedString, actualString);
    }
}
