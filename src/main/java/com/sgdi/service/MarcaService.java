package com.sgdi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgdi.domin.Marca;
import com.sgdi.repositorio.MarcaRepository;
import com.sgdi.service.exceptions.ObjectNotFoundException;

@Service
public class MarcaService {

	@Autowired
	private MarcaRepository repo;
	
	public Marca find(Long id) {		
		Optional<Marca> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id:" + id + ", Nome:" 
		+ Marca.class.getName()));
	}
}
