package com.apcfss.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloworldServlet 
{

	@RequestMapping(value="/helloworld",method = RequestMethod.GET)
	String helloworld(HttpServletRequest request, HttpServletResponse response)
	{
 	System.out.println("testing helloworld------------");
		return "msg";//used to redirect to the given url page
		
	}

	

	/*
	@RequestMapping(value="/sendmsg",method = RequestMethod.GET)
	String sendmsg(HttpServletRequest request, HttpServletResponse response)
	{
 	System.out.println("testing for send msg------------");
		return "msg";
		
	}
	@RequestMapping(value="/sendemail",method = RequestMethod.GET)
	String sendemail(HttpServletRequest request, HttpServletResponse response)
	{
 	System.out.println("testing for send email------------");
		return "email";
		
	}
	@RequestMapping(value="/sendwhatsapp",method = RequestMethod.GET)
	String sendwhatsapp(HttpServletRequest request, HttpServletResponse response)
	{
 	System.out.println("testing for send whatsapp------------");
		return "whatsapp";
		
	}
	*/
	@RequestMapping(value="/NewSMS",method = {RequestMethod.POST,RequestMethod.GET})
	ModelAndView NewSMS(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Your new sms page is opened successfully");
		
		modelAndView.setViewName("msg");
		
		return modelAndView;
	}
	@RequestMapping(value="/NewEMAIL",method = RequestMethod.GET)
	ModelAndView NewEMAIL(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Your new email page is opened successfully");
		
		modelAndView.setViewName("email");
		
		return modelAndView;
	}
	@RequestMapping(value="/NewWHATSAPP",method = RequestMethod.GET)
	ModelAndView NewWHATSAPP(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Your new whatsapp page is opened successfully");
		
		modelAndView.setViewName("whatsapp");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/helloworldNew",method = RequestMethod.GET)
	ModelAndView helloworldNew(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", "Hello world welcome to spring");
		
		modelAndView.setViewName("hello");
		
		return modelAndView;
	}
	
	
	
	
}
