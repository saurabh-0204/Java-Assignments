package controllers;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String SayHello() {
		return "hello";
	}

	/*
	 * @RequestMapping("/welcome") public ModelAndView Welcome(HttpServletRequest
	 * request) { String name=request.getParameter("name");
	 * 
	 * String color=request.getParameter("color"); List<String> list=new
	 * ArrayList(); list.add(name); list.add(color); return new
	 * ModelAndView("Welcome","list",list); }
	 */
	@RequestMapping("/welcome")
	public ModelAndView Welcome(HttpServletRequest request, ModelMap map) {
		String name = request.getParameter("name");

		String color = request.getParameter("color");

		map.addAttribute("name", name);
		map.addAttribute("color", color);
		return new ModelAndView("Welcome", "map", map);
	}

	@RequestMapping("/factors")
	public String factorOfNumber(HttpServletRequest request, ModelMap map) {
		int number = Integer.parseInt(request.getParameter("number"));
		List<String> list = factors(number);
		map.addAttribute("list",list);
		return "factors";
	}

	public List<String> factors(int number) {
		List<String> list = new ArrayList();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				list.add("" + i);
			}
		}
		return list;
	}
}
