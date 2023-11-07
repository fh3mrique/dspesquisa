package com.pessoalproject.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pessoalproject.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
