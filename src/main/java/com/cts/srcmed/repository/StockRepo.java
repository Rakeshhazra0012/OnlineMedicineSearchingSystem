package com.cts.srcmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import java.sql.Date;
//import java.util.Date;
import java.util.List;
import com.cts.srcmed.model.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Integer> {
	
	    Stock findByStockId(int stockId);
	    
	    List<Stock> findByDrugName(String drugName);
	    
	    List<Stock> findByCompany(String company);
	    List<Stock> findByExpDateBefore(String date);
	    void deleteByStockId(int stockId);
	    @Query("SELECT s FROM Stock s WHERE CONCAT" + "(s.stockId, ' ', s.stockLocId, ' ', s.drugName, ' ', s.company) LIKE %?1%")
	    public List<Stock> search(String keyword);
}
