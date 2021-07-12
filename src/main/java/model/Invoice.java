package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Invoice {	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Invoiceid;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date invoiceDate;
	
	@ManyToOne
	@JoinColumn(name="invoicestatusid", insertable=false, updatable=false)	
	private InvoiceStatuses invoiceStatus;
	private Integer invoicestatusid;
	
	@ManyToOne
	@JoinColumn(name="clientid", insertable=false, updatable=false)	
	private Client client;
	private Integer clientid;
	
	private String remarks;

	public Integer getInvoiceid() {
		return Invoiceid;
	}

	public void setInvoiceid(Integer invoiceid) {
		Invoiceid = invoiceid;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public InvoiceStatuses getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(InvoiceStatuses invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Integer getInvoicestatusid() {
		return invoicestatusid;
	}

	public void setInvoicestatusid(Integer invoicestatusid) {
		this.invoicestatusid = invoicestatusid;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}	
	
}
