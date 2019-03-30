package com.dbshacktrix.loan.service;

import com.dbshacktrix.loan.model.LOANPLAN;
import com.dbshacktrix.loan.model.USRTXN;
import com.dbshacktrix.loan.model.Usr;
import com.dbshacktrix.loan.repo.LOANPLANRepo;
import com.dbshacktrix.loan.repo.USRTXNRepo;
import com.dbshacktrix.loan.repo.UsrRepo;

import java.math.BigDecimal;
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
	
	@Autowired
	private LOANPLANRepo planrepo;
	
	@Autowired
	private USRTXNRepo txnrepo;

	public List<LOANPLAN> getLoanPlans(int usrid) {
		List list = new ArrayList();
		Optional usr = null;
		if (usrid != 0) {
			usr = (Optional) usrrepo.findById(usrid);
		}
		List txns = new ArrayList();
		if(usr != null) {
			txns = txnrepo.findByUsrid(usrid);
		}
		BigDecimal amount = new BigDecimal(0);
		
		for(Object tx: txns) {
			USRTXN u = (USRTXN) tx;
			amount = amount.add(u.getAmount());
		}
		list = planrepo.findBySlabsSorted(amount);
		return list;

	}

}
