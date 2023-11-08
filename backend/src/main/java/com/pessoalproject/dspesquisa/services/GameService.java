package com.pessoalproject.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pessoalproject.dspesquisa.dtos.GameDTO;
import com.pessoalproject.dspesquisa.entities.Game;
import com.pessoalproject.dspesquisa.repositories.GameRepository;

@Service
public class GameService {
	

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameDTO> findAll (){
		List<Game> games = gameRepository.findAll();
		
		List<GameDTO> dto = games.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
		
		return dto;
	}

}
