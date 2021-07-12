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

import model.Country;
import model.InvoiceStatuses;
import model.State;
import services.InvoiceStatusesService;


@Controller

public class  InvoiceStatusesController {
	@Autowired
	private InvoiceStatusesService invoicestatusesesservice;
	@GetMapping("/invoicestatuses")
	public String getinvoicestatuses(Model model) {
		
		List<InvoiceStatuses> invoicestatusesList = invoicestatusesesservice.getlocation();
		model.addAttribute("invoicestatuses",invoicestatusesList);
		
		return "InvoiceStatus";
	}
	@PostMapping("/invoicestatuses/addNew")
	public String addNew(InvoiceStatuses invoicestatuses) {
		invoicestatusesesservice.save(invoicestatuses);
		return "redirect:/invoicestatuses";
	}
	@RequestMapping("invoicestatuses/findbyId")
	@ResponseBody
	public Optional<InvoiceStatuses> findById(int id) {
		return invoicestatusesesservice.findById(id);
		
	}
	@RequestMapping(value="/invoicestatuses/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(InvoiceStatuses invoicestatuses) {
		invoicestatusesesservice.save(invoicestatuses);
		return "redirect:/invoicestatuses";
	}
	@RequestMapping(value="/invoicestatuses/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		invoicestatusesesservice.delete(id);
		return "redirect:/invoicestatuses";
	}

}
