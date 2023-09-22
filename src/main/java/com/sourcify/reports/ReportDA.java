package com.sourcify.reports;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sourcify.util.db;

public class ReportDA {
	PreparedStatement pst;

	// generate invoice
	public Invoice getInvoice(int invNumber) {
		Invoice inv;
		try {
			pst = db.get().prepareStatement(
					"SELECT o.del_date, o.o_date, o.o_id, o.status, o.manu_id, o.ret_id, m.manu_name, m.co_location, "
							+ "m.co_division, m.co_district, m.co_upozla, m.rep_name, m.rep_phone, r.name, r.owner_name, r.phone, o.del_location, "
							+ "o.del_upozela, o.del_district, o.del_devision, o.subtotal, o.discount, o.vat, o.net_payable "
							+ "FROM orders o JOIN manufecturear m ON o.manu_id = m.manu_id JOIN retailer r ON o.ret_id = r.id WHERE o_id = ?");
			pst.setInt(1, invNumber);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				inv = new Invoice();
				inv.setDelDate(rs.getString(1));
				inv.setOrdDate(rs.getString(2));
				inv.setInvNum(rs.getString(3));
				inv.setOrdStatus(rs.getString(4));
				inv.setManuId(rs.getString(5));
				inv.setRetId(rs.getString(6));
				inv.setManuName(rs.getString(7));
				inv.setManuLocation(rs.getString(8));
				inv.setManuDevision(rs.getString(9));
				inv.setManuDistrict(rs.getString(10));
				inv.setManuUpozela(rs.getString(11));
				inv.setManuRep(rs.getString(12));
				inv.setManuRepPhone(rs.getString(13));
				inv.setRetName(rs.getString(14));
				inv.setRetOwnerName(rs.getString(15));
				inv.setRetPhone(rs.getString(16));
				inv.setRetLocation(rs.getString(17));
				inv.setRetUpozela(rs.getString(18));
				inv.setRetDistrict(rs.getString(19));
				inv.setRetDevision(rs.getString(20));
				inv.setSubTotal(rs.getString(21));
				inv.setDiscount(rs.getString(22));
				inv.setVat(rs.getString(23));
				inv.setNetPayable(rs.getString(24));

				PreparedStatement pst2 = db.get().prepareStatement(
						"SELECT ROW_NUMBER() OVER (ORDER BY p_id) AS sl_number, p_name, u_price, p_quantity, price FROM invoice WHERE o_id = ?");
				pst2.setInt(1, invNumber);
				ResultSet rs2 = pst2.executeQuery();
				List<InvoiceItems> invoiceItems = new ArrayList<>();
				InvoiceItems invIt;
				while (rs2.next()) {
					invIt = new InvoiceItems();
					invIt.setSlNumber(rs2.getString(1));
					invIt.setpName(rs2.getString(2));
					invIt.setuPrice(rs2.getString(3));
					invIt.setpQuantity(rs2.getString(4));
					invIt.setpPrice(rs2.getString(5));
					invoiceItems.add(invIt);
				}
				inv.setInvoiceItems(invoiceItems);
				return inv;
			}
		} catch (Exception e) {
			System.out.println("can not get invoice information" + e);
		}
		return null;
	}

}
