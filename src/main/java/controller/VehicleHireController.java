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
import model.Location;
import model.Vehicle;
import model.VehicleHire;
import services.ClientService;
import services.LocationService;
import services.VehicleHireService;
import services.VehicleService;


@Controller

public class  VehicleHireController {
	@Autowired
	private VehicleHireService vehiclehireservice;
	@Autowired
	private VehicleService vehicleservice;
	@Autowired
	private LocationService locationservice;
	@Autowired
	private ClientService clientservice;
	
	
	
	@GetMapping("/vehiclehire")
	public String getvehiclehire(Model model) {
		
		
		List<VehicleHire> vehiclehireList = vehiclehireservice.getvehiclehires();
		model.addAttribute("vehiclehires",vehiclehireList);
		List<Vehicle> vehicleList = vehicleservice.getVehicleService();
		model.addAttribute("vehicles",vehicleList);
		List<Location> locationList = locationservice.getlocation();
		model.addAttribute("locations",locationList);
		List<Client> clientList = clientservice.getClient();
		model.addAttribute("clients",clientList);
		
		return "VehicleHire";
	}
	@PostMapping("/vehiclehire/addNew")
	public String addNew(VehicleHire vehiclehire) {
		vehiclehireservice.save(vehiclehire);
		return "redirect:/vehiclehire";
	}
	@RequestMapping("vehiclehire/findbyId")
	@ResponseBody
	public Optional<VehicleHire> findById(int id) {
		return vehiclehireservice.findById(id);
		
	}
	@RequestMapping(value="/vehiclehire/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleHire vehiclehire) {
		vehiclehireservice.save(vehiclehire);
		return "redirect:/vehiclehire";
	}
	@RequestMapping(value="/vehiclehire/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		vehiclehireservice.delete(id);
		return "redirect:/vehiclehire";
	}


}
