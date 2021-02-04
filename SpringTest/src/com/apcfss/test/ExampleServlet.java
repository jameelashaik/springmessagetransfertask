package com.apcfss.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/transfermsg")
public class ExampleServlet implements sendmsg {
	@RequestMapping(value="/sendsmsi",method = RequestMethod.GET)
	public String sendsms() {
		System.out.println("checking sms interface.........");
		return "msg";	
	}
	
	@RequestMapping(value="/sendemaili",method = RequestMethod.GET)
	public String sendemail() {
		System.out.println("checking email interface.........");
		return "email";	
	}
	
	@RequestMapping(value="/sendwhatsappi",method = RequestMethod.GET)
	public String sendwhatsapp() {
		System.out.println("checking whatsapp interface.........");
		return "whatsapp";	
	}

	
}
interface sendmsg{
	String sendsms();
	String sendemail();
	String sendwhatsapp();
}