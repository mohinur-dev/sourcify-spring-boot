package com.sourcify.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.sourcify.retailer.Order;
import com.sourcify.retailer.ProductRequest;
import com.sourcify.util.db;

public class AdminDA {
	Connection con;
	PreparedStatement pst;

	// admin's sign in
	public AdminSignin adminSignin(AdminSignin admin) {
		AdminSignin info = null;
		try {
			pst = db.get().prepareStatement("SELECT * FROM admin WHERE username=? AND password=?");
			pst.setString(1, admin.username);
			pst.setString(2, admin.password);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				info = new AdminSignin();
				info.setId(rs.getInt(1));
				info.setUsername(rs.getString(5));
				info.setPassword(rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return info;
	}

	// get admin's information
	public AdminInfo getAdminInfoById(int id) {
		AdminInfo info = null;
		try {
			pst = db.get().prepareStatement("SELECT * FROM admin WHERE id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				info = new AdminInfo();
				info.setId(rs.getInt(1));
				info.setName(rs.getString(2));
				info.setRole(rs.getString(3));
				info.setEmail(rs.getString(4));
				info.setUsername(rs.getString(5));
				info.setPassword(rs.getString(6));
				info.setPicture(rs.getString(7));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return info;
	}

	// get retailer information
	public List<Retailer> getRetailerInfo() {
		List<Retailer> getRetailerList = new ArrayList<>();
		Retailer info;
		try {
			pst = db.get().prepareStatement("SELECT * FROM retailer");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				info = new Retailer();
				info.setId(rs.getInt(1));
				info.setName(rs.getString(2));
				info.setCatagory(rs.getString(3));
				info.setBusinessType(rs.getString(4));
				info.setTradeLisence(rs.getString(5));
				info.setStrDevision(rs.getString(6));
				info.setStrDistrict(rs.getString(7));
				info.setStrUpozela(rs.getString(8));
				info.setStrLocation(rs.getString(9));
				info.setDelDivison(rs.getString(10));
				info.setDelDistrict(rs.getString(11));
				info.setDelUpozela(rs.getString(12));
				info.setDelLocation(rs.getString(13));
				info.setOwnerName(rs.getString(14));
				info.setUsername(rs.getString(15));
				info.setEmail(rs.getString(16));
				info.setPhone(rs.getString(17));
				info.setPassword(rs.getString(18));
				info.setComment(rs.getString(19));
				info.setStatus(rs.getString(20));
				info.setRetPicture(rs.getString(21));
				getRetailerList.add(info);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return getRetailerList;
	}

	// get retailer info by retailer id
	public Retailer getRetailerInfoById(int id) {
		Retailer info = null;
		try {
			pst = db.get().prepareStatement("SELECT * FROM retailer WHERE id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				info = new Retailer();
				info.setId(rs.getInt(1));
				info.setName(rs.getString(2));
				info.setCatagory(rs.getString(3));
				info.setBusinessType(rs.getString(4));
				info.setTradeLisence(rs.getString(5));
				info.setStrDevision(rs.getString(6));
				info.setStrDistrict(rs.getString(7));
				info.setStrUpozela(rs.getString(8));
				info.setStrLocation(rs.getString(9));
				info.setDelDivison(rs.getString(10));
				info.setDelDistrict(rs.getString(11));
				info.setDelUpozela(rs.getString(12));
				info.setDelLocation(rs.getString(13));
				info.setOwnerName(rs.getString(14));
				info.setUsername(rs.getString(15));
				info.setEmail(rs.getString(16));
				info.setPhone(rs.getString(17));
				info.setPassword(rs.getString(18));
				info.setComment(rs.getString(19));
				info.setStatus(rs.getString(20));
				info.setRetPicture(rs.getString(21));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return info;
	}

	// get manufacturer information
	public List<Manufecturear> getManufecturearInfo() {
		List<Manufecturear> getManufecturearList = new ArrayList<>();
		Manufecturear info;
		try {
			pst = db.get().prepareStatement("SELECT * FROM manufecturear");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				info = new Manufecturear();
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
				info.setFacDistrict(rs.getString(21));
				info.setFacUpozela(rs.getString(22));
				info.setFacLocation(rs.getString(23));
				info.setUsername(rs.getString(24));
				info.setPassword(rs.getString(25));
				info.setStatus(rs.getString(26));
				info.setComments(rs.getString(27));
				info.setManuPicture(rs.getString(28));
				getManufecturearList.add(info);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return getManufecturearList;
	}

	// get manufacturer info by id
	public Manufecturear getManufecturearInfoById(int id) {
		Manufecturear info = null;
		try {
			pst = db.get().prepareStatement(
					"SELECT manu_id, manu_name, product_type, website, email, rep_name, rep_deg, rep_email, rep_phone, bank, branch, acc_name, acc_type, acc_number, acc_routing_num, co_division, co_district, co_upozla, co_location, fac_division, fac_district, fac_upozela, fac_location, username, password, status, comments, manu_picture FROM manufecturear WHERE manu_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				info = new Manufecturear();
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
				info.setFacDistrict(rs.getString(21));
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

	// get all order information
	public List<Order> getOrderList() {
		List<Order> getOrderInfo = new ArrayList<>();
		Order odr;
		try {
			pst = db.get().prepareStatement("SELECT * FROM orders");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
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

		} catch (Exception e) {
			System.out.println(e);
		}

		return getOrderInfo;
	}

	// update retailer informations
	public void updateRetailer(Retailer rtl) {
		try {
			pst = db.get().prepareStatement("UPDATE retailer SET name = ?, catagory = ?, business_type = ?, trade_lisence = ?, str_devision = ?, str_district = ?, str_upozela = ?, str_location = ?, del_divison = ?, del_district = ?, del_upozela = ?, del_location = ?, owner_name = ?, username = ?, email = ?, phone = ?, password = ?, comment = ?, status = ?, ret_picture = ? WHERE id = ?");
			pst.setString(1, rtl.name);
			pst.setString(2, rtl.catagory);
			pst.setString(3, rtl.businessType);
			pst.setString(4, rtl.tradeLisence);
			pst.setString(5, rtl.strDevision);
			pst.setString(6, rtl.strDistrict);
			pst.setString(7, rtl.strUpozela);
			pst.setString(8, rtl.strLocation);
			pst.setString(9, rtl.delDivison);
			pst.setString(10, rtl.delDistrict);
			pst.setString(11, rtl.delUpozela);
			pst.setString(12, rtl.delLocation);
			pst.setString(13, rtl.ownerName);
			pst.setString(14, rtl.username);
			pst.setString(15, rtl.email);
			pst.setString(16, rtl.phone);
			pst.setString(17, rtl.password);
			pst.setString(18, rtl.comment);
			pst.setString(19, rtl.status);
			pst.setString(20, rtl.retPicture);
			pst.setInt(21, rtl.id);
			pst.executeUpdate();
		} catch (Exception ex) {
			System.out.println(ex);
		}

	}

	// update manufacturer informations
	public void updateManufecturear(Manufecturear mnf) {
		try {
			pst = db.get().prepareStatement(
					"UPDATE manufecturear SET manu_name = ?, product_type = ?, website = ?, email = ?, rep_name = ?, rep_deg = ?, rep_email = ?, rep_phone = ?, bank = ?, branch = ?, acc_name = ?, acc_type = ?, acc_number = ?, acc_routing_num = ?, co_division = ?, co_district = ?, co_upozla = ?, co_location = ?, fac_division = ?, fac_district = ?, fac_upozela = ?, fac_location = ?, username = ?, password = ?, status = ?, comments = ?, manu_picture = ? WHERE manu_id = ?");
			pst.setString(1, mnf.manuName);
			pst.setString(2, mnf.productType);
			pst.setString(3, mnf.website);
			pst.setString(4, mnf.email);
			pst.setString(5, mnf.repName);
			pst.setString(6, mnf.repDeg);
			pst.setString(7, mnf.repEmail);
			pst.setString(8, mnf.repPhone);
			pst.setString(9, mnf.bank);
			pst.setString(10, mnf.branch);
			pst.setString(11, mnf.accName);
			pst.setString(12, mnf.accType);
			pst.setString(13, mnf.accNumber);
			pst.setString(14, mnf.accRoutingNum);
			pst.setString(15, mnf.coDivision);
			pst.setString(16, mnf.coDistrict);
			pst.setString(17, mnf.coUpozla);
			pst.setString(18, mnf.coLocation);
			pst.setString(19, mnf.facDivision);
			pst.setString(20, mnf.facDistrict);
			pst.setString(21, mnf.facUpozela);
			pst.setString(22, mnf.facLocation);
			pst.setString(23, mnf.username);
			pst.setString(24, mnf.password);
			pst.setString(25, mnf.status);
			pst.setString(26, mnf.comments);
			pst.setString(27, mnf.manuPicture);
			pst.setInt(28, mnf.manuId);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// show all product to
	public List<AdminProduct> pList;

	public List<AdminProduct> showProductToAdmin() {
		pList = new ArrayList<>();
		AdminProduct pdt;
		try {
			pst = db.get().prepareStatement(
					"SELECT p.p_id, p.manu_id, m.manu_name, p.p_name, p.p_generic, p.price, p.stock, p.picture, p.p_description, p.p_status FROM products p JOIN manufecturear m ON p.manu_id = m.manu_id");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pdt = new AdminProduct();
				pdt.setpId(rs.getInt(1));
				pdt.setManuId(rs.getInt(2));
				pdt.setManuName(rs.getString(3));
				pdt.setpName(rs.getString(4));
				pdt.setpGeneric(rs.getString(5));
				pdt.setuPrice(rs.getDouble(6));
				pdt.setpStock(rs.getInt(7));
				pdt.setpPicture(rs.getString(8));
				pdt.setpDescription(rs.getString(9));
				pdt.setpStatus(rs.getString(10));
				pList.add(pdt);
			}
		} catch (Exception e) {
			System.out.println("Cann.t get product" + e);
		}
		return pList;
	}

	// get product information by id
	public AdminProduct getProductInformationById(int id) {
		AdminProduct pdt = null;
		try {
			pst = db.get().prepareStatement(
					"SELECT p.p_id, p.manu_id, m.manu_name, p.p_name, p.p_generic, p.price, p.stock, p.picture, p.p_description, p.p_status FROM products p JOIN manufecturear m ON p.manu_id = m.manu_id WHERE p.p_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				pdt = new AdminProduct();
				pdt.setpId(rs.getInt(1));
				pdt.setManuId(rs.getInt(2));
				pdt.setManuName(rs.getString(3));
				pdt.setpName(rs.getString(4));
				pdt.setpGeneric(rs.getString(5));
				pdt.setuPrice(rs.getDouble(6));
				pdt.setpStock(rs.getInt(7));
				pdt.setpPicture(rs.getString(8));
				pdt.setpDescription(rs.getString(9));
				pdt.setpStatus(rs.getString(10));
			}
		} catch (Exception e) {
			System.out.println("Cann.t get product info by product id" + e);
		}
		return pdt;
	}

	// update product information
	// 
	

	// update order
	public void updateOrderInformation(Order odr) {
		try {
			pst = db.get().prepareStatement(
					"UPDATE orders SET o_amount = ?, discount = ?, vat = ?, net_payable = ?, del_devision = ?, del_district = ?, del_upozela = ?, del_location = ?, del_date = ?, status = ?, subtotal = ? WHERE o_id = ?");
			pst.setDouble(1, odr.getoAmount());
			pst.setDouble(2, odr.getDiscount());
			pst.setDouble(3, odr.getVat());
			pst.setDouble(4, odr.getNetPayable());
			pst.setString(5, odr.getDelDevision());
			pst.setString(6, odr.getDelDistrict());
			pst.setString(7, odr.getDelUpozela());
			pst.setString(8, odr.getDelLocation());
			pst.setDate(9, odr.getDelDate());
			pst.setString(10, odr.getStatus());
			pst.setDouble(11, odr.getSubtotal());
			pst.setInt(12, odr.getoId());
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	//get products request
	public List<ProductRequest>getAllProductRequest() {
		List<ProductRequest> getProduct = new ArrayList<>();
		ProductRequest pdtReq;
		try {
			pst = db.get().prepareStatement("SELECT * FROM product_request");
			ResultSet rs = pst.executeQuery();
            while (rs.next()) {
            	pdtReq = new ProductRequest(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10), rs.getString(11), rs.getString(12));
            	getProduct.add(pdtReq);
            }
		} catch(Exception e) {
			System.out.println("can't get product request");
		}
		return getProduct;
	}

}
