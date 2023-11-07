package com.pessoalproject.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoalproject.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
