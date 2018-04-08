package com.pavan.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SpringInterceptorEx extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		Calendar cal = Calendar.getInstance();
		
		int calDay = cal.get(cal.DAY_OF_WEEK);
		
		System.out.println(calDay);
		
		if(calDay==7)
		{
			response.getWriter().write("The application is not valid on Saturday");
			return false;
		}
		return true;
		
	}

}
