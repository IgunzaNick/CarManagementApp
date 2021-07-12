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
import model.Employee;
import model.EmployeeType;
import model.JobTitle;
import model.State;
import model.EmployeeType;
import services.CountryService;
import services.EmployeeTypeService;
import services.JobtitleService;
import services.StateService;
import services.EmployeeService;
import services.EmployeeTypeService;


@Controller

public class  EmployeeController {
	@Autowired
	private EmployeeService employeeservice;
	@Autowired
	private JobtitleService JobTitleservice;
	@Autowired
	private EmployeeTypeService employeetypeservice;
	@Autowired
	private CountryService countryservice;
	@Autowired
	private StateService stateservice;
	
	@GetMapping("/employee")
	public String getEmployee(Model model) {
		List<EmployeeType> employeetypeList = employeetypeservice.getemployeetypee();
		model.addAttribute("employetype",employeetypeList);
		
		List<JobTitle> jobtitleList = JobTitleservice.getjobtitle();
		model.addAttribute("jobtitle",jobtitleList);
		
		List<Employee> employeeList = employeeservice.getemployeeService();
		model.addAttribute("employee",employeeList);
		
		List<Country> countryList = countryservice.getCountries();
		model.addAttribute("country",countryList);
		
		List<State> stateList = stateservice.getState();
		model.addAttribute("state",stateList);
		
		
		return "Employee";
	}
	@PostMapping("/employee/addNew")
	public String addNew(Employee Employee) {
		employeeservice.save(Employee);
		return "redirect:/employee";
	}
	@RequestMapping("employee/findbyId")
	@ResponseBody
	public Optional<Employee> findById(int id) {
		return employeeservice.findById(id);
		
	}
	@RequestMapping(value="/employee/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(Employee Employee) {
		employeeservice.save(Employee);
		return "redirect:/employee";
	}
	@RequestMapping(value="/employee/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		employeeservice.delete(id);
		return "redirect:/employee";
	}

}
