package com.flp.fms.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.flp.fms.domain.Film;

public interface IFilmService {
public String  AddFilm(Map filmList) throws ParseException;
public String modifyFilm(Map filmlist);
public boolean removeFilm(short film_id);
Film searchFilm(Integer film_id);
List<Film> getAllFilm();



}
