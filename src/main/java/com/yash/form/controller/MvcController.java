package com.yash.form.controller;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yash.form.Reader.ReaderTxt;
import com.yash.form.bean.User;

@Controller
public class MvcController {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("Welcome!!!! This is home Page");
		return "index";
	}
	
	@GetMapping("/register")
	public String showForm(Model model) {
		User user=new User();
		List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
		List<String> CountryData=new ArrayList<String>();
		//List<String> CountryData = Arrays.asList("India", "CHINA", "RUSSIA");
		model.addAttribute("user",user);
		
		ReaderTxt countrydata=new ReaderTxt();
	    CountryData=countrydata.countrydata();
		System.out.println(CountryData);
		model.addAttribute("professionList", professionList);
	    model.addAttribute("CountryData",CountryData);
	  //  System.out.println(Countrydata);
		return "register_form";
	}
	
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
	     
	    System.out.println(user);
	     
	    return "register_success";
	}
	
	
}
