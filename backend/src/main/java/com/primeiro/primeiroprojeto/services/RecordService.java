package com.primeiro.primeiroprojeto.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.primeiro.primeiroprojeto.dto.RecordDTO;
import com.primeiro.primeiroprojeto.dto.RecordInsertDTO;
import com.primeiro.primeiroprojeto.entities.Game;
import com.primeiro.primeiroprojeto.entities.Record;
import com.primeiro.primeiroprojeto.repositories.GameRepository;
import com.primeiro.primeiroprojeto.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;

	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());

		@SuppressWarnings("deprecation")
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);

		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}
