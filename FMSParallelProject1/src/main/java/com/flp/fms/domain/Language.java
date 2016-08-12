package com.flp.fms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Language {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
@Column(nullable=false)
private int language_id;

	

	@Column(nullable=false)
	private String name;
	
	

	@Column(nullable=true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date last_update;
	
	@OneToMany(mappedBy="language")
	private Set<Film> films=new HashSet<>();
	
	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	public Language() {
		super();
	}
	public Language(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Language [language_id=" + language_id + ", name=" + name + ", last_update=" + last_update + "]";
				
	}
}
