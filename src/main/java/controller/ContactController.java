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

import model.Contact;
import model.Country;
import model.State;
import services.ContactService;
import services.CountryService;
import services.StateService;


@Controller

public class  ContactController {
	
	@Autowired
	private ContactService Contactservice;
	@Autowired
	private CountryService countryservice;
	@Autowired
	private StateService stateservice;
	@GetMapping("/contact")
	public String getContact(Model model) {
		List<Contact> contactList = Contactservice.getContact();
		model.addAttribute("contacts",contactList);
		
		List<Country> countryList = countryservice.getCountries();
		model.addAttribute("country",countryList);
		
		List<State> stateList = stateservice.getState();
		model.addAttribute("state",stateList);
		return "Contactt";
	}
	@PostMapping("/contact/addNew")
	public String addNew(Contact Contact) {
		Contactservice.save(Contact);
		return "redirect:/contact";
	}
	@RequestMapping("contact/findbyId")
	@ResponseBody
	public Optional<Contact> findById(int id) {
		return Contactservice.findById(id);
		
	}
	@RequestMapping(value="/contact/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Contact Contact) {
		Contactservice.save(Contact);
		return "redirect:/contact";
	}
	@RequestMapping(value="/contact/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		Contactservice.delete(id);
		return "redirect:/contact";
	}
}



