package com.flp.fms.service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.flp.fms.dao.FilmDaoImplForDB;
import com.flp.fms.dao.IFilmDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.view.UserInteraction;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

public class FilmServiceImpl implements IFilmService
{
	IFilmDao filmDao;
	
	public FilmServiceImpl() 
	{
		filmDao=new FilmDaoImplForDB();
	}
	
	public void AddFilm(List filmDetails) throws ParseException
	{
		Film film=new Film();
		film.setTitle((String) filmDetails.get(0));
		film.setDescription((String) filmDetails.get(1));
		film.setRelease_year((Date) filmDetails.get(2));
		film.setRental_duration( (Short) filmDetails.get(3));
		film.setRental_rate((BigDecimal) filmDetails.get(4));
		film.setLength((Short) filmDetails.get(5));
		film.setReplacement_cost((BigDecimal) filmDetails.get(6));
		film.setRating((String) filmDetails.get(7));
		film.setSpecial_features((String) filmDetails.get(8));
		
		Language lang=filmDao.findLanguageByName((String) filmDetails.get(9));
		if(lang == null)
		{
			lang=new Language((String) filmDetails.get(9));
		}
		film.setLanguage(lang);
		
		Category catg=filmDao.findCategoryByName((String) filmDetails.get(10));
		if(catg == null)
		{
			catg=new Category((String) filmDetails.get(10));
		}
		film.setCategory(catg);
		
		for(int i=11;i<filmDetails.size();i++)
		{
			Actor actor=new Actor();
			List actorDetails=(List) filmDetails.get(i);
			actor.setFirst_name((String) actorDetails.get(0));
			actor.setLast_name((String) actorDetails.get(1));
			film.getActors().add(actor);
		}
		
		filmDao.AddFilm(film);
	}
	
	public void ModifyFilm()
	{
		
		
	}

	public boolean RemoveFilm(short film_id)
	{
		return filmDao.RemoveFilm(film_id);
	}

	public Film SearchFilm(short film_id) 
	{
		return filmDao.SearchFilm(film_id);
	}

	public List<Film> getAllFilm() 
	{
		return filmDao.getAllFilm();
	}
}
