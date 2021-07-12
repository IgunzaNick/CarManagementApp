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
import model.VehicleMake;
import model.State;
import services.VehicleMakeService;


@Controller

public class  VehicleMakeController {
	@Autowired
	private VehicleMakeService vehiclemakeservice;
	@GetMapping("/vehiclemake")
	public String getvehiclemake(Model model) {
		
		
		List<VehicleMake> vehiclemakeList = vehiclemakeservice.getvehiclemake();
		model.addAttribute("vehiclemake",vehiclemakeList);
		
		return "VehicleMake";
	}
	@PostMapping("/vehiclemake/addNew")
	public String addNew(VehicleMake vehiclemake) {
		vehiclemakeservice.save(vehiclemake);
		return "redirect:/vehiclemake";
	}
	@RequestMapping("vehiclemake/findbyId")
	@ResponseBody
	public Optional<VehicleMake> findById(int id) {
		return vehiclemakeservice.findById(id);
		
	}
	@RequestMapping(value="/vehiclemake/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(VehicleMake vehiclemake) {
		vehiclemakeservice.save(vehiclemake);
		return "redirect:/vehiclemake";
	}
	@RequestMapping(value="/vehiclemake/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		vehiclemakeservice.delete(id);
		return "redirect:/vehiclemake";
	}

}
