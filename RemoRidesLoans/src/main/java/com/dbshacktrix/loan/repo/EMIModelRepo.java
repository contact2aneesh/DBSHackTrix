package com.dbshacktrix.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbshacktrix.loan.model.EMIModel;

public interface EMIModelRepo extends JpaRepository<EMIModel, Integer>{

	
}
