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

import model.Vehicle;
import model.VehicleMake;
import model.VehicleModel;
import model.VehicleStatus;
import model.VehicleType;
import model.Country;
import model.Employee;
import model.Location;
import model.State;
import services.VehicleService;
import services.VehicleStatusService;
import services.VehicleTypeService;
import services.CountryService;
import services.EmployeeService;
import services.LocationService;
import services.StateService;
import services.VehicleMakeService;
import services.VehicleModelService;


@Controller

public class  VehicleController {
	@Autowired
	private VehicleService Vehicleservice;
	@Autowired
	private LocationService Locationservice;
	@Autowired
	private EmployeeService employeeservice;
	@Autowired
	private VehicleMakeService vehiclemakeservice;
	@Autowired
	private VehicleStatusService vehiclestatusservice;
	@Autowired
	private VehicleTypeService vehicletypeservice;
	@Autowired
	private VehicleModelService vehiclemodelservice;
	@GetMapping("/vehicle")
	public String getVehicle(Model model) {
		List<Vehicle> vehicleList = Vehicleservice.getVehicleService();
		model.addAttribute("vehicles",vehicleList);
		
		List<Location> locationList = Locationservice.getlocation();
		model.addAttribute("location",locationList);
		
		List<Employee> employeeList = employeeservice.getemployeeService();
		model.addAttribute("employee",employeeList);
		
		List<VehicleMake> vehiclemakeList = vehiclemakeservice.getvehiclemake();
		model.addAttribute("vehiclemake",vehiclemakeList);
		
		List<VehicleStatus> vehiclestatusList = vehiclestatusservice.getvehiclestatus();
		model.addAttribute("vehiclestatus",vehiclestatusList);
		
		List<VehicleType> vehicletypeList = vehicletypeservice.getvehicletype();
		model.addAttribute("vehicletype",vehicletypeList);
		
		List<VehicleModel> vehiclemodelList = vehiclemodelservice.getvehiclemodel();
		model.addAttribute("vehiclemodel",vehiclemodelList);
		
		return "Vehicle";
	}
	@PostMapping("/vehicle/addNew")
	public String addNew(Vehicle Vehicle) {
		Vehicleservice.save(Vehicle);
		return "redirect:/vehicle";
	}
	@RequestMapping("vehicle/findbyId")
	@ResponseBody
	public Optional<Vehicle> findById(int id) {
		return Vehicleservice.findById(id);
		
	}
	@RequestMapping(value="/vehicle/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Vehicle Vehicle) {
		Vehicleservice.save(Vehicle);
		return "redirect:/vehicle";
	}
	@RequestMapping(value="/vehicle/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		Vehicleservice.delete(id);
		return "redirect:/vehicle";
	}
}
