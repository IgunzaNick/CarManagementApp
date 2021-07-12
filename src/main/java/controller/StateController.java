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
import model.State;
import services.CountryService;
import services.StateService;


@Controller

public class  StateController {
	@Autowired
	private StateService Stateservice;
	@Autowired
	private CountryService countryservice;
	@GetMapping("/state")
	public String getState(Model model) {
		List<State> stateList = Stateservice.getState();
		model.addAttribute("states",stateList);
		
		List<Country> countryList = countryservice.getCountries();
		model.addAttribute("country",countryList);
		return "State";
	}
	@PostMapping("/state/addNew")
	public String addNew(State State) {
		Stateservice.save(State);
		return "redirect:/state";
	}
	@RequestMapping("state/findbyId")
	@ResponseBody
	public Optional<State> findById(int id) {
		return Stateservice.findById(id);
		
	}
	@RequestMapping(value="/state/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(State State) {
		Stateservice.save(State);
		return "redirect:/state";
	}
	@RequestMapping(value="/state/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		Stateservice.delete(id);
		return "redirect:/state";
	}
}
