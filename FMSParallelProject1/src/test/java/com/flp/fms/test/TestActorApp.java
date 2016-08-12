package com.flp.fms.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.flp.fms.dao.IActorDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.exceptions.FieldEmptyException;
import com.flp.fms.exceptions.NegativeNumberException;
import com.flp.fms.exceptions.RecordNotFoundException;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.IActorService;

import junit.framework.TestCase;

public class TestActorApp {

	@Mock
	IActorDao actordao;
	
	IActorService actorservice;
	
	
	

	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);	
		actorservice=new ActorServiceImpl(actordao);
	}

	//When adding new actor with valid inputs
	@Test
	public void createActorWillReturnValidWithValidInputs() throws FieldEmptyException {
		
	
		
		Actor actor=new Actor();

		actor.setFirst_name("xyz");
		actor.setLast_name("zyx");

		//Mockito.when(actordao.AddActor(actor)).thenReturn(actor);
		
		
		assertEquals(actor,actorservice.AddActor("xyz","zyx"));
	
	}
	//when input is null it catches FieldEmptyException
	@Test(expected=com.flp.fms.exceptions.FieldEmptyException.class)
	public void createActorWillReturnNullWithNullInputs() throws FieldEmptyException{
		String firstName=null;
		String lastName=null;
		actorservice.AddActor(firstName,lastName);
		
		
	}
	
	

	//when negative id is given it catches NegativeNumberException
	@Test(expected=com.flp.fms.exceptions.NegativeNumberException.class)
	public void removeFilmWillReturnValidWithValidInputs() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException{
		
		//Mockito.when(actordao.removeActor(-3)).thenReturn(true);
		
		assertEquals(true,actorservice.removeActor(-3));
	}
	

	//removeActor must return null with null inputs
	
	@Test(expected = com.flp.fms.exceptions.FieldEmptyException.class)
	public void removeActorWillReturnNullWithIdZero() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException{
		
		assertEquals(false,actorservice.removeActor(0));
	}
	
	
	
	//removeActor must return null when record is not present
	
	@Test(expected = com.flp.fms.exceptions.RecordNotFoundException.class)
	public void removeActorWillReturnNullWithNoRecord() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException{
		Actor actor=new Actor();
		//Mockito.when(actorservice.searchActor(120)).thenReturn(null);
		assertEquals(false,actorservice.removeActor(120));
	}

	//searchActor must return null with  invalid inputs
	
	@Test(expected = com.flp.fms.exceptions.NegativeNumberException.class)
			public void whenTheidIsNegativeInSearchActorThrowException() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException
			{
				actorservice.searchActor(-1);
			}
	
	@Test(expected = com.flp.fms.exceptions.FieldEmptyException.class)
	public void whenTheidIsZeroInSearchActorThrowException() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException
	{
		actorservice.searchActor(0);
	}

	//searchActor must return null with  no record
	
	@Test(expected = com.flp.fms.exceptions.RecordNotFoundException.class)
	public void whenTheidIsNotPresentInSearchActorThrowException() throws FieldEmptyException, NegativeNumberException, RecordNotFoundException
	{
		actorservice.searchActor(121);
	}
	
	
	
}
	
	
	
	






















