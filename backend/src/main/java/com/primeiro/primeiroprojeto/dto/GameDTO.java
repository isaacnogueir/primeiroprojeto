package com.primeiro.primeiroprojeto.dto;

import java.io.Serializable;

import com.primeiro.primeiroprojeto.entities.Game;
import com.primeiro.primeiroprojeto.entities.enums.Plataform;

public class GameDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Plataform plataform;

	
	public GameDTO() {}
	
	public GameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		plataform = entity.getPlataform();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Plataform getPlataform() {
		return plataform;
	}

	public void setPlataform(Plataform plataform) {
		this.plataform = plataform;
	}

}