package com.dbshacktrix.loan.controller;

import com.dbshacktrix.loan.model.LOANPLAN;
import com.dbshacktrix.loan.service.EmailService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/RemoRides")
public class HomeController {
	
	@Autowired
	EmailService emailService;

	@RequestMapping("/newrequest/{id}")
	@ResponseBody
	public List<LOANPLAN> newrequest() {

		emailService.sendmail("Requested");
		return null;
	}
	

}

