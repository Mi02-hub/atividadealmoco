package com.example.almoco.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.almoco.model.prato.Prato;
import com.example.almoco.repository.PratoRepository;

@RestController
@RequestMapping("almoco")
public class Controller {
	

	 @Autowired
	    private PratoRepository pratoRepository;

	
	 @GetMapping
	    public List<Prato> getAllUsers() {
	        return pratoRepository.findAll();
	 }

	 @PostMapping
	 public Prato createPrato(@RequestBody Prato prato) {
		 return pratoRepository.save(prato);
	 }
	 
}