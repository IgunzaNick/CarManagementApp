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

import model.VehicleMaintenance;
import model.Vehicle;
import model.Supplier;
import services.VehicleService;
import services.SupplierService;
import services.VehicleMaintainanceService;


@Controller

public class  VehicleMaintainanceController {
	@Autowired
	private VehicleMaintainanceService VehicleMaintenanceservice;
	@Autowired
	private VehicleService vehicleservice;
	@Autowired
	private SupplierService supplierservice;
	@GetMapping("/vehicemaintainance")
	public String getVehicleMaintenance(Model model) {
		List<VehicleMaintenance> vehicemaintainanceList = VehicleMaintenanceservice.getVehicleMaintainance();
		model.addAttribute("vehicemaintainances",vehicemaintainanceList);
		
		List<Vehicle> vehicleList = vehicleservice.getVehicleService();
		model.addAttribute("vehicle",vehicleList);
		
		List<Supplier> supplierList = supplierservice.getSupplier();
		model.addAttribute("supplier",supplierList);
		return "VehicleMaintanance";
	}
	@PostMapping("/vehicemaintainance/addNew")
	public String addNew(VehicleMaintenance VehicleMaintenance) {
		VehicleMaintenanceservice.save(VehicleMaintenance);
		return "redirect:/vehicemaintainance";
	}
	@RequestMapping("vehicemaintainance/findbyId")
	@ResponseBody
	public Optional<VehicleMaintenance> findById(int id) {
		return VehicleMaintenanceservice.findById(id);
		
	}
	@RequestMapping(value="/vehicemaintainance/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleMaintenance VehicleMaintenance) {
		VehicleMaintenanceservice.save(VehicleMaintenance);
		return "redirect:/vehicemaintainance";
	}
	@RequestMapping(value="/vehicemaintainance/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		VehicleMaintenanceservice.delete(id);
		return "redirect:/vehicemaintainance";
	}

}
