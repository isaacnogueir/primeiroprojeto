package com.primeiro.primeiroprojeto.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

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
	public RecordDTO insert(@PathVariable RecordInsertDTO dto) {

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

	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest) {

		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
}
