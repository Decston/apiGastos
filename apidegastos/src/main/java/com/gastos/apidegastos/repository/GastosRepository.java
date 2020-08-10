package com.gastos.apidegastos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gastos.apidegastos.models.Gastos;

public interface GastosRepository extends JpaRepository<Gastos, Long>{

	Gastos findById(long id);
	
}
