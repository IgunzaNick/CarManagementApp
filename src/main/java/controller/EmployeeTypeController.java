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
import model.EmployeeType;
import model.State;
import services.EmployeeTypeService;


@Controller

public class  EmployeeTypeController {
	@Autowired
	private EmployeeTypeService employeetypeservice;
	@GetMapping("/employeetype")
	public String getemployeetype(Model model) {

		
		List<EmployeeType> employeetypeList = employeetypeservice.getemployeetypee();
		model.addAttribute("employeetype",employeetypeList);
		
		return "EmployeeType";
	}
	@PostMapping("/employeetype/addNew")
	public String addNew(EmployeeType employeetype) {
		employeetypeservice.save(employeetype);
		return "redirect:/employeetype";
	}
	@RequestMapping("employeetype/findbyId")
	@ResponseBody
	public Optional<EmployeeType> findById(int id) {
		return employeetypeservice.findById(id);
		
	}
	@RequestMapping(value="/employeetype/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(EmployeeType employeetype) {
		employeetypeservice.save(employeetype);
		return "redirect:/employeetype";
	}
	@RequestMapping(value="/employeetype/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		employeetypeservice.delete(id);
		return "redirect:/employeetype";
	}

}
