package com.pessoalproject.dspesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pessoalproject.dspesquisa.dtos.GameDTO;
import com.pessoalproject.dspesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
@CrossOrigin(origins = "*")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping()
	public ResponseEntity<List<GameDTO>> findAll (){
		
		List<GameDTO> games = gameService.findAll();
		
		return ResponseEntity.ok().body(games);
	}

}
