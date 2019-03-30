package com.dbshacktrix.loan.repo;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbshacktrix.loan.model.LOANPLAN;

public interface LOANPLANRepo extends JpaRepository<LOANPLAN, String>{

	List<LOANPLAN> findBySlabs(BigDecimal amount);
	
	@Query("from LOANPLAN where slabs >=?1")
	List<LOANPLAN> findBySlabsSorted(BigDecimal amount);

}
