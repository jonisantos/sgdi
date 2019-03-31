package com.sgdi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgdi.domin.TipoEquipamento;

@Repository
public interface TipoEquipamentoRepository extends JpaRepository<TipoEquipamento, Long> {
	
}
