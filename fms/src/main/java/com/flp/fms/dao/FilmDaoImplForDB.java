package com.flp.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;

public class FilmDaoImplForDB implements IFilmDao
{
	private EntityManager em;
	private EntityManagerFactory emf;
	public FilmDaoImplForDB() {
		this.emf = Persistence.createEntityManagerFactory("hello");
		this.em = emf.createEntityManager();
	}

	public void AddFilm(Film film) 
	{
		em.getTransaction().begin();
		em.persist(film);
		em.getTransaction().commit();
	}

	public void ModifyFilm() {
		// TODO Auto-generated method stub
		
	}

	public boolean RemoveFilm(short film_id) {
		Film film=findFilm(film_id);
		
		if(film != null)
		{
			em.getTransaction().begin();
			em.remove(film);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public Film SearchFilm(short film_id) {
		Film film=findFilm(film_id);
		return film;
	}

	public List<Film> getAllFilm() {
		TypedQuery<Film> query = em.createQuery("Select f from Film f",Film.class);
		return query.getResultList();
		
	}
	
	public Film findFilm(short film_id) {
		return em.find(Film.class, film_id);
	}
	
	public Language findLanguageByName(String language_name){
		TypedQuery<Language> query = em.createQuery("Select l from Language l",Language.class);
		
		for(Language l:query.getResultList())
		{
			if(l.getName().equals(language_name))
			{
				return l;
			}
		}
		return null;
	}
	
	public Category findCategoryByName(String category_name){
		TypedQuery<Category> query = em.createQuery("Select c from Category c",Category.class);
		
		for(Category c:query.getResultList())
		{
			if(c.getName().equals(category_name))
			{
				return c;
			}
		}
		return null;
	}

}
