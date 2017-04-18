package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	private List<EmployeeId> data;
	
	EmployeeController(){
		data=new ArrayList<EmployeeId>();
		
		data.add(new EmployeeId("Abdi","Male",1));
		data.add(new EmployeeId("Abdi","Male",2));
	}
	
	@RequestMapping (value="/employees/{id}",method=RequestMethod.GET)
	@ResponseBody
	public List<EmployeeId> employeeById(@PathVariable Integer id)
	{
		List <EmployeeId> tampung=new ArrayList<EmployeeId>();
		
		for (int i=0;i<data.size();i++)
		{
			tampung=data.stream().filter(employee->employee.id==id).collect(Collectors.toList());
		}
		
		if (tampung.size()==0)
		{
			throw new EmployeeNotFoundException();
		}
		
		return tampung;
	}
}
