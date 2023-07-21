package com.Hi.hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GetHai {
	@GetMapping(value = "/getHai")
	public String getHai() {
		return "hai";
	}

	@GetMapping(value = "/myname")
	public String myName() {
		return "kathir";
	}
}
