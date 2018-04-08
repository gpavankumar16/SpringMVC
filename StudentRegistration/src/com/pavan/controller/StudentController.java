package com.pavan.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentController {
	
	

	@InitBinder
	public void BujjiBinder(WebDataBinder binder)
	{
		binder.setDisallowedFields(new String[] {"address.city"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "joiningDate", new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "studentName", new StudentEditor());
	}
	
	
	@RequestMapping(value="/admissionForm",method=RequestMethod.GET)
	public ModelAndView getStudentInfo()
	{
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitStudentInfo(@Valid @ModelAttribute("s") Student s, BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		
		return modelAndView;
	
	}	
		
/*
 * @ModelAttribute annotation inclusion comments this code
 * *		
		String name = value.get("studentName");
		String hobby = value.get("studentHobby");
		modelAndView.addObject("msg", "Hi "+name+ " your hobbies are "+hobby);
		
		Student s = new Student();
		s.setsName(value.get("studentName"));
		s.setsHobby(value.get("studentHobby"));
		System.out.println(s.getsName());
		modelAndView.addObject("s",s);
**/
		       
		
		
	
	
}
