package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Client;
import model.Country;
import model.Invoice;
import services.ClientService;
import services.CountryService;
import services.InvoiceService;


@Controller

public class  InvoiceController {
	@Autowired
	private InvoiceService Invoiceservice;
	@Autowired
	private ClientService clientservice;
	@GetMapping("/invoice")
	public String getInvoice(Model model) {
		List<Invoice> invoiceList = Invoiceservice.getInvoice();
		model.addAttribute("invoices",invoiceList);
		
		List<Client> clientList = clientservice.getClient();
		model.addAttribute("client",clientList);
		return "Invoice";
	}
	@PostMapping("/invoice/addNew")
	public String addNew(Invoice Invoice) {
		Invoiceservice.save(Invoice);
		return "redirect:/invoice";
	}
	@RequestMapping("invoice/findbyId")
	@ResponseBody
	public Optional<Invoice> findById(int id) {
		return Invoiceservice.findById(id);
		
	}
	@RequestMapping(value="/invoice/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Invoice Invoice) {
		Invoiceservice.save(Invoice);
		return "redirect:/invoice";
	}
	@RequestMapping(value="/invoice/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		Invoiceservice.delete(id);
		return "redirect:/invoice";
	}

}
