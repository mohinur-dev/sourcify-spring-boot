package com.sourcify.retailer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.sourcify.util.db;


public class RetailerDA {
	Connection con;
	PreparedStatement pst;
	
	public RetailerSignin retailerSignin(RetailerSignin retailer) {
		RetailerSignin info = null;
		try {
			pst = db.get().prepareStatement("SELECT * FROM retailer WHERE username=? AND password=?");
//			pst = db.get().prepareStatement("SELECT * FROM retailer WHERE username=? AND password=? AND status='Active'");
			pst.setString(1, retailer.username);
			pst.setString(2, retailer.password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				info = new RetailerSignin();
				info.setId(rs.getInt(1));
				info.setName(rs.getString(2));
				info.setBusinessType(rs.getString(4));
				info.setDelDivison(rs.getString(10));
				info.setDelDistrict(rs.getString(11));
				info.setDelUpozela(rs.getString(12));
				info.setDelLocation(rs.getString(13));
				info.setOwnerName(rs.getString(14));
				info.setUsername(rs.getString(15));
				info.setEmail(rs.getString(16));
				info.setPhone(rs.getString(17));
				info.setPassword(rs.getString(18));
				info.setStatus(rs.getString(20));
				info.setRetPicture(rs.getString(21));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return info;
	}
	
	
	public RetailerSignup retailerSignup (RetailerSignup rUp) {
		try {
			pst = db.get().prepareStatement("INSERT INTO retailer(name, catagory, business_type, trade_lisence, str_devision, str_district, str_upozela, str_location, del_divison, del_district, del_upozela, del_location, owner_name, username, email, phone, password, comment, status) "
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pst.setString(1, rUp.name);
			pst.setString(2, rUp.catagory);
			pst.setString(3, rUp.businessType);
			pst.setString(4, rUp.tradeLisence);
			pst.setString(5, rUp.strDevision);
			pst.setString(6, rUp.strDistrict);
			pst.setString(7, rUp.strUpozela);
			pst.setString(8, rUp.strLocation);
			pst.setString(9, rUp.delDivison);
			pst.setString(10, rUp.delDistrict);
			pst.setString(11, rUp.delUpozela);
			pst.setString(12, rUp.delLocation);
			pst.setString(13, rUp.ownerName);
			pst.setString(14, rUp.username);
			pst.setString(15, rUp.email);
			pst.setString(16, rUp.phone);
			pst.setString(17, rUp.password);
			pst.setString(18, rUp.comment);
			pst.setString(19, rUp.status);
			int x = pst.executeUpdate();
			if( x != -1) {
				return rUp;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	//show all products to Retailer
	public List<RetailerProduct> pList;
	public List<RetailerProduct> showProductToRetailer() {
		pList = new ArrayList<>();
		RetailerProduct pdt;
		try {
			pst = db.get().prepareStatement("SELECT p.p_id, p.manu_id, m.manu_name, p.p_name, p.p_generic, p.price, p.stock, p.picture, p.p_description, p.p_status FROM products p JOIN manufecturear m ON p.manu_id = m.manu_id");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pdt = new RetailerProduct(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getDouble(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10));
				pList.add(pdt);
			}
		} catch (Exception e) {
			System.out.println("Cann.t get product" + e);
		}
		return pList;
	}
	
	
	//get product info by product id
	public RetailerProduct productById4retailer(int id) {
		RetailerProduct pdt = null;
		try {
			pst = db.get().prepareStatement("SELECT p.p_id, p.manu_id, m.manu_name, p.p_name, p.p_generic, p.price, p.stock, p.picture, p.p_description, p.p_status FROM products p JOIN manufecturear m ON p.manu_id = m.manu_id WHERE p.p_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pdt = new RetailerProduct(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getDouble(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10));
			}
		} catch (Exception e) {
			System.out.println("Cann.t get product info by id" + e);
		}
		return pdt;
	}
	
	
	//add to cart 
	public Cart add2Cart(Cart crt) {
		try {
			pst= db.get().prepareStatement("INSERT INTO cart(p_id, p_name, manu_id, manu_name, p_quantity, u_price, t_price, p_picture, ret_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pst.setInt(1, crt.pId);
			pst.setString(2, crt.pName);
			pst.setInt(3, crt.manuId);
			pst.setString(4, crt.manuName);
			pst.setInt(5, crt.pQuantity);
			pst.setDouble(6, crt.uPrice);
			pst.setDouble(7, crt.price);
			pst.setString(8, crt.pPicture);
			pst.setInt(9, crt.retId);
			int x = pst.executeUpdate();
			if( x != -1) {
				return crt;
			}
		} catch (Exception e ) {
			System.out.println("can't add to cart" + e);

		}
		return null;
	}
	
	
	//get cart information by retailer id

	public List<Cart> showCart( int id) {
		List<Cart> cartList = new ArrayList<>();
		
		Cart pdt;
		try {
			pst = db.get().prepareStatement("SELECT * FROM cart WHERE ret_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				pdt = new Cart();
				pdt.setCartId(rs.getInt(1));
				pdt.setpId(rs.getInt(2));
				pdt.setpName(rs.getString(3));
				pdt.setManuId(rs.getInt(4));
				pdt.setManuName(rs.getString(5));
				pdt.setpQuantity(rs.getInt(6));
				pdt.setuPrice(rs.getDouble(7));
				pdt.setPrice(rs.getDouble(8));
				pdt.setpPicture(rs.getString(9));
				pdt.setRetId(rs.getInt(10));
				cartList.add(pdt);
			}
			
		} catch (Exception e) {
			System.out.println("can't get cart info" + e);
		}

		return cartList;
	}
	
	
	//delete all cart items
	public void deleteAllCartItems (Cart cart) {
		try {
			pst = db.get().prepareStatement("DELETE FROM cart WHERE ret_id = ?");
			pst.setInt(1, cart.retId);
			pst.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(" " + e);
		}
	}
	
	
	//delete one cart items
	public void deleteOneCartItems (Cart cart) {
		try {
			pst = db.get().prepareStatement("DELETE FROM cart WHERE cart_id = ?");
			pst.setInt(1, cart.cartId);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(" " + e);
		}
	}
	
	
	//update cart
	public void updateCart(Cart crt) {
		try {
			pst = db.get().prepareStatement("UPDATE cart SET p_quantity = ?, t_price = ? WHERE cart_id = ?");
			pst.setInt(1, crt.pQuantity);
			pst.setDouble(2, crt.price);
			pst.setInt(3, crt.cartId);
			pst.executeUpdate();
		} catch (Exception e ) {
			System.out.println("can't add to cart" + e);

		}
	}
	
	//place order
	public Order placeOrder(Order a) {
		try {
			pst = db.get().prepareStatement("INSERT INTO orders(o_date, ret_id, manu_id, o_amount, discount, vat, net_payable, del_devision, del_district, del_upozela, del_location, del_date, status, subtotal) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			pst.setDate(1, a.getoDate());
			pst.setInt(2, a.getRetId());
			pst.setInt(3, a.getManuId());
			pst.setDouble(4, a.getoAmount());
			pst.setDouble(5, a.getDiscount());
			pst.setDouble(6, a.getVat());
			pst.setDouble(7, a.getNetPayable());
			pst.setString(8, a.getDelDevision());
			pst.setString(9, a.getDelDistrict());
			pst.setString(10, a.getDelUpozela());
			pst.setString(11, a.getDelLocation());
			pst.setDate(12, a.getDelDate());
			pst.setString(13, a.getStatus());
			pst.setDouble(14, a.getSubtotal());
			
			int x = pst.executeUpdate();
			if (x != -1) {
				ResultSet generatedKeys = pst.getGeneratedKeys();
				int generatedId = 0;
				if (generatedKeys.next()) {
					generatedId = generatedKeys.getInt(1);
					a.setoId(generatedId);
				}
				
				List<Invoice> orderItems = a.getOrderItems();
				PreparedStatement pst2 = db.get().prepareStatement("INSERT INTO invoice(o_id, manu_id, p_id, p_name, u_price, p_quantity, price) VALUES(?, ?, ?, ?, ?, ?, ?)");
				
				for (Invoice inv : orderItems) {
					pst2.setInt(1, generatedId);
					pst2.setInt(2, inv.getManuId());
					pst2.setInt(3, inv.getpId());
					pst2.setString(4, inv.getpName());
					pst2.setDouble(5, inv.getuPrice());
					pst2.setInt(6, inv.getpQuantity());
					pst2.setDouble(7, inv.getPrice());
					pst2.addBatch();
				}
				pst2.executeBatch();
				pst = db.get().prepareStatement("DELETE FROM cart WHERE ret_id = ?");
				pst.setInt(1, a.getRetId());
				pst.executeUpdate();
			}
			
			
		} catch(Exception e) {
			System.out.println(e);
		}
		return a;
	}
	
	//get order information by retailer id
	public List<Order> getOrderInfoByRetailerId(int id) {
		List<Order> getOrderInfo = new ArrayList<>();
		Order odr;
		try {
			pst = db.get().prepareStatement("SELECT * FROM orders WHERE ret_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				odr = new Order();
				odr.setoId(rs.getInt(1));
				odr.setoDate(rs.getDate(2));
				odr.setRetId(rs.getInt(3));
				odr.setManuId(rs.getInt(4));
				odr.setoAmount(rs.getDouble(5));
				odr.setDiscount(rs.getDouble(6));
				odr.setVat(rs.getDouble(7));
				odr.setNetPayable(rs.getDouble(8));
				odr.setDelDevision(rs.getString(9));
				odr.setDelDistrict(rs.getString(10));
				odr.setDelUpozela(rs.getString(11));
				odr.setDelLocation(rs.getString(12));
				odr.setDelDate(rs.getDate(13));
				odr.setStatus(rs.getString(14));
				odr.setSubtotal(rs.getDouble(15));
				getOrderInfo.add(odr);
			}
			
		} catch(Exception e ) {
			System.out.println(e);
		}
		
		return getOrderInfo;
	}
	
	
	//get order information by order id
	public Order getOrderInfoByOrderId(int id) {
		Order odr = null;
		try {
			pst = db.get().prepareStatement("SELECT * FROM orders WHERE o_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				odr = new Order();
				odr.setoId(rs.getInt(1));
				odr.setoDate(rs.getDate(2));
				odr.setRetId(rs.getInt(3));
				odr.setManuId(rs.getInt(4));
				odr.setoAmount(rs.getDouble(5));
				odr.setDiscount(rs.getDouble(6));
				odr.setVat(rs.getDouble(7));
				odr.setNetPayable(rs.getDouble(8));
				odr.setDelDevision(rs.getString(9));
				odr.setDelDistrict(rs.getString(10));
				odr.setDelUpozela(rs.getString(11));
				odr.setDelLocation(rs.getString(12));
				odr.setDelDate(rs.getDate(13));
				odr.setStatus(rs.getString(14));
				odr.setSubtotal(rs.getDouble(15));	
				
				PreparedStatement pst2 = db.get().prepareStatement("SELECT * FROM invoice WHERE o_id = ?");
				pst2.setInt(1, id);
				ResultSet rs2 = pst2.executeQuery();
				List<Invoice> getInvoiceInfo = new ArrayList<>();
				Invoice inv;
				while(rs2.next()) {
					inv = new Invoice();
					inv.setiNo(rs2.getInt(1));
					inv.setoId(rs2.getInt(2));
					inv.setManuId(rs2.getInt(3));
					inv.setpId(rs2.getInt(4));
					inv.setpName(rs2.getString(5));
					inv.setuPrice(rs2.getDouble(6));
					inv.setpQuantity(rs2.getInt(7));
					inv.setPrice(rs2.getDouble(8));
					getInvoiceInfo.add(inv);
				}
				odr.setOrderItems(getInvoiceInfo);
				return odr;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	//add2wishlist
	public Wishlist add2wishlist(Wishlist wsl) {
		try {
			pst= db.get().prepareStatement("INSERT INTO wishlist(p_id, p_name, ret_id, ret_name, manu_id, manu_name, "
					+ "p_quantity, u_price, price, p_picture) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pst.setInt(1, wsl.pId);
			pst.setString(2, wsl.pName);
			pst.setInt(3, wsl.retId);
			pst.setString(4, wsl.retName);
			pst.setInt(5, wsl.manuId);
			pst.setString(6, wsl.manuName);
			pst.setInt(7, wsl.pQuantity);
			pst.setDouble(8, wsl.uPrice);
			pst.setDouble(9, wsl.price);
			pst.setString(10, wsl.pPicture);
			int x = pst.executeUpdate();
			if( x != -1) {
				return wsl;
			}
		} catch (Exception e ) {
			System.out.println("can't add to wishlist" + e);

		}
		return null;
	}
	
	
	//get wish list by retailer id
	public List<Wishlist> showWishlist( int id) {
		List<Wishlist> wishList = new ArrayList<>();
		
		Wishlist wList;
		try {
			pst = db.get().prepareStatement("SELECT * FROM wishlist WHERE ret_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				wList = new Wishlist();
				wList.setwId(rs.getInt(1));
				wList.setpId(rs.getInt(2));
				wList.setpName(rs.getString(3));
				wList.setRetId(rs.getInt(4));
				wList.setRetName(rs.getString(5));
				wList.setManuId(rs.getInt(6));
				wList.setManuName(rs.getString(7));
				wList.setpQuantity(rs.getInt(8));
				wList.setuPrice(rs.getDouble(9));
				wList.setPrice(rs.getDouble(10));
				wList.setpPicture(rs.getString(11));
				wishList.add(wList);
			}
		} catch (Exception e) {
			System.out.println("can't get wishlist info" + e);
		}
		return wishList;
	}
	
	//delete from wish list by product id
	public void deleteWishlistByProductId (Wishlist wlist) {
		try {
			pst = db.get().prepareStatement("DELETE FROM wishlist WHERE p_id = ?");
			pst.setInt(1, wlist.pId);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(" " + e);
		}
	}
	
	//delete from wish list by w_id
	public void deleteWishlistByWishlistId (Wishlist wlist) {
		try {
			pst = db.get().prepareStatement("DELETE FROM wishlist WHERE w_id = ?");
			pst.setInt(1, wlist.wId);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(" " + e);
		}
	}
	
	//delete from wish list by retailer id
	public void deleteWishlistByRetailerId (Wishlist wlist) {
		try {
			pst = db.get().prepareStatement("DELETE FROM wishlist WHERE ret_id = ?");
			pst.setInt(1, wlist.retId);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(" " + e);
		}
	}
}
