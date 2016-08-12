package com.flp.fms.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.flp.fms.domain.Film;
import com.flp.fms.exceptions.FieldEmptyException;
import com.flp.fms.exceptions.NegativeNumberException;

public interface IFilmService {
public String  AddFilm(Map filmList) throws ParseException, FieldEmptyException, NegativeNumberException;
public String modifyFilm(Map filmlist);
public boolean removeFilm(short film_id) throws FieldEmptyException, NegativeNumberException;
Film searchFilm(Integer film_id) throws FieldEmptyException, NegativeNumberException;
List<Film> getAllFilm();



}
