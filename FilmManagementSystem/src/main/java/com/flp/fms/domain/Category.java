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
public class Category {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	private int category_id;

	
	
	private String name;
	
	@Column(nullable=true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date last_update;
	@OneToMany(mappedBy="category")
	private Set<Film> films=new HashSet();
	public Category(String name) {
		super();
		
		this.name = name;
		
	}
	public Category() {
		super();
	}
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", name=" + name + ", last_update=" + last_update + "]";
				
	}
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
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
}
