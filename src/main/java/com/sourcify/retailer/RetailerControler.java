package com.sourcify.retailer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sourcify.manufecturear.Product;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RetailerControler {
	// retailer sign in
	@PostMapping(value = "/retailer-signin")
	public RetailerSignin save(@RequestBody RetailerSignin retailer) {
		RetailerDA retailerDA = new RetailerDA();
		return retailerDA.retailerSignin(retailer);
	}

	// retailer sign up
	@PostMapping(value = "/retailer-signup")
	public RetailerSignup save(@RequestBody RetailerSignup rUp) {
		RetailerDA retailUp = new RetailerDA();
		return retailUp.retailerSignup(rUp);
	}

	// show all products
	List<RetailerProduct> proList = new ArrayList<>();

	@RequestMapping(value = "/show-product2retailer")
	public List<RetailerProduct> show(RetailerDA pdtShow) {
		pdtShow = new RetailerDA();
		return proList = pdtShow.showProductToRetailer();
	}

	@GetMapping(value = "/product4retailer/{id}")
	public RetailerProduct getProductInfoById(@PathVariable("id") int id) {
		RetailerDA pro = new RetailerDA();
		return pro.productById4retailer(id);
	}

	// add to cart
	@PostMapping(value = "/add2cart")
	public Cart save(@RequestBody Cart crt) {
		RetailerDA retailerDA = new RetailerDA();
		return retailerDA.add2Cart(crt);
	}

	// get cart data by retailer id
	@GetMapping(value = "/get-cart-data/{id}")
	public List<Cart> getCartDataByRetId(@PathVariable("id") int id) {
		RetailerDA retailerDA = new RetailerDA();
		return retailerDA.showCart(id);

	}

	// empty cart
	@PostMapping(value = "/delete-allCartItems")
	public void deleteAllCartItems(@RequestBody Cart cart) {
		RetailerDA retailerDA = new RetailerDA();
		retailerDA.deleteAllCartItems(cart);
	}

	// delete one cart items
	@PostMapping(value = "/delete-oneCartItems")
	public void deleteOneCartItems(@RequestBody Cart cart) {
		RetailerDA retailerDA = new RetailerDA();
		retailerDA.deleteOneCartItems(cart);
	}

	// update cart
	@PostMapping(value = "/update-cart")
	public void updateCart(@RequestBody Cart cart) {
		RetailerDA retailerDA = new RetailerDA();
		retailerDA.updateCart(cart);
	}

	// place order
	@PostMapping(value = "/place-order")
	public void placeOrder(@RequestBody Order order) {
		RetailerDA retailerDA = new RetailerDA();
		retailerDA.placeOrder(order);
	}

	// get order list by customer id
	List<Order> orderList = new ArrayList<>();

	@GetMapping(value = "/order-list/{id}")
	public List<Order> getOrderListByRetailerId(@PathVariable("id") int id) {
		RetailerDA retailerDA = new RetailerDA();
		return orderList = retailerDA.getOrderInfoByRetailerId(id);
	}

	// get order information by order id
	@GetMapping(value = "/order-info/{id}")
	public Order getOrderInfoById(@PathVariable("id") int id) {
		RetailerDA retailerDA = new RetailerDA();
		return retailerDA.getOrderInfoByOrderId(id);

	}

	// add to wish list
	@PostMapping(value = "/add2wishlist")
	public Wishlist save(@RequestBody Wishlist wsl) {
		RetailerDA retailerDA = new RetailerDA();
		return retailerDA.add2wishlist(wsl);
	}

	// get wish list by retailer id
	@GetMapping(value = "/show-wishlist/{id}")
	public List<Wishlist> getWishlistByRetId(@PathVariable("id") int id) {
		RetailerDA retailerDA = new RetailerDA();
		return retailerDA.showWishlist(id);

	}

	// delete from wish list by product id
	@PostMapping(value = "/delete-wishlist-product-id")
	public void deleteByProductIdFromWishlidt(@RequestBody Wishlist wList) {
		RetailerDA retailerDA = new RetailerDA();
		retailerDA.deleteWishlistByProductId(wList);
	}

	// delete from wish list by wish list id
	@PostMapping(value = "/delete-wishlist-id")
	public void deleteByWishlistIdFromWishlist(@RequestBody Wishlist wList) {
		RetailerDA retailerDA = new RetailerDA();
		retailerDA.deleteWishlistByWishlistId(wList);
	}

	// delete from wish list by retailer id
	@PostMapping(value = "/delete-wishlist-retailer-id")
	public void deleteByRetailerIdFromWishlidt(@RequestBody Wishlist wList) {
		RetailerDA retailerDA = new RetailerDA();
		retailerDA.deleteWishlistByRetailerId(wList);
	}

	// search product by name
	@GetMapping(value = "/search-product/{name}")
	public List<Product> getProductList(@PathVariable String name) {
		RetailerDA pdtShow = new RetailerDA();
		return pdtShow.searchProduct(name);
	}

	//update product quantity
	@GetMapping(value = "/update-quantity")
	public void updateProductQuantity(@RequestParam int productId, @RequestParam int qty, @RequestParam boolean plus) {
		RetailerDA pdtShow = new RetailerDA();
		pdtShow.updateProductQuantity(productId, qty, plus);
	}

	//get related product
	@GetMapping(value = "/get-related-product/{name}")
	public List<Product> getRelatedProduct(@PathVariable String name) {
		RetailerDA retDA = new RetailerDA();
		return retDA.relatedProductList(name);
	}
	
	// add to request product
	@PostMapping(value = "/add-product-request")
	public ProductRequest save(@RequestBody ProductRequest pr) {
		RetailerDA retailUp = new RetailerDA();
		return retailUp.addProductRequest(pr);
	}
	
	// get requested product list by retailer id
		@GetMapping(value = "/get-requested-product-list/{id}")
		public List<ProductRequest> getRequestedProductList(@PathVariable("id") int id) {
			RetailerDA retailerDA = new RetailerDA();
			return retailerDA.getProductRequest(id);

		}
}
