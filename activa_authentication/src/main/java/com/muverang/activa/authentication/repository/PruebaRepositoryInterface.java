package com.muverang.activa.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muverang.activa.authentication.model.Prueba;

@Repository
public interface PruebaRepositoryInterface extends JpaRepository<Prueba, Long>{

}
