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
import model.VehicleType;
import model.State;
import services.VehicleTypeService;


@Controller

public class  VehicleTypeController {
	@Autowired
	private VehicleTypeService vehicletypeservice;
	@GetMapping("/vehicletype")
	public String getvehicletype(Model model) {

		
		List<VehicleType> vehicletypeList = vehicletypeservice.getvehicletype();
		model.addAttribute("vehicletype",vehicletypeList);
		
		return "VehicleType";
	}
	@PostMapping("/vehicletype/addNew")
	public String addNew(VehicleType vehicletype) {
		vehicletypeservice.save(vehicletype);
		return "redirect:/vehicletype";
	}
	@RequestMapping("vehicletype/findbyId")
	@ResponseBody
	public Optional<VehicleType> findById(int id) {
		return vehicletypeservice.findById(id);
		
	}
	@RequestMapping(value="/vehicletype/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleType vehicletype) {
		vehicletypeservice.save(vehicletype);
		return "redirect:/vehicletype";
	}
	@RequestMapping(value="/vehicletype/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		vehicletypeservice.delete(id);
		return "redirect:/vehicletype";
	}

}
