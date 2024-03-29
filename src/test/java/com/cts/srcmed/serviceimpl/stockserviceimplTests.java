package com.cts.srcmed.serviceimpl;



import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import com.cts.srcmed.model.Stock;
import com.cts.srcmed.repository.StockRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class StockServiceImplTest {

    @Mock
    private StockRepo stockRepository;

    @InjectMocks
    private StockServiceImpl stockService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testDeleteStock() {
        int stockId = 1;
        stockService.deleteStock(stockId);
        verify(stockRepository, times(1)).deleteByStockId(stockId);
    }

    @Test
    void testGetAllStocks() {
        List<Stock> mockStocks = new ArrayList<>();
        // Add some mock stock objects to the list
        // ...

        when(stockRepository.findAll()).thenReturn(mockStocks);

        List<Stock> result = stockService.getAllStocks();

        assertEquals(mockStocks, result);
        verify(stockRepository, times(1)).findAll();
    }

    @Test
    void testUpdateStock() {
        Stock mockStock = new Stock();
        // Set properties of the mock stock object
        // ...

        stockService.updateStock(mockStock);

        verify(stockRepository, times(1)).save(mockStock);
    }

    @Test
    void testListAll_WithKeyword() {
        String keyword = "example";
        List<Stock> mockStocks = new ArrayList<>();
        // Add some mock stock objects to the list
        // ...

        when(stockRepository.search(keyword)).thenReturn(mockStocks);

        List<Stock> result = stockService.listAll(keyword);

        assertEquals(mockStocks, result);
        verify(stockRepository, times(1)).search(keyword);
        verify(stockRepository, never()).findAll();
    }

    @Test
    void testListAll_WithoutKeyword() {
        List<Stock> mockStocks = new ArrayList<>();
        // Add some mock stock objects to the list
        // ...

        when(stockRepository.findAll()).thenReturn(mockStocks);

        List<Stock> result = stockService.listAll(null);

        assertEquals(mockStocks, result);
        verify(stockRepository, never()).search(anyString());
        verify(stockRepository, times(1)).findAll();
    }

    @Test
    void testSearchStocks_WithKeyword() {
        String keyword = "example";
        List<Stock> mockStocks = new ArrayList<>();
        // Add some mock stock objects to the list
        // ...

        when(stockRepository.search(keyword)).thenReturn(mockStocks);

        List<Stock> result = stockService.searchStocks(keyword);

        assertEquals(mockStocks, result);
        verify(stockRepository, times(1)).search(keyword);
        verify(stockRepository, never()).findAll();
    }

    @Test
    void testSearchStocks_WithoutKeyword() {
        List<Stock> mockStocks = new ArrayList<>();
        // Add some mock stock objects to the list
        // ...

        when(stockRepository.findAll()).thenReturn(mockStocks);

        List<Stock> result = stockService.searchStocks(null);

        assertEquals(mockStocks, result);
        verify(stockRepository, never()).search(anyString());
        verify(stockRepository, times(1)).findAll();
    }
}

