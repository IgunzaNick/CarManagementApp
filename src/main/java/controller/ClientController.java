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
import model.Client;
import services.CountryService;
import services.StateService;
import services.ClientService;


@Controller

public class  ClientController {
	
	@Autowired
	private ClientService Clientservice;
	@Autowired
	private CountryService countryservice;
	@Autowired
	private StateService stateservice;
	@GetMapping("/client")
	public String getClient(Model model) {
		List<Client> clientList = Clientservice.getClient();
		model.addAttribute("clients",clientList);
		
		List<Country> countryList = countryservice.getCountries();
		model.addAttribute("country",countryList);
		
		List<State> stateList = stateservice.getState();
		model.addAttribute("state",stateList);
		return "Client";
	}
	@PostMapping("/client/addNew")
	public String addNew(Client Client) {
		Clientservice.save(Client);
		return "redirect:/client";
	}
	@RequestMapping("client/findbyId")
	@ResponseBody
	public Optional<Client> findById(int id) {
		return Clientservice.findById(id);
		
	}
	@RequestMapping(value="/client/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Client Client) {
		Clientservice.save(Client);
		return "redirect:/client";
	}
	@RequestMapping(value="/client/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		Clientservice.delete(id);
		return "redirect:/client";
	}
}



