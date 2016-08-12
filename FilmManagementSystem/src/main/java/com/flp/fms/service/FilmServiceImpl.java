package com.flp.fms.service;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.flp.fms.dao.FilmDaoImplForList;
import com.flp.fms.dao.IFilmDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;

import java.text.ParseException;

public class FilmServiceImpl implements IFilmService {

	IFilmDao filmdao;
	public FilmServiceImpl()
	{
		filmdao=new FilmDaoImplForList();
	}
	
	public FilmServiceImpl(IFilmDao filmdao)
	{
		this.filmdao=filmdao;
	}
	
	
	public String  AddFilm(Map filmlist) throws ParseException
	{
		
		Film film=new Film();
		film.setTitle((String) filmlist.get(1));
		film.setDescription((String) filmlist.get(2));
		film.setRelease_year((Date)filmlist.get(3));
		film.setRental_duration((Short) filmlist.get(4));
		film.setRental_rate((Short) filmlist.get(5));
	   film.setLength((Integer) filmlist.get(6));
		film.setReplacement_cost((BigInteger) filmlist.get(7));
		film.setRating((String) filmlist.get(8));
		film.setSpecial_features((String)filmlist.get(9));
		
		Language language=new Language();
		language.setName((String) filmlist.get(10));
	    film.setLanguage(language);
	    
	    
	    Category category=new Category();
		category.setName((String) filmlist.get(11));
	    film.setCategory(category);
		
		for(int i=12;i<filmlist.size();i++)
		{
			Actor actor=new Actor();
			Map<Integer,Object> actorDetails=(Map) filmlist.get(i);
			actor.setFirst_name((String) actorDetails.get(1));
			actor.setLast_name((String) actorDetails.get(2));
			film.getActors().add(actor);
		}
		
		return filmdao.addFilm(film);

	}
	
	public String modifyFilm(Map filmlist)
	{	
		Film film=filmdao.searchFilm((Integer)filmlist.get(1));
		if(film!=null){

			if(filmlist.get(2)!=null){

			film.setTitle((String)filmlist.get(2));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(3)!=null){

			film.setDescription((String)filmlist.get(3));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(11)!=null){

			Language language=new Language();

			language.setName((String)filmlist.get(4));

			film.setLanguage(language);

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(5)!=null){

			film.setRental_duration(((Short)filmlist.get(5)));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(6)!=null){

			film.setRental_rate(((Short)filmlist.get(6)));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(7)!=null){

			film.setLength((((Integer)filmlist.get(7))));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(8)!=null){

			film.setReplacement_cost(((( BigInteger)filmlist.get(8))));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(9)!=null){

			film.setRating((String)filmlist.get(9));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(10)!=null){

			film.setSpecial_features(((String)filmlist.get(10)));

			return filmdao.modifyFilm(film);

			}

			else if(filmlist.get(12)!=null){

			Category category=new Category();

			category.setName((String)filmlist.get(11));

			film.setCategory(category);

			return filmdao.modifyFilm(film);

			}

			else

			return null;


			}

			return null;



			}

		
		
	
	
	public boolean removeFilm(short film_id)
	{
		
		return filmdao.removeFilm(film_id);
		
	//	return true;	
		
	}
	
	
public	Film searchFilm(Integer film_id)
	{
		return filmdao.searchFilm((int) film_id);
		
	}
	
	
	
public List getAllFilm()
{
	
	return filmdao.getAllFilm();
}


		
	
}
