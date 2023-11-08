package com.pessoalproject.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pessoalproject.dspesquisa.dtos.RecordDTO;
import com.pessoalproject.dspesquisa.dtos.RecordInsertDTO;
import com.pessoalproject.dspesquisa.entities.Game;
import com.pessoalproject.dspesquisa.entities.Record;
import com.pessoalproject.dspesquisa.repositories.GameRepository;
import com.pessoalproject.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert (RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		
		Game game = gameRepository.getReferenceById(dto.getGameId());
		
		entity.setGame(game);
		
		entity = recordRepository.save(entity);
		
		return new RecordDTO(entity);
	}
	
	

}
