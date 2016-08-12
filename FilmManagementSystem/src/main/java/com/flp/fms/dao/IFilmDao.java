package com.flp.fms.dao;

import java.util.List;
import java.util.Map;

import com.flp.fms.domain.Film;

public interface IFilmDao {

	
	public String addFilm(Film film);
	public String modifyFilm(Film film);
	public boolean removeFilm(short Film_id);
	public Film searchFilm(Integer film_id);
	public List<Film> getAllFilm();
	

}
