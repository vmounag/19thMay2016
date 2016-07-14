package com.flp.fms.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Category;
import com.flp.fms.domain.Film;
import com.flp.fms.domain.Language;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IActorService;
import com.flp.fms.service.IFilmService;

public class UserInteraction
{
	IFilmService filmService;
	IActorService actorService;
	Scanner sc=new Scanner(System.in);

	public UserInteraction()
	{
		filmService=new FilmServiceImpl();
		actorService=new ActorServiceImpl();
	}
	

	public void AddFilm() throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		List filmDetails=new ArrayList();
		Set<Actor> actors=new HashSet<Actor>();
		
		System.out.println("Enter title");
		filmDetails.add(sc.next());
		System.out.println("Enter description");
		filmDetails.add(sc.next());
		System.out.println("Enter release date");
		filmDetails.add(dateFormat.parse(sc.next()));
		System.out.println("Enter rental duration");
		filmDetails.add(sc.nextShort());
		System.out.println("Enter rental rate");
		filmDetails.add(sc.nextBigDecimal());
		System.out.println("Enter length of the movie");
		filmDetails.add(sc.nextShort());
		System.out.println("Enter replacement cost");
		filmDetails.add(sc.nextBigDecimal());
		System.out.println("Enter rating");
		filmDetails.add(sc.next());
		System.out.println("Enter special features");
		filmDetails.add(sc.next());
				
		
		System.out.println("Enter the language Name");
		filmDetails.add(sc.next());

		System.out.println("Enter the category Name");
		filmDetails.add(sc.next());
	
		System.out.println("Enter the Number of actors");
		int numberOfActors=sc.nextInt();
		
		for(int i=1;i <= numberOfActors;i++)
		{
			List actorDetails=new ArrayList();
			System.out.println("Enter the actor first name");
			actorDetails.add(sc.next());
			System.out.println("Enter the actor last name");
			actorDetails.add(sc.next());
			filmDetails.add(actorDetails);
			//actors.add(AddActor());
		}
		
		filmService.AddFilm(filmDetails);
	}
	
	public void ModifyFilm()
	{
		
	}
	
	public void RemoveFilm()
	{
		System.out.println("Enter the film id to remove");
		short film_id=sc.nextShort();
		if(filmService.RemoveFilm(film_id))
		{
			System.out.println("film Successfully removed");
		}
		else
		{
			System.out.println("film Not Found");
		}
	}
	
	public void SearchFilm()
	{
		System.out.println("Enter the film id to search");
		short film_id=sc.nextShort();
		Film film=filmService.SearchFilm(film_id);
		if(film !=null)
		{
			System.out.println("Found "+film);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
	public void getAllFilm()
	{
		List<Film> films=filmService.getAllFilm();
		System.out.println("All films details are "+films);
	}
	
	public Actor AddActor()
	{
		Actor actor=new Actor();
		System.out.println("Enter the actor first name");
		String firstName=sc.next();
		System.out.println("Enter the actor last name");
		String lastName=sc.next();
		System.out.println("Actor added successfully");
		return actorService.AddActor(firstName,lastName);
	}
	
	public void ModifyActor()
	{
		System.out.println("Enter the actor id to modify");
		int actorId=sc.nextInt();
		
		System.out.println("Enter the actor first name");
		String firstName=sc.next();
		System.out.println("Enter the actor last name");
		String lastName=sc.next();
		System.out.println("Actor modified successfully ,details are"+actorService.ModifyActor(actorId,firstName,lastName));	
	}
	
	public void RemoveActor()
	{
		System.out.println("Enter the actor id to remove");
		int actor_id=sc.nextInt();
		if(actorService.RemoveActor(actor_id))
		{
			System.out.println("Actor Successfully removed");
		}
		else
		{
			System.out.println("Actor Not Found");
		}
	}
	
	public void SearchActor()
	{
		System.out.println("Enter the actor id to search");
		int actor_id=sc.nextInt();
		Actor actor=actorService.SearchActor(actor_id);
		if(actor !=null)
		{
			System.out.println("Found "+actor);
		}
		else
		{
			System.out.println("Not Found");
		}
	}
	
	public void getAllActor()
	{
		List<Actor> actors= actorService.getAllActor();
		System.out.println("All actors details are "+actors);
	}
}
