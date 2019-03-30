package com.dbshacktrix.loan.service;

import com.dbshacktrix.loan.model.LOANPLAN;
import com.dbshacktrix.loan.model.Usr;
import com.dbshacktrix.loan.repo.LOANPLANRepo;
import com.dbshacktrix.loan.repo.UsrRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.dbshacktrix.loan.model.Usr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

	@Autowired
	private UsrRepo usrrepo;
	
	private LOANPLANRepo planrepo;

	public List<LOANPLAN> getLoanPlans(int usrid) {
		List list = new ArrayList();
		Optional usr = null;
		if (usrid != 0) {
			usr = (Optional) usrrepo.findById(usrid);
		}
		if(usr != null) {
			list = 
		}
		return null;

	}

}
