package com.cts.srcmed.controller;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NavigationControllerTest {

    @Test
    void testAbout_ReturnsAboutView() {
        // Arrange
        NavigationController controller = new NavigationController();

        // Act
        String viewName = controller.about();

        // Assert
        assertEquals("about", viewName);
    }

    @Test
    void testContact_ReturnsContactView() {
        // Arrange
        NavigationController controller = new NavigationController();

        // Act
        String viewName = controller.contact();

        // Assert
        assertEquals("contact", viewName);
    }

    @Test
    void testHome_ReturnsWelcomeView() {
        // Arrange
        NavigationController controller = new NavigationController();

        // Act
        String viewName = controller.Home();

        // Assert
        assertEquals("welcome", viewName);
    }

    @Test
    void testPrescription_ReturnsUploadPrescriptionView() {
        // Arrange
        NavigationController controller = new NavigationController();

        // Act
        String viewName = controller.prescription();

        // Assert
        assertEquals("upload-precription", viewName);
    }
}

