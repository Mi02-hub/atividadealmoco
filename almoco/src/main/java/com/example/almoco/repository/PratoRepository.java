package com.example.almoco.repository;

	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.almoco.model.prato.Prato;


	public interface PratoRepository extends JpaRepository<Prato, Long> {

		List<Prato> findAll();

	}

