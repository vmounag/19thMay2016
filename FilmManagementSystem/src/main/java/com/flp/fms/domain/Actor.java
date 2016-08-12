package com.flp.fms.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Actor {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
@Column(nullable=false)
private int actor_id;

private String first_name;


private String last_name;

@Column(nullable=true,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
@Temporal(TemporalType.TIMESTAMP)
private Date last_update;

@ManyToMany(mappedBy="actors")
private Set<Film> films=new HashSet();

public Actor() {
	super();
}

public Actor(String first_name, String last_name) {
	super();
	
	this.first_name = first_name;
	this.last_name = last_name;

}




@Override
public String toString() {
	return "Actor [actor_id=" + actor_id + ", first_name=" + first_name + ", last_name=" + last_name + ", last_update="
			+ last_update +  "]";
}

public Integer getActor_id() {
	return (Integer) actor_id;
}
public void setActor_id(Integer actor_id) {
	this.actor_id = actor_id;
}

public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
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
