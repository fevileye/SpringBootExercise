package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class EmployeeDay1Controller {

private List<Employee> data;
	
	EmployeeDay1Controller(){
		data= new ArrayList<Employee>();
		data.add(new Employee("Budi","Male"));
		data.add(new Employee("Santi","Female"));
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> employeeGet( @RequestParam("gender") String gender) {
		
		List<Employee> tampung= new ArrayList<Employee>();
		
		for (Employee list:data)
		{
			if (list.getGender().equals(gender)==true)
			{
				tampung.add(list);
			}
		}
		
		return tampung;
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "True";
	}
	
	@RequestMapping (value="/employees",method=RequestMethod.POST)
	@ResponseBody
	public Employee employeePost(@RequestBody Employee newEmployee) {
		data.add(newEmployee);
		return newEmployee;
	}
	
	@RequestMapping ("/hellojsp")
	public String hello(ModelMap modelMap){
		modelMap.addAttribute("message","Hello Spring from JSP");
		return "hello";
	}
	
}
