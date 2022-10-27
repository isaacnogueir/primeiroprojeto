package com.primeiro.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiro.primeiroprojeto.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
