package com.pessoalproject.dspesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoalproject.dspesquisa.dtos.RecordDTO;
import com.pessoalproject.dspesquisa.dtos.RecordInsertDTO;
import com.pessoalproject.dspesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class GameController {
	
	@Autowired
	private RecordService recordService;
	
	@PostMapping()
	public ResponseEntity<RecordDTO> insert (@RequestBody RecordInsertDTO dto){
		
		RecordDTO newDTO = recordService.insert(dto);
				
		return ResponseEntity.ok().body(newDTO);
		
	}

}
