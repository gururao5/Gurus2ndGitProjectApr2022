package com.secondspringbootGitproject.secondspringbootGitprojectartifact.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondspringbootGitprojectcontroller {
	@RequestMapping("/welcome")
	//@ResponseBody
	public String returnWelcomePage()
	{
	//	System.out.println("HI FROM GYRY");
		return "welcome.jsp";
	}
}

