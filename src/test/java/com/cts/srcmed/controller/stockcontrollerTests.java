package com.cts.srcmed.controller;

import com.cts.srcmed.model.Stock;
import com.cts.srcmed.serviceimpl.StockServiceImpl;
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

class stockControllerTest {

    @Mock
    private StockServiceImpl stockService;

    @Mock
    private Model model;

    @InjectMocks
    private StockController stockController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testShowUpdateStockForm_AddsEmptyStockToModelAndReturnsStockUpdateView() {
        // Arrange

        // Act
        String viewName = stockController.showUpdateStockForm(model);

        // Assert
        assertEquals("stockupdate", viewName);
        verify(model).addAttribute(eq("stock"), any(Stock.class));
    }

    @Test
    void testShow_AddsStockListToModelAndReturnsViewStockView() {
        // Arrange
        List<Stock> stocks = new ArrayList<>();
        when(stockService.getAllStocks()).thenReturn(stocks);

        // Act
        String viewName = stockController.show(model);

        // Assert
        assertEquals("viewstock", viewName);
        verify(model).addAttribute("stock", stocks);
    }

    @Test
    void testAddStock_ReturnsStockUpdateView() {
        // Arrange

        // Act
        String viewName = stockController.addStock();

        // Assert
        assertEquals("stockupdate", viewName);
    }

    @Test
    void testUpdateStock_UpdatesStockAndRedirectsToListView() {
        // Arrange
        Stock stock = new Stock();

        // Act
        String viewName = stockController.updateStock(stock);

        // Assert
        assertEquals("redirect:/list", viewName);
        verify(stockService).updateStock(stock);
    }

    @Test
    void testDeleteStock_DeletesStockAndRedirectsToListView() {
        // Arrange
        Integer stockId = 1;

        // Act
        String viewName = stockController.deleteStock(stockId);

        // Assert
        assertEquals("redirect:/list", viewName);
        verify(stockService).deleteStock(stockId);
    }

    @Test
    void testViewHomePage_AddsProductListToModelAndReturnsViewStockView() {
        // Arrange
        String keyword = "keyword";
        List<Stock> productList = new ArrayList<>();
        when(stockService.listAll(keyword)).thenReturn(productList);

        // Act
        String viewName = stockController.viewHomePage(model, keyword);

        // Assert
        assertEquals("viewstock", viewName);
        verify(model).addAttribute("listProducts", productList);
        verify(model).addAttribute("keyword", keyword);
    }
}
