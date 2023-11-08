package com.pessoalproject.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoalproject.dspesquisa.entities.Record;

@RestController
@RequestMapping(name = "/games")
public interface RecordRepository extends JpaRepository<Record, Long> {
	
	

}
