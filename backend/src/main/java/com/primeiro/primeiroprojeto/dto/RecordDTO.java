package com.primeiro.primeiroprojeto.dto;

import java.io.Serializable;
import java.time.Instant;
import com.primeiro.primeiroprojeto.entities.Record;
import com.primeiro.primeiroprojeto.entities.enums.Plataform;

public class RecordDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Plataform gamePlataform;
	private String genreName;

	public RecordDTO() {

	}

	public RecordDTO(Record entity) {
		id = entity.getId();
		moment = entity.getMoment();
		name = entity.getName();
		age = entity.getAge();
		gameTitle = entity.getGame().getTitle();
		gamePlataform = entity.getGame().getPlataform();
		genreName = entity.getGame().getGenre().getName();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGameTitle() {
		return gameTitle;
	}

	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}

	public Plataform getGamePlataform() {
		return gamePlataform;
	}

	public void setGamePlataform(Plataform gamePlataform) {
		this.gamePlataform = gamePlataform;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
}
