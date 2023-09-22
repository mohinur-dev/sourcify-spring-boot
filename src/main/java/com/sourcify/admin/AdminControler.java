package com.sourcify.admin;

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
import com.sourcify.retailer.ProductRequest;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminControler {

	// admin's sign in
	@PostMapping(value = "/admin-signin")
	public AdminSignin save(@RequestBody AdminSignin admin) {
		AdminDA adminDA = new AdminDA();
		return adminDA.adminSignin(admin);
	}
	
	//get admin's information by id
	@GetMapping(value="/admin-info/{id}")
	public AdminInfo getAdminInfo(@PathVariable("id") int id) {
		AdminDA adminDA = new AdminDA();
		return adminDA.getAdminInfoById(id);
	}

	// get all retailer information
	List<Retailer> retailerList = new ArrayList<>();

	@RequestMapping(value = "/retailer-list")
	public List<Retailer> showRetailerInfo(AdminDA adminDA) {
		adminDA = new AdminDA();
		retailerList = adminDA.getRetailerInfo();
		return retailerList;
	}

	// get retailer information by retailer id
	@GetMapping(value = "/retailer-info/{id}")
	public Retailer getRetailerInfoById(@PathVariable("id") int id) {
		AdminDA adminDA = new AdminDA();
		return adminDA.getRetailerInfoById(id);

	}

	// get all menu information
	List<Manufecturear> manufecturerList = new ArrayList<>();

	@RequestMapping(value = "/manufecturear-list")
	public List<Manufecturear> showManufecturearInfo(AdminDA adminDA) {
		adminDA = new AdminDA();
		manufecturerList = adminDA.getManufecturearInfo();
		return manufecturerList;
	}

	// get menu information by manufacturer id
	@GetMapping(value = "/manufecturear-info/{id}")
	public Manufecturear getManufecturerInfoById(@PathVariable("id") int id) {
		AdminDA adminDA = new AdminDA();
		return adminDA.getManufecturearInfoById(id);

	}

	// get product information by product id
	@GetMapping(value = "/product-info-admin/{id}")
	public AdminProduct getProductInformationbyproductId(@PathVariable("id") int id) {
		AdminDA adminDA = new AdminDA();
		return adminDA.getProductInformationById(id);
	}

	// get order list
	List<Order> orderList = new ArrayList<>();

	@GetMapping(value = "/order-list")
	public List<Order> getOrderList(AdminDA retailerDA) {
		retailerDA = new AdminDA();
		return orderList = retailerDA.getOrderList();
	}

	// get all product
	List<AdminProduct> proList = new ArrayList<>();

	@GetMapping(value = "/admin-product")
	public List<AdminProduct> show(AdminDA pdtShow) {
		pdtShow = new AdminDA();
		return proList = pdtShow.showProductToAdmin();
	}

	// update manufacturer information
	@PostMapping(value = "/update-manufacturer")
	public void updateManufecturear(@RequestBody Manufecturear manu) {
		AdminDA pro = new AdminDA();
		pro.updateManufecturear(manu);
	}

	// update retailer information
	@PostMapping(value = "/update-retailer")
	public void updateRetailer(@RequestBody Retailer ret) {
		AdminDA pro = new AdminDA();
		pro.updateRetailer(ret);
	}

	// update order
	@PostMapping(value = "/update-admin-order")
	public void updateOrder(@RequestBody Order odr) {
		AdminDA adminDA = new AdminDA();
		adminDA.updateOrderInformation(odr);
	}

	
	// get requested product list by retailer id
	@GetMapping(value = "/productRequestList")
	public List<ProductRequest> show() {
		AdminDA pdtShow = new AdminDA();
		return pdtShow.getAllProductRequest();
	}
}
