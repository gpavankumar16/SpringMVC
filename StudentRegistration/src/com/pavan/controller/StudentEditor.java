package com.pavan.controller;

import java.beans.PropertyEditorSupport;

public class StudentEditor extends PropertyEditorSupport{

	public void setAsText(String studentName) throws IllegalArgumentException {
		
		if(studentName.contains("."))
		{
			setValue(studentName);
		}else{
			studentName = "Mr."+studentName;
			setValue(studentName);
		}
	}
	
}
