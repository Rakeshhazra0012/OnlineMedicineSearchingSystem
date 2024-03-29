package com.cts.srcmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cts.srcmed.model.Stock;
import com.cts.srcmed.service.StockService;
@Controller
public class MedicineController {
@Autowired
StockService stockService;

@GetMapping("/medicine")
public String viewmedicineuser() {
	return "user-view-stock";
}
	
	@GetMapping("/list-user")
	public String showStockList(Model model) {
		List<Stock> stock = stockService.getAllStocks();
		model.addAttribute("stock",stock);
		return "user-view-stock";
	}
	
	@PostMapping("/filter-user")
	public String filterstocks(Model model, @Param("keyword") String keyword) {
	    List<Stock> stockfilter = stockService.searchStocks(keyword);
	    model.addAttribute("stockfilter", stockfilter);
	    model.addAttribute("keyword", keyword);
	     
	    return "user-view-stock";
	}
	
	 @PostMapping("/confirmation")
	  public String processConfirmation() {
	      // your code here
	      return "confirmation";
	  }
	 
	 @PostMapping("/payment")
	    public String showPaymentForm() {
	    	return "payment";
	    }
	 
	 @PostMapping("/fileconfirmation")
	  public String processfileConfirmation() {
	      // your code here
	      return "fileconfirmation";
	  }
}

