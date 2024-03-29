package com.cts.srcmed.controller;


import com.cts.srcmed.model.Stock;
import com.cts.srcmed.service.StockService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class MedicineControllerTest {

    @Mock
    private StockService stockService;

    @Mock
    private Model model;

    @InjectMocks
    private MedicineController medicineController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testViewMedicineUser_ReturnsUserViewStock() {
        // Arrange

        // Act
        String viewName = medicineController.viewmedicineuser();

        // Assert
        assertEquals("user-view-stock", viewName);
    }

    @Test
    void testShowStockList_AddsStockListToModelAndReturnsUserViewStock() {
        // Arrange
        List<Stock> stocks = new ArrayList<>();
        when(stockService.getAllStocks()).thenReturn(stocks);

        // Act
        String viewName = medicineController.showStockList(model);

        // Assert
        assertEquals("user-view-stock", viewName);
        verify(model).addAttribute("stock", stocks);
    }

    @Test
    void testFilterStocks_AddsStockFilterToModelAndReturnsUserViewStock() {
        // Arrange
        String keyword = "keyword";
        List<Stock> stockFilter = new ArrayList<>();
        when(stockService.searchStocks(keyword)).thenReturn(stockFilter);

        // Act
        String viewName = medicineController.filterstocks(model, keyword);

        // Assert
        assertEquals("user-view-stock", viewName);
        verify(model).addAttribute("stockfilter", stockFilter);
        verify(model).addAttribute("keyword", keyword);
    }

    @Test
    void testProcessConfirmation_ReturnsConfirmationView() {
        // Arrange

        // Act
        String viewName = medicineController.processConfirmation();

        // Assert
        assertEquals("confirmation", viewName);
    }
}

