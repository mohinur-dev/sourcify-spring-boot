package com.sourcify.manufecturear;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sourcify.retailer.Order;




@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ManufecturearControler {
	//manufacturer sign in
	@PostMapping(value="/manufecturear-signin")
	public ManufecturearSignin save(@RequestBody ManufecturearSignin manuIn){
		ManufecturearDA manufecturearDA = new ManufecturearDA();
		return manufecturearDA.manufecturearSignin(manuIn);
	}
	
	//manufacturer sign up
	@PostMapping(value="/manufecturear-signup")
	public void save(@RequestBody ManufecturearSignup msup) {
		ManufecturearDA manuUp = new ManufecturearDA();
		manuUp.signupManufecturear(msup);
	}
	
	//add product
	@PostMapping(value="/add-product")
	public void save(@RequestBody Product pdt) {
		ManufecturearDA manuDA = new ManufecturearDA();
		manuDA.addProduct(pdt);
	}
	
	//show product
	List<Product> proList = new ArrayList<>();
	@RequestMapping(value="/show-product")
	public List<Product> show(ManufecturearDA pdtShow) {
		pdtShow = new ManufecturearDA();
		proList = pdtShow.showProduct();
		return proList;
	}
	
	//get product information by id
	@GetMapping(value ="/get-product/{id}")
	public List<Product> getProductByManuId(@PathVariable("id") int id) {
		ManufecturearDA manufecturearDA = new ManufecturearDA();
		return manufecturearDA.getProductByManuId(id);
	}
	
	//delete Product
	@PostMapping(value ="/delete-product")
	public void delete(@RequestBody Product pdt) {
		ManufecturearDA menuDA = new ManufecturearDA();
		menuDA.delete(pdt);
	}
	
	//update Product
	@PostMapping(value ="/update-product")
	public void update(@RequestBody Product pdt) {
		ManufecturearDA pro = new ManufecturearDA();
			pro.update(pdt);
	}
	
	//get product info by menu id
	@GetMapping(value ="/product/{id}")
	public Product getProductInfoById(@PathVariable("id") int id) {
		Product pdt ;
		ManufecturearDA pro = new ManufecturearDA();
		pdt = pro.productById(id);
		return pdt;
	}
	
	//get order list by Manufacturer id
	List<Order> orderList = new ArrayList<>();
	@GetMapping(value ="/manufecturer-orderlist/{id}")
	public List<Order> getOrderListByManufacturerId(@PathVariable("id") int id) {
		ManufecturearDA manufecturearDA = new ManufecturearDA();
		return  orderList = manufecturearDA.getOrderInfoByManufacturerId(id);
	}
	
	
	
	
	
	
	
	
	
	
}
