package com.primeiro.primeiroprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.primeiro.primeiroprojeto.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
