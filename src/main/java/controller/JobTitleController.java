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
import model.JobTitle;
import model.State;
import services.JobtitleService;


@Controller

public class  JobTitleController {
	@Autowired
	private JobtitleService jobtitleservice;
	@GetMapping("/jobtitle")
	public String getjobtitle(Model model) {

		
		List<JobTitle> jobtitleList = jobtitleservice.getjobtitle();
		model.addAttribute("jobtitle",jobtitleList);
		
		return "JobTitle";
	}
	@PostMapping("/jobtitle/addNew")
	public String addNew(JobTitle jobtitle) {
		jobtitleservice.save(jobtitle);
		return "redirect:/jobtitle";
	}
	@RequestMapping("jobtitle/findbyId")
	@ResponseBody
	public Optional<JobTitle> findById(int id) {
		return jobtitleservice.findById(id);
		
	}
	@RequestMapping(value="/jobtitle/update",method= {RequestMethod.PUT,RequestMethod.GET})
	public String update(JobTitle jobtitle) {
		jobtitleservice.save(jobtitle);
		return "redirect:/jobtitle";
	}
	@RequestMapping(value="/jobtitle/delete",method= {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(Integer id) {
		jobtitleservice.delete(id);
		return "redirect:/jobtitle";
	}

}
