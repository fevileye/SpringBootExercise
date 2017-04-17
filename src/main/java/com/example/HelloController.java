package com.example;

import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
	public String hello( @RequestParam("message") String pesan) {
       return "Your message: " + pesan;
	}
	
	@RequestMapping (value="/hello",method=RequestMethod.POST)
	@ResponseBody
	public String fungsiRequest(@RequestBody String message) {

	    return "Your message: " + message;
	}
	
	@RequestMapping (value="/hello/{message}",method=RequestMethod.PUT)
	@ResponseBody
	public String fungsiMapping(@PathVariable String message){
		return "Your message : "+message;
	}
}