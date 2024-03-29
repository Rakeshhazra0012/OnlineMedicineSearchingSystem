package com.cts.srcmed.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.srcmed.model.Stock;
import com.cts.srcmed.repository.StockRepo;
import com.cts.srcmed.service.StockService;

//import jakarta.transaction.Transactional;
@Service
//@Transactional
public class StockServiceImpl implements StockService{
	
@Autowired
private StockRepo stockRepo;  
	@Override
	public void deleteStock(int StockId) {
		 stockRepo.deleteByStockId(StockId);
		
	}

	public List<Stock> getAllStocks() {
		return stockRepo.findAll();
	}
	@Override
	 public void updateStock(Stock stock) {
	        stockRepo.save(stock);
	    }

	public List<Stock> listAll(String keyword) {
		 if (keyword != null) {
	            return stockRepo.search(keyword);
	        }
	        return stockRepo.findAll();
	
	}

	@Override
	public List<Stock> searchStocks(String keyword) {
		if (keyword != null) {
			return stockRepo.search(keyword);
		}
		return stockRepo.findAll();
	}
	
	
}

	