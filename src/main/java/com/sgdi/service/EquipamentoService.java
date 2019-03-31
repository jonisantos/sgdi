package com.sgdi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgdi.domin.Equipamento;
import com.sgdi.repositorio.EquipamentoRepository;
import com.sgdi.service.exceptions.ObjectNotFoundException;

@Service
public class EquipamentoService {

	@Autowired
	private EquipamentoRepository repo;
	
	public Equipamento find(Long id) {		
		Optional<Equipamento> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Nome:" 
		+ Equipamento.class.getName()));
	}
}
