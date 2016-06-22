package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@org.springframework.stereotype.Controller

public class Controlador extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/403").setViewName("403");
	}

	/*
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Model model)
	{

		return "home";
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Model model)
	{

		return "login";
	}
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login2(Model model)
	{

		return "login";
	}

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello(Model model)
	{

		return "hello";
	}
	@RequestMapping(value="/hello", method=RequestMethod.POST)
	public String hellop(Model model)
	{

		return "hello";
	}
	*/

}