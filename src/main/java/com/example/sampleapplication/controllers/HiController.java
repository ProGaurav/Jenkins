package com.example.sampleapplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@GetMapping("/hi")
	public String sayHi()
{
		return "<h1>Hi Gaurav!!</h1>";
	
}
@RequestMapping("/bye")
public String sayBye() {
		return "<h1>Bye everyone!!Love from jenkins!!!Yuoo</h1>";
}
}
