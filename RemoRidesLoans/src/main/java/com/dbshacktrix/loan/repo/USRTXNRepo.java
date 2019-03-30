package com.dbshacktrix.loan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbshacktrix.loan.model.USRTXN;

public interface USRTXNRepo extends JpaRepository<USRTXN, Integer>{

	List<USRTXN> findByUsrid(int id);
} 
