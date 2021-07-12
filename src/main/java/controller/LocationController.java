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
import model.Location;
import model.State;
import services.CountryService;
import services.LocationService;
import services.StateService;



@Controller

public class  LocationController {
	@Autowired
	private StateService stateservice;
	@Autowired
	private CountryService countryservice;
	@Autowired
	private LocationService locationservice;
	@GetMapping("/location")
	public String getlocation(Model model) {
		List<State> stateList = stateservice.getState();
		model.addAttribute("states",stateList);
		
		List<Country> countryList = countryservice.getCountries();
		model.addAttribute("country",countryList);
		
		List<Location> locationList = locationservice.getlocation();
		model.addAttribute("location",locationList);
		
		return "Location";
	}
	@PostMapping("/location/addNew")
	public String addNew(Location location) {
		locationservice.save(location);
		return "redirect:/location";
	}
	@RequestMapping("location/findbyId")
	@ResponseBody
	public Optional<Location> findById(int id) {
		return locationservice.findById(id);
		
	}
	@RequestMapping(value="/location/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Location location) {
		locationservice.save(location);
		return "redirect:/location";
	}
	@RequestMapping(value="/location/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		locationservice.delete(id);
		return "redirect:/location";
	}

}
