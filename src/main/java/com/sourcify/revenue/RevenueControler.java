package com.sourcify.revenue;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RevenueControler {

	//add transaction in revenue table
	@PostMapping(value = "/add-revenue-info")
	public void addRevenueInfo(@RequestBody Revenue rev) {
		RevenueDA revenue = new RevenueDA();
		revenue.insertInfoIntoRevenue(rev);
	}
	
	//delete transaction from revenue table
	@PostMapping(value ="/delete-revenue")
	public void deleteRevenue(@RequestBody Revenue rev) {
		RevenueDA revenue = new RevenueDA();
		revenue.deleteFormRevenue(rev);
	}

	
	//show revenue by manufacturer in details
	@GetMapping(value="/get-revenue-details/{id}")
	public List<RevenueDto> getRevenueListInDetails(@PathVariable("id") int id) {
		RevenueDA revenue = new RevenueDA();
		return revenue.showRevenueDetails(id);
	}
	
	//get total revenue by manufacturer
	@GetMapping(value="get-revenue-manufacturer")
	public List<ManufacturerRevenue> getTotalRevenueByManufacturer(RevenueDA revenue) {
		return revenue.totalManufacturerRevenue();
	}
	
	//show revenue by manufacturer in details by retailer id
	@GetMapping(value="/get-retailer-revenue-details/{id}")
	public List<RetailerDto> getRevenueListInDetailsByRetailer(@PathVariable("id") int id) {
		RevenueDA revenue = new RevenueDA();
		return revenue.showRevenueDetailsByRetailer(id);
	}
	
	//get total revenue by retailer
	@GetMapping(value="get-revenue-retailer")
	public List<RetailerRevenue> getTotalRevenueByRetailer(RevenueDA revenue) {
		return revenue.totalRetailerRevenue();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
