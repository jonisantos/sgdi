package com.sgdi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgdi.domin.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento, Long> {

}
