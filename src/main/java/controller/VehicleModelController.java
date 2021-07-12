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
import model.VehicleModel;
import model.State;
import services.VehicleModelService;


@Controller

public class  VehicleModelController {
	@Autowired
	private VehicleModelService vehiclemodelservice;
	@GetMapping("/vehiclemodel")
	public String getvehiclemodel(Model model) {
		
		
		List<VehicleModel> vehiclemodelList = vehiclemodelservice.getvehiclemodel();
		model.addAttribute("vehiclemodel",vehiclemodelList);
		
		return "VehicleModel";
	}
	@PostMapping("/vehiclemodel/addNew")
	public String addNew(VehicleModel vehiclemodel) {
		vehiclemodelservice.save(vehiclemodel);
		return "redirect:/vehiclemodel";
	}
	@RequestMapping("vehiclemodel/findbyId")
	@ResponseBody
	public Optional<VehicleModel> findById(int id) {
		return vehiclemodelservice.findById(id);
		
	}
	@RequestMapping(value="/vehiclemodel/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleModel vehiclemodel) {
		vehiclemodelservice.save(vehiclemodel);
		return "redirect:/vehiclemodel";
	}
	@RequestMapping(value="/vehiclemodel/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		vehiclemodelservice.delete(id);
		return "redirect:/vehiclemodel";
	}

}
