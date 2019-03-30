package com.dbshacktrix.loan.controller;

import com.dbshacktrix.loan.model.LOANPLAN;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HomeController {

	@RequestMapping("/newrequest/{id}")
	@ResponseBody
	public List<LOANPLAN> newrequest() {

		
		return null;
	}
	

}

