package com.sourcify.revenue;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sourcify.util.db;

public class RevenueDA {
	PreparedStatement pst;

	public void insertInfoIntoRevenue(Revenue rev) {
		try {
			pst = db.get().prepareStatement("INSERT INTO "
					+ "revenue(order_id, manu_id, ret_id, order_date, delivary_date, order_amount, vat, discount, ret_pay, platform_com, manu_earning, status) "
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			pst.setInt(1, rev.orderId);
			pst.setInt(2, rev.manuId);
			pst.setInt(3, rev.retId);
			pst.setDate(4, rev.orderDate);
			pst.setDate(5, rev.delivaryDate);
			pst.setDouble(6, rev.orderAmount);
			pst.setDouble(7, rev.vat);
			pst.setDouble(8, rev.discount);
			pst.setDouble(9, rev.retPay);
			pst.setDouble(10, rev.platformCom);
			pst.setDouble(11, rev.manuEarning);
			pst.setString(12, rev.status);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("");
		}
	}

	// delete form revenue
	public void deleteFormRevenue(Revenue rev) {
		try {
			pst = db.get().prepareStatement("DELETE FROM revenue WHERE order_id = ?");
			pst.setInt(1, rev.orderId);
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("");
		}
	}
	

	// show revenue by manufacturer
//	public List<Revenue> showRevenue(int id) {
//		List<Revenue> revenueList = new ArrayList<>();
//		Revenue rev;
//		try {
//			pst = db.get().prepareStatement("SELECT * FROM revenue WHERE manu_id = ?");
//			pst.setInt(1, id);
//			ResultSet rs = pst.executeQuery();
//			while (rs.next()) {
//				rev = new Revenue(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getDate(5), rs.getDate(6),
//						rs.getDouble(7), rs.getDouble(8), rs.getDouble(9), rs.getDouble(10), rs.getDouble(11),
//						rs.getDouble(12), rs.getString(13));
//				revenueList.add(rev);
//
//			}
//		} catch (Exception e) {
//			System.out.println("can't get revenue list");
//		}
//
//		return revenueList;
//	}
	

	// show revenue by manufacturer id in details
	public List<RevenueDto> showRevenueDetails(int id) {
		List<RevenueDto> revenueList = new ArrayList<>();
		RevenueDto rev;
		try {
			pst = db.get().prepareStatement("SELECT rev.rev_id, rev.order_id, rev.manu_id, rev.ret_id, rev.order_date, rev.delivary_date, "
					+ "rev.order_amount, rev.vat, rev.discount, rev.ret_pay, rev.platform_com, rev.manu_earning, rev.status, ret.id, ret.name, "
					+ "ret.owner_name, ret.phone, ret.email FROM revenue rev JOIN retailer ret ON rev.ret_id = ret.id WHERE rev.manu_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				rev = new RevenueDto();
				rev.setRevId(rs.getInt(1));
				rev.setOrderId(rs.getInt(2));
				rev.setManuId(rs.getInt(3));
				rev.setRetId(rs.getInt(4));
				rev.setOrderDate(rs.getDate(5));
				rev.setDelivaryDate(rs.getDate(6));
				rev.setOrderAmount(rs.getDouble(7));
				rev.setVat(rs.getDouble(8));
				rev.setDiscount(rs.getDouble(9));
				rev.setRetPay(rs.getDouble(10));
				rev.setPlatformCom(rs.getDouble(11));
				rev.setManuEarning(rs.getDouble(12));
				rev.setStatus(rs.getString(13));
//				rev.setRetId(rs.getInt(14));
				rev.setRetName(rs.getString(15));
				rev.setOwnerName(rs.getString(16));
				rev.setRetPhone(rs.getString(17));
				rev.setRetEmail(rs.getString(18));
				
				revenueList.add(rev);

			}
		} catch (Exception e) {
			System.out.println("can't get revenue list");
		}

		return revenueList;
	}
	
	
	public List<ManufacturerRevenue> totalManufacturerRevenue () {
		List<ManufacturerRevenue> totalRevenue = new ArrayList<>();
		ManufacturerRevenue mr;
		try {
			pst = db.get().prepareStatement("SELECT m.manu_id, m.manu_name, m.email, SUM(r.order_amount) AS total_order_amount, SUM(r.vat) AS total_vat, SUM(r.discount) AS total_discount, SUM(r.ret_pay) AS total_ret_pay, SUM(r.platform_com) AS total_platform_com, SUM(r.manu_earning) AS total_manu_earning FROM manufecturear m JOIN revenue r ON m.manu_id = r.manu_id GROUP BY m.manu_id, m.manu_name, m.email");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				mr = new ManufacturerRevenue();
				mr.setManu_id(rs.getInt(1));
				mr.setManuName(rs.getString(2));
				mr.setEmail(rs.getString(3));
				mr.setTotalOrderAmount(rs.getDouble(4));
				mr.setTotalVAT(rs.getDouble(5));
				mr.setTotalDiscount(rs.getDouble(6));
				mr.setTotalRetPay(rs.getDouble(7));
				mr.setTotalPlatformCom(rs.getDouble(8));
				mr.setTotalManuEarning(rs.getDouble(9));
				totalRevenue.add(mr);
				
			}
		} catch (Exception e) {
			System.out.println("Can not get revenue total");
		}
		
		return totalRevenue;
	}
	
	
	
