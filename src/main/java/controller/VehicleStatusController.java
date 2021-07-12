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
import model.VehicleStatus;
import model.State;
import services.VehicleStatusService;


@Controller

public class  VehicleStatusController {
	@Autowired
	private VehicleStatusService vehiclestatusservice;
	@GetMapping("/vehiclestatus")
	public String getvehiclestatus(Model model) {
		
		
		List<VehicleStatus> vehiclestatusList = vehiclestatusservice.getvehiclestatus();
		model.addAttribute("vehiclestatus",vehiclestatusList);
		
		return "VehicleStatus";
	}
	@PostMapping("/vehiclestatus/addNew")
	public String addNew(VehicleStatus vehiclestatus) {
		vehiclestatusservice.save(vehiclestatus);
		return "redirect:/vehiclestatus";
	}
	@RequestMapping("vehiclestatus/findbyId")
	@ResponseBody
	public Optional<VehicleStatus> findById(int id) {
		return vehiclestatusservice.findById(id);
		
	}
	@RequestMapping(value="/vehiclestatus/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleStatus vehiclestatus) {
		vehiclestatusservice.save(vehiclestatus);
		return "redirect:/vehiclestatus";
	}
	@RequestMapping(value="/vehiclestatus/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		vehiclestatusservice.delete(id);
		return "redirect:/vehiclestatus";
	}
}
