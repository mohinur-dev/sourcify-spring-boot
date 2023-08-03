package com.sourcify.manufecturear;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sourcify.retailer.Order;
import com.sourcify.util.db;


public class ManufecturearDA {
	Connection con;
	PreparedStatement pst;
	
	
	//menu-sign in
	public ManufecturearSignin manufecturearSignin(ManufecturearSignin menufec) {
		ManufecturearSignin info = null;
		try {
			pst = db.get().prepareStatement("SELECT * FROM manufecturear WHERE username=? AND password=?");
			pst.setString(1, menufec.username);
			pst.setString(2, menufec.password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				info = new ManufecturearSignin();
				info.setManuId(rs.getInt(1));
				info.setManuName(rs.getString(2));
				info.setProductType(rs.getString(3));
				info.setWebsite(rs.getString(4));
				info.setEmail(rs.getString(5));
				
				info.setRepName(rs.getString(6));
				info.setRepDeg(rs.getString(7));
				info.setRepEmail(rs.getString(8));
				info.setRepPhone(rs.getString(9));
				
				info.setBank(rs.getString(10));
				info.setBranch(rs.getString(11));
				info.setAccName(rs.getString(12));
				info.setAccType(rs.getString(13));
				info.setAccNumber(rs.getString(14));
				info.setAccRoutingNum(rs.getString(15));
				
				info.setCoDivision(rs.getString(16));
				info.setCoDistrict(rs.getString(17));
				info.setCoUpozla(rs.getString(18));
				info.setCoLocation(rs.getString(19));
				
				info.setFacDivision(rs.getString(20));
				info.setFacDictrict(rs.getString(21));
				info.setFacUpozela(rs.getString(22));
				info.setFacLocation(rs.getString(23));
				
				info.setUsername(rs.getString(24));
				info.setPassword(rs.getString(25));
				info.setStatus(rs.getString(26));
				info.setComments(rs.getString(27));
				info.setManuPicture(rs.getString(28));
	
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return info;
	}
	
	
	//menu sign up
	public void signupManufecturear(ManufecturearSignup mUp) {
		try {
			pst = db.get().prepareStatement("INSERT INTO manufecturear(manu_name, product_type, website, email, rep_name, rep_deg, rep_email, rep_phone, "
					+ "bank, branch, acc_name, acc_type, acc_number, acc_routing_num, co_division, co_district, co_upozla, co_location, fac_division,"
					+ " fac_dictrict, fac_upozela, fac_location, username, password, status, comments) "
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pst.setString(1, mUp.name);
			pst.setString(2, mUp.productType);
			pst.setString(3, mUp.website);
			pst.setString(4, mUp.email);
			pst.setString(5, mUp.repName);
			pst.setString(6, mUp.repDeg);
			pst.setString(7, mUp.repEmail);
			pst.setString(8, mUp.repPhone);
			pst.setString(9, mUp.bank);
			pst.setString(10, mUp.branch);
			pst.setString(11, mUp.accName);
			pst.setString(12, mUp.accType);
			pst.setString(13, mUp.accNumber);
			pst.setString(14, mUp.accRoutingNum);
			pst.setString(15, mUp.coDivision);
			pst.setString(16, mUp.coDistrict);
			pst.setString(17, mUp.coUpozla);
			pst.setString(18, mUp.coLocation);
			pst.setString(19, mUp.facDivision);
			pst.setString(20, mUp.facDictrict);
			pst.setString(21, mUp.facUpozela);
			pst.setString(22, mUp.facLocation);
			pst.setString(23, mUp.username);
			pst.setString(24, mUp.password);
			pst.setString(25, mUp.status);
			pst.setString(26, mUp.comments);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//add product
	public void addProduct(Product pdt) {
		try {
			pst = db.get().prepareStatement("INSERT INTO products(p_id, manu_id, p_name, p_generic, price, stock, picture, p_description, p_status) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pst.setString(1, pdt.pId);
			pst.setString(2, pdt.manuId);
			pst.setString(3, pdt.pName);
			pst.setString(4, pdt.pGeneric);
			pst.setDouble(5, pdt.uPrice);
			pst.setInt(6, pdt.pStock);
			pst.setString(7, pdt.pPicture);
			pst.setString(8, pdt.pDescription);
			pst.setString(9, pdt.pStatus);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	//show all products
	public List<Product> pList;
	
	public List<Product> showProduct() {
		pList = new ArrayList<>();
		Product pdt;
		try {
			pst = db.get().prepareStatement("SELECT * FROM products");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pdt = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9));
				pList.add(pdt);
			}
		} catch (Exception e) {
			System.out.println("Cann.t get product" + e);
		}
		return pList;
	}
	
	//get product info by menu id
	public List<Product> getProductByManuId(int id) {
		List<Product> productList = new ArrayList<>();
		Product pdt;
		try {
			pst = db.get().prepareStatement("SELECT * FROM products WHERE manu_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				pdt = new Product();
				pdt.setpId(rs.getString(1));
				pdt.setManuId(rs.getString(2));
				pdt.setpName(rs.getString(3));
				pdt.setpGeneric(rs.getString(4));
				pdt.setuPrice(rs.getDouble(5));
				pdt.setpStock(rs.getInt(6));
				pdt.setpPicture(rs.getString(7));
				pdt.setpDescription(rs.getString(8));
				pdt.setpStatus(rs.getString(9));
				productList.add(pdt);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return productList;
	}
	
	
	
	//get product info by product id
	public Product productById(int id) {
		Product pdt = null;
		try {
			pst = db.get().prepareStatement("SELECT * FROM products WHERE p_id=" + id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pdt = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9));
			}
		} catch (Exception e) {
			System.out.println("Cann.t get product info by id" + e);
		}
		return pdt;
	}
    
	 //delete product method
	 public void delete(Product pdt){
	     try {
	    	 pst = db.get().prepareStatement("DELETE FROM products WHERE p_id = ?");
	         pst.setString(1, pdt.pId);
	         pst.executeUpdate();
	     } catch (Exception e) {
	    	 System.out.println("Cann't delete product" + e);
	     }  
	 }
	
		 //update product method
		 public void update(Product pdt){
	        try {
	            pst = db.get().prepareStatement("UPDATE products SET manu_id = ?, p_name = ?, p_generic = ?, price = ?, stock = ?, picture = ?, p_description = ?, p_status = ? WHERE p_id = ?");
	            pst.setString(1, pdt.manuId);
	            pst.setString(2, pdt.pName);
				pst.setString(3, pdt.pGeneric);
				pst.setDouble(4, pdt.uPrice);
				pst.setInt(5, pdt.pStock);
				pst.setString(6, pdt.pPicture);
				pst.setString(7, pdt.pDescription);
				pst.setString(8, pdt.pStatus);
				pst.setString(9, pdt.pId);
	            pst.executeUpdate();
	        } catch (Exception e) {
	        	System.out.println("Cann't update product" + e);
	        }
	    }
		 
		 
		//get order information by manufacturer id
		public List<Order> getOrderInfoByManufacturerId(int id) {
			List<Order> getOrderInfo = new ArrayList<>();
			Order odr;
			try {
				pst = db.get().prepareStatement("SELECT * FROM orders WHERE manu_id = ?");
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
	 

}
