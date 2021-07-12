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

import model.Location;
import model.Vehicle;
import model.VehicleMovement;
import services.LocationService;
import services.VehicleMovementService;
import services.VehicleService;


@Controller

public class  VehicleMovementController {
	@Autowired
	private VehicleMovementService VehicleMovementservice;
	@Autowired
	private VehicleService vehicleservice;
	@Autowired
	private LocationService locationservice;
	@GetMapping("/vehicemovement")
	public String getVehicleMovement(Model model) {
		List<VehicleMovement> vehicemovementList = VehicleMovementservice.getMovement();
		model.addAttribute("vehicemovements",vehicemovementList);
		
		List<Vehicle> vehicleList = vehicleservice.getVehicleService();
		model.addAttribute("vehicle",vehicleList);
		
		List<Location> locationList = locationservice.getlocation();
		model.addAttribute("location",locationList);
		return "VehicleMovement";
	}
	@PostMapping("/vehicemovement/addNew")
	public String addNew(VehicleMovement VehicleMovement) {
		VehicleMovementservice.save(VehicleMovement);
		return "redirect:/vehicemovement";
	}
	@RequestMapping("vehicemovement/findbyId")
	@ResponseBody
	public Optional<VehicleMovement> findById(int id) {
		return VehicleMovementservice.findById(id);
		
	}
	@RequestMapping(value="/vehicemovement/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleMovement VehicleMovement) {
		VehicleMovementservice.save(VehicleMovement);
		return "redirect:/vehicemovement";
	}
	@RequestMapping(value="/vehicemovement/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		VehicleMovementservice.delete(id);
		return "redirect:/vehicemovement";
	}
}
