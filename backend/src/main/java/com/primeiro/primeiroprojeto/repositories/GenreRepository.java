package com.primeiro.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiro.primeiroprojeto.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	

}
