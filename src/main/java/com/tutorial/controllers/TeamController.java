package com.tutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	@RequestMapping(value="/greet", method=RequestMethod.GET)
	public String greetTeam(@RequestParam(value="name", defaultValue="000") String name){
		return "Hello" + name;
	}
	
	@RequestMapping(value="/getTeamById", method=RequestMethod.GET)
	public String getTeam(@RequestParam(value="id") int id){
		return "";
	}
}
