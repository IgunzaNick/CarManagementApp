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

import model.Supplier;
import model.Country;
import model.State;
import services.SupplierService;
import services.CountryService;
import services.StateService;


@Controller

public class  SupplierController {
	@Autowired
	private SupplierService Supplierservice;
	@Autowired
	private CountryService countryservice;
	@Autowired
	private StateService stateservice;
	@GetMapping("/supplier")
	public String getSupplier(Model model) {
		List<Supplier> supplierList = Supplierservice.getSupplier();
		model.addAttribute("suppliers",supplierList);
		
		List<Country> countryList = countryservice.getCountries();
		model.addAttribute("country",countryList);
		
		List<State> stateList = stateservice.getState();
		model.addAttribute("state",stateList);
		return "Supplier";
	}
	@PostMapping("/supplier/addNew")
	public String addNew(Supplier Supplier) {
		Supplierservice.save(Supplier);
		return "redirect:/supplier";
	}
	@RequestMapping("supplier/findbyId")
	@ResponseBody
	public Optional<Supplier> findById(int id) {
		return Supplierservice.findById(id);
		
	}
	@RequestMapping(value="/supplier/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Supplier Supplier) {
		Supplierservice.save(Supplier);
		return "redirect:/supplier";
	}
	@RequestMapping(value="/supplier/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		Supplierservice.delete(id);
		return "redirect:/supplier";
	}

}
