
package com.example.almoco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.almoco.model.prato.Prato;
import com.example.almoco.repository.PratoRepository;

@Service
public class PratoService {
	

		 @Autowired
		    private PratoRepository pratoRepository;

		    public List<Prato> findAll() {
		        return pratoRepository.findAll();
		    }


		    public Prato save(Prato prato) {
		        return pratoRepository.save(prato);
		    }
		    
		    

	
	}
	