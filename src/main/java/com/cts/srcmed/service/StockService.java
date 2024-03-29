package com.cts.srcmed.service;


import java.util.List;

import com.cts.srcmed.model.Stock;

public interface StockService {
public void updateStock(Stock stock); 
public void deleteStock(int StockId);
public List<Stock> getAllStocks();
public List<Stock> listAll(String keyword);
public List<Stock> searchStocks(String keyword);

}
