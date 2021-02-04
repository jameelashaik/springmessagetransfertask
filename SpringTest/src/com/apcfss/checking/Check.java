package com.apcfss.checking;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/check")
public class Check {
	@RequestMapping(value="/wt",method = RequestMethod.GET)
	ModelAndView NewWHATSAPP(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Your new whatsapp page is opened successfully");
		
		modelAndView.setViewName("whatsapp");
		
		return modelAndView;
	}
}
