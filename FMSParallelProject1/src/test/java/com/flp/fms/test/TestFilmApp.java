package com.flp.fms.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

import java.lang.NullPointerException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.flp.fms.dao.IActorDao;
import com.flp.fms.dao.IFilmDao;
import com.flp.fms.domain.Film;
import com.flp.fms.exceptions.FieldEmptyException;
import com.flp.fms.exceptions.NegativeNumberException;
import com.flp.fms.exceptions.RecordNotFoundException;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IActorService;
import com.flp.fms.service.IFilmService;

import junit.framework.TestCase;

public class TestFilmApp  {
	

	private static final String String = null;
	@Mock
	IFilmDao filmdao;
	IActorDao actordao;
	IFilmService filmservice;
	IActorService actorservice;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);	
		filmservice=new FilmServiceImpl(filmdao);
		//actorservice=new ActorServiceImpl(actordao);
	}
	
//Add film must throw exceptions for invalid inputs and should add successfully for valid inputs

	@Test(expected = java.lang.NullPointerException.class)
	public void AddFilmIsAddedSuccessfullyWithValidInputs() throws FieldEmptyException,ParseException,NegativeNumberException
	{
	
		Map <Integer,Object> film=new HashMap<Integer,Object>();
		
		film.put(1, "der");
		film.put(2, null);
		film.put(3, dateFormat.parse("20-10-1990"));
		filmservice.AddFilm(film);
			
	}	

	@Test(expected=java.lang.ClassCastException.class)	
	public void AddFilmReturnsNullWithInvalidInputs() throws FieldEmptyException,ParseException,NegativeNumberException
	{
	
		Map <Integer,Object> film=new HashMap<Integer,Object>();
		
		film.put(6, 36567);
		film.put(2, null);
		film.put(4, 2565);
		filmservice.AddFilm(film);
			
	}	
		
	//removeFilm must return null with null inputs
	
	@Test(expected = com.flp.fms.exceptions.FieldEmptyException.class)
	public void removeFilmWillReturnNullWithIdZero() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException{
		
		assertEquals(false,filmservice.removeFilm((short) 0));
	}
		

	//removeFilm must return null with invalid inputs

	@Test(expected = com.flp.fms.exceptions.NegativeNumberException.class)
	public void whenTheidIsZeroInRemoveFilmThrowException() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException
	{
		filmservice.removeFilm((short) -10);
	}	
		
		

	//searchFilm must return null with  null inputs
	
	@Test(expected = com.flp.fms.exceptions.FieldEmptyException.class)
	public void whenTheidIsZeroInSearchFilmThrowException() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException
	{
		filmservice.searchFilm(0);
	}
		
	//searchFilm must return null with  invalid inputs
	
			@Test(expected = com.flp.fms.exceptions.NegativeNumberException.class)
					public void whenTheidIsNegativeInSearchFilmThrowException() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException
					{
						filmservice.searchFilm(-1);
					}
			
			
			
	
	
	
	
	
	
	
}
