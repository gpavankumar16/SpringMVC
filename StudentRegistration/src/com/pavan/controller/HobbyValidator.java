package com.pavan.controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby,String>  {

	public void initialize(IsValidHobby isValidHobby){
		
	}
	
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx)
	{
		if(studentHobby == null)
		{
			return false;
		}
		if(studentHobby.matches("Music|Cricket")){
			return true;
		}else
		{
			return false;
		}
	}
	
}
