package com.sgdi.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sgdi.domin.Equipamento;
import com.sgdi.service.EquipamentoService;


@RestController
@RequestMapping(value="/equipamentos")
public class EquipamentoResouce{
	
	@Autowired
	private EquipamentoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id){
		
		Equipamento obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
