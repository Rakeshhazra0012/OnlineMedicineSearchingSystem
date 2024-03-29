package com.cts.srcmed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.cts.srcmed.model.Stock;
import com.cts.srcmed.serviceimpl.StockServiceImpl;

@Controller
public class StockController {
@Autowired
private StockServiceImpl stockService;

@GetMapping("/update")
public String showUpdateStockForm(Model model) {
    model.addAttribute("stock", new Stock());
    return "stockupdate";
}

@GetMapping("/list")
public String show(Model model) {
	List<Stock> stock = stockService.getAllStocks();
	model.addAttribute("stock",stock);
	return "viewstock";
}

@GetMapping("/stockupdate")
public String addStock() {
	return "stockupdate";
}
@PostMapping("/update")
public String updateStock(@ModelAttribute("stock") Stock stock) {
	System.out.println("Hello");
    stockService.updateStock(stock);
    return "redirect:/list";
}
@PostMapping("/delete/{stockId}")
	public String deleteStock(@PathVariable("stockId") Integer stockId) {
    stockService.deleteStock(stockId);
    return "redirect:/list";
}
@PostMapping("/filter")
public String viewHomePage(Model model, @Param("keyword") String keyword) {
    List<Stock> listProducts = stockService.listAll(keyword);
    model.addAttribute("listProducts", listProducts);
    model.addAttribute("keyword", keyword);
     
    return "viewstock";
}

}

