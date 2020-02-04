package com.muverang.activa.authentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muverang.activa.authentication.repository.PruebaRepositoryInterface;

@Service
public class PruebaServiceImpl implements PruebaServiceInterface {
	
	@Autowired
	PruebaRepositoryInterface repository;
}
