package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Country;
import services.CountryService;

@Controller
@Component

public class  CountryController {
	@Autowired
	private CountryService countryservice;
	@GetMapping("/country")
	public String getcountry(Model model) {
		List<Country> counrtyList = countryservice.getCountries();
		model.addAttribute("countries",counrtyList);
		return "country";
	}
	@PostMapping("/country/addNew")
	public String addNew(Country country) {
		countryservice.save(country);
		return "redirect:/country";
	}
	@RequestMapping("country/findbyId")
	@ResponseBody
	public Optional<Country> findById(int id) {
		return countryservice.findById(id);
		
	}
	@RequestMapping(value="/country/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Country country) {
		countryservice.save(country);
		return "redirect:/country";
	}
	@RequestMapping(value="/country/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		countryservice.delete(id);
		return "redirect:/country";
	}


}