	// show revenue by retailer id in details
		public List<RetailerDto> showRevenueDetailsByRetailer(int id) {
			List<RetailerDto> revenueList = new ArrayList<>();
			RetailerDto ret;
			try {
				pst = db.get().prepareStatement("SELECT rev.rev_id, rev.order_id, rev.ret_id, rev.manu_id, rev.order_date, rev.delivary_date, rev.order_amount, rev.vat, rev.discount, rev.ret_pay, rev.platform_com, rev.manu_earning, rev.status, manu.manu_id, manu.manu_name, manu.rep_name, manu.rep_phone, manu.rep_email FROM revenue rev JOIN manufecturear manu ON rev.manu_id = manu.manu_id WHERE rev.ret_id = ?");
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					ret = new RetailerDto();
					ret.setRevId(rs.getInt(1));
					ret.setOrderId(rs.getInt(2));
					ret.setRetId(rs.getInt(3));
					ret.setManuId(rs.getInt(4));
					ret.setOrderDate(rs.getDate(5));
					ret.setDelivaryDate(rs.getDate(6));
					ret.setOrderAmount(rs.getDouble(7));
					ret.setVat(rs.getDouble(8));
					ret.setDiscount(rs.getDouble(9));
					ret.setRetPay(rs.getDouble(10));
					ret.setPlatformCom(rs.getDouble(11));
					ret.setManuEarning(rs.getDouble(12));
					ret.setStatus(rs.getString(13));
//					ret.setManuId(rs.getInt(14));
					ret.setManuName(rs.getString(15));
					ret.setRepName(rs.getString(16));
					ret.setRetPhone(rs.getString(17));
					ret.setRetEmail(rs.getString(18));
					
					revenueList.add(ret);

				}
			} catch (Exception e) {
				System.out.println("can't get revenue list");
			}

			return revenueList;
		}
		
	
	
	//get total calculation of retailer
	public List<RetailerRevenue> totalRetailerRevenue () {
		List<RetailerRevenue> totalRevenue = new ArrayList<>();
		RetailerRevenue mr;
		try {
			pst = db.get().prepareStatement("SELECT ret.id, ret.name, ret.email, SUM(rev.order_amount) AS total_order_amount, SUM(rev.vat) AS total_vat, SUM(rev.discount) AS total_discount, SUM(rev.ret_pay) AS total_ret_pay, SUM(rev.platform_com) AS total_platform_com, SUM(rev.manu_earning) AS total_manu_earning FROM retailer ret JOIN revenue  rev ON ret.id = rev.ret_id GROUP BY ret.id, ret.name, ret.email");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				mr = new RetailerRevenue();
				mr.setRetId(rs.getInt(1));
				mr.setRetName(rs.getString(2));
				mr.setRetEmail(rs.getString(3));
				mr.setTotalOrderAmount(rs.getDouble(4));
				mr.setTotalVAT(rs.getDouble(5));
				mr.setTotalDiscount(rs.getDouble(6));
				mr.setTotalRetPay(rs.getDouble(7));
				mr.setTotalPlatformCom(rs.getDouble(8));
				mr.setTotalManuEarning(rs.getDouble(9));
				totalRevenue.add(mr);
				
			}
		} catch (Exception e) {
			System.out.println("Can not get revenue total");
		}
		
		return totalRevenue;
	}
}
