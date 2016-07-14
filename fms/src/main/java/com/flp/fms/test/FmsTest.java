package com.flp.fms.test;


import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.flp.fms.dao.FilmDaoImplForDB;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IFilmService;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FmsTest {
	
	private IFilmService filmService;
	@Mock private FilmDaoImplForDB filmDao;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		filmService = new FilmServiceImpl();
	}

	@Test
	public void testSearchActor() {
		
	}
	
	

}
