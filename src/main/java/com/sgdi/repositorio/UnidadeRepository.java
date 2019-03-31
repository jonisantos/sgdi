package com.sgdi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgdi.domin.Unidade;

@Repository
public interface UnidadeRepository extends JpaRepository<Unidade, Long> {

}
