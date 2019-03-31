package com.sgdi.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sgdi.domin.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
