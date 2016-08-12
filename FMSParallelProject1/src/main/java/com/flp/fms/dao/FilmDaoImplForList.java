package com.flp.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.flp.fms.domain.Film;

public class FilmDaoImplForList implements IFilmDao {
	
	private EntityManager em;
	private EntityManagerFactory emf;
	public FilmDaoImplForList() {
		this.emf = Persistence.createEntityManagerFactory("hello");
		this.em = emf.createEntityManager();
	}
	
	public String addFilm(Film film) {
		em.getTransaction().begin();
		em.persist(film);
		em.getTransaction().commit();
		return "added successfully";
	}

	public String modifyFilm(Film film) {
		
		em.getTransaction().begin();
		em.merge(film);
		em.getTransaction().commit();
		
		return "modified succesfully";
		
		
	}

	public boolean removeFilm(short Film_id) {
		
		Film film=searchFilm((int) Film_id);
		if(film!=null)
		{

			em.getTransaction().begin();
			em.remove(film);
			em.getTransaction().commit();
			return true;
		}
		
		return false;
	}

	public Film searchFilm(Integer film_id) {
		
		
		
	return em.find(Film.class, film_id);
	}

	public List<Film> getAllFilm() {
		
		TypedQuery<Film> query = em.createQuery("Select f from Film f",Film.class);
		return query.getResultList();
	}

	
	
	
	
	
	
}
