package com.cts.srcmed.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockTest {

    @Test
    void testToString_ReturnsExpectedStringRepresentation() {
        // Arrange
        Stock stock = new Stock();
        stock.setStockId(1);
        stock.setStockLocId("ABC123");
        stock.setDrugName("Aspirin");
        stock.setCompany("ABC Pharmaceuticals");
        stock.setDose("10mg");
        stock.setExpDate("2023-12-31");

        String expectedString = "stock [stockId=1, stockLocId=ABC123, drugName=Aspirin, company=ABC Pharmaceuticals, dose=10mg]";

        // Act
        String actualString = stock.toString();

        // Assert
        assertEquals(expectedString, actualString);
    }
}
