package com.sgdi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgdi.domin.Marca;
import com.sgdi.service.MarcaService;

@RestController
@RequestMapping(value="/marcas")
public class MarcaResouce {
	
	@Autowired
	private MarcaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id){
		
		Marca obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
