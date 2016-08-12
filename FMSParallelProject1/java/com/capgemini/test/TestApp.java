package com.capgemini.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

import com.flp.fms.dao.FilmDaoImplForList;
import com.flp.fms.dao.IFilmDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IFilmService;

public class TestApp {

	
	@Mock
	IFilmDao filmDao;
	
	IFilmService filmService;

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);	
		filmService=new FilmServiceImpl(filmDao);
	}

	
	//createFilm must return valid with valid inputs
		@Test
		public void createFilmWillReturnValidWithValidInputs() throws ParseException {
			
			Film film=new Film();
	
			film.setTitle("xyz");
			film.setDescription("This film is an epic.");
			film.setRelease_year(dateFormat.parse("20-03-1998"));
			film.setRental_duration(2);
			film.setRental_rate(4);
			film.setLength(3);
			film.setReplacement_cost(6);
			film.setRating(4);
			film.setSpecial_features("action");
			film.setLanguage(new Language("telugu"));
			film.setCategory(new Category("action"));
			film.setActors(new HashSet<Actor>());

			Mockito.when(filmDao.addFilm(film)).thenReturn("added successfully");
			
			assertEquals("added successfully",filmDao.addFilm(film));
		
		}
		
		//createFilm must return null when any input is null
		
		@Test
		public void createFilmWillReturnNullWithInvalidOrNullInputs() throws ParseException{
			Film film=new Film();
			
			film.setTitle("xyz");
			film.setDescription("This film is an epic.");
			film.setRelease_year(dateFormat.parse("20-03-1998"));
			film.setRental_duration(2);
			film.setRental_rate(4);
			film.setLength(3);
			film.setReplacement_cost(6);
			film.setRating(4);
			film.setSpecial_features("action");
			film.setLanguage(new Language());
			film.setCategory(new Category());
			film.setActors(new HashSet<Actor>());

			assertEquals(null,filmDao.addFilm(film));
		}
		
		
		// createFilm must throw an exception when with illegal arguments
		@Test(expected=com.flp.fms.Exceptions.IllegalArgumentException.class)
		public void createFilmWillThrowAnExceptionWithIllegalArguments() throws ParseException,IllegalArgumentException {
			Film film=new Film();
			
			film.setTitle("xyz");
			film.setDescription("This film is an epic.");
			film.setRelease_year(dateFormat.parse("20-03-1998"));
			film.setRental_duration(2);
			film.setRental_rate(4);
			film.setLength(3);
			film.setReplacement_cost(-6);
			film.setRating(4);
			film.setSpecial_features("action");
			film.setLanguage(new Language());
			film.setCategory(new Category());
			film.setActors(new HashSet<Actor>());
			filmDao.addFilm(film);
	
		}
		
		
		
	
}
