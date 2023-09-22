package com.sourcify.reports;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ReportControler {
	ReportDA rda = new ReportDA();

	@GetMapping(value = "/invoice/{id}", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<byte[]> genarateInvoice(@PathVariable("id") int id) {
		try {
			Invoice inv = rda.getInvoice(id);

			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(inv.getInvoiceItems(), false);
			Map<String, Object> param = new HashMap<>();			
			param.put("delDate", inv.getDelDate());
			param.put("ordDate", inv.getOrdDate());
			param.put("invNum", inv.getInvNum());
			param.put("ordStatus", inv.getOrdStatus());
			param.put("manuName", inv.getManuName());
			param.put("manuId", inv.getManuId());
			param.put("manuLocation", inv.getManuLocation());
			param.put("manuDevision", inv.getManuDevision());
			param.put("manuDistrict", inv.getManuDistrict());
			param.put("manuUpozela", inv.getManuUpozela());
			param.put("manuRep", inv.getManuRep());
			param.put("manuRepPhone", inv.getManuRepPhone());
			param.put("retName", inv.getRetName());
			param.put("retId", inv.getRetId());
			param.put("retLocation", inv.getRetLocation());
			param.put("retDevision", inv.getRetDevision());
			param.put("retDistrict", inv.getRetDistrict());
			param.put("retUpozela", inv.getRetUpozela());
			param.put("retOwnerName", inv.getRetOwnerName());
			param.put("retPhone", inv.getRetPhone());
			param.put("subTotal", inv.getSubTotal());
			param.put("discount", inv.getDiscount());
			param.put("vat", inv.getVat());
			param.put("netPayable", inv.getNetPayable());

			JasperReport compileReport = JasperCompileManager
					.compileReport(new FileInputStream("src/main/resources/templates/Invoice.jrxml"));
			JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, param, dataSource);
			byte[] data = JasperExportManager.exportReportToPdf(jasperPrint);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");
			return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
		} catch (FileNotFoundException | JRException e) {
			System.out.println(e);
		}
		return null;
	}
	
	
	@GetMapping(value ="/invoice-information/{id}")
	public Invoice getOrderInfo(@PathVariable("id") int id) {
		ReportDA reportDA = new ReportDA();
		return reportDA.getInvoice(id);
	}
}
