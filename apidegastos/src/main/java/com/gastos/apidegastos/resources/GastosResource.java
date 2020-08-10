package com.gastos.apidegastos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gastos.apidegastos.models.Gastos;
import com.gastos.apidegastos.repository.GastosRepository;

@RestController
@RequestMapping(value="/api")
public class GastosResource {

	@Autowired
	GastosRepository gastosRepository;
	
	@GetMapping("/gastos")
	public List<Gastos> listaGastos() {
		return gastosRepository.findAll();
	}
	
	@GetMapping("/gasto/{id}")
	public Gastos listaGastoUnico(@PathVariable(value="id") long id) {
		return gastosRepository.findById(id);
	}
	
	@PostMapping("/gasto")
	public Gastos salvaGasto(@RequestBody Gastos gasto) {
		return gastosRepository.save(gasto);
	}
	
	@DeleteMapping("/gasto")
	public void deletaGasto(@RequestBody Gastos gasto) {
		gastosRepository.delete(gasto);
	}
	
	@PutMapping("/gasto")
	public Gastos atualizaGasto(@RequestBody Gastos gasto) {
		return gastosRepository.save(gasto);
	}
	
}
