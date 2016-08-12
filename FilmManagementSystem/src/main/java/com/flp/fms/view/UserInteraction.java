package com.flp.fms.view;
import java.util.List;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Film;
import com.flp.fms.service.ActorServiceImpl;
import com.flp.fms.service.FilmServiceImpl;
import com.flp.fms.service.IActorService;
import com.flp.fms.service.IFilmService;
import javax.persistence.EntityManager;
//import javax.persistence.TypedQuery;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import com.flp.fms.domain.*;

import com.flp.fms.service.*;



public class UserInteraction {
	private static Scanner sc=new Scanner(System.in);
	IFilmService filmservice;
	IActorService actorservice;
	public UserInteraction()
	{
		filmservice= new FilmServiceImpl();
	 actorservice= new ActorServiceImpl();
	}	
	
	public void addFilm() throws ParseException
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Map<Integer,Object> filmlist=new HashMap();
		System.out.println("enter film title");
		filmlist.put(1,(sc.next()));
		System.out.println("enter description");
		filmlist.put(2,sc.next());
		System.out.println("enter release year");
		filmlist.put(3,dateFormat.parse(sc.next()));
		System.out.println("enter rental duration");
		filmlist.put(4,sc.nextShort());
		System.out.println("enter rental rate");
		filmlist.put(5,sc.nextShort());
		System.out.println("enter length");
		filmlist.put(6,sc.nextInt());
		System.out.println("enter replacementcost");
		filmlist.put(7,sc.nextBigInteger());
		System.out.println("enter rating");
		filmlist.put(8,sc.next());
		System.out.println("enter special features");
		filmlist.put(9,sc.next());
		System.out.println("enter language");
		filmlist.put(10,sc.next());
		System.out.println("enter category");
		filmlist.put(11,sc.next());
		int j=12;
		System.out.println("enter number of actors");
		int numofactors=sc.nextInt();
		//System.out.println("enter number of actors");
		for(int i=1;i<=numofactors;i++)
		{  
			Map<Integer,Object> actorDetails=new HashMap();
			System.out.println("enter firstname of actor");
		actorDetails.put(1,sc.next());
		System.out.println("enter lastname of actor");
		actorDetails.put(2,sc.next());
		filmlist.put(j,actorDetails);
		j++;
		}
		System.out.println(filmservice.AddFilm(filmlist));
		
	}
		 public void modifyFilm() throws ParseException
		 {
			 
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				Map<Integer,Object> filmlist=new HashMap();
				System.out.println("enter the film id that should be modified");
				filmlist.put(1,(sc.nextInt()));
				System.out.println("Enter the modification you want to do");
				System.out.println("1.Title");
				System.out.println("2.Description");
				System.out.println("3.Language");
				System.out.println("4.Rental duration");
				System.out.println("5.Rental rate");
				System.out.println("6.Length");
				System.out.println("7.Replacement cost");
				System.out.println("8.Rating");
				System.out.println("9.Special features");
				System.out.println("10.category");
				
				int choice=sc.nextInt();

				switch(choice){


				case 1:System.out.println("enter new title");

				        String title=sc.next();

				        filmlist.put(2, title);

				        System.out.println(filmservice.modifyFilm(filmlist));

				        break;

				case 2:System.out.println("enter new description");

		               String description=sc.next();

		                filmlist.put(3,description);

		                 System.out.println(filmservice.modifyFilm(filmlist));

		                break;

				case 3:System.out.println("enter new language");

	               String language=sc.next();

	                filmlist.put(11,language);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;

				

				case 4:System.out.println("enter new rental duration");

	               short rental_duration=sc.nextShort();

	                filmlist.put(5, rental_duration);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;

				case 5:System.out.println("enter new rental rate");

	               short rental_rate=sc.nextShort();

	                filmlist.put(6, rental_rate);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;
				
				case 6:System.out.println("enter new length");

	               int length=sc.nextInt();

	                filmlist.put(7, length);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;
				

				case 7:System.out.println("enter new replacement cost");

	               BigInteger replacement_cost=sc.nextBigInteger();

	                filmlist.put(8, replacement_cost);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;
				
				case 8:System.out.println("enter new Rating");

	               String rating=sc.next();

	                filmlist.put(9, rating);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;
				  
				case 9:System.out.println("enter new Special features");

	               String specialfeatures=sc.next();

	                filmlist.put(10,  specialfeatures);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;
				  
				case 10:System.out.println("enter new category");

	               String category=sc.next();

	                filmlist.put(12,  category);

	                 System.out.println(filmservice.modifyFilm(filmlist));

	                break;
				}
	                
	                
				
				
				
				
			
				/*filmlist.put(2,(sc.next()));
				System.out.println("enter description");
				filmlist.put(3,sc.next());
				System.out.println("enter release year");
				
					filmlist.put(4,dateFormat.parse(sc.next()));
				
				System.out.println("enter rental duration");
				filmlist.put(5,sc.nextShort());
				System.out.println("enter rental rate");
				filmlist.put(6,sc.nextShort());
				System.out.println("enter length");
				filmlist.put(7,sc.nextInt());
				System.out.println("enter replacementcost");
				filmlist.put(8,sc.nextBigInteger());
				System.out.println("enter rating");
				filmlist.put(9,sc.next());
				System.out.println("enter special features");
				filmlist.put(10,sc.next());
				System.out.println("enter language");
				filmlist.put(11,sc.next());
				System.out.println("enter category");
				filmlist.put(12,sc.next());
				int j=13;
				
				System.out.println("enter number of actors");
				int numofactors=sc.nextInt();
				//System.out.println("enter number of actors");
				for(int i=1;i<=numofactors;i++)
				{  
					Map<Integer,Object> actorDetails=new HashMap();
					System.out.println("enter firstname of actor");
				actorDetails.put(1,sc.next());
				System.out.println("enter lastname of actor");
				actorDetails.put(2,sc.next());
				filmlist.put(j,actorDetails);
				j++;
				}
			 */
			 System.out.println(filmservice.modifyFilm(filmlist));
				} 
		 
		public void removeFilm()
		{
			System.out.println("Enter the film id to remove");
			short film_id=sc.nextShort();
			if(filmservice.removeFilm(film_id))
			{
				System.out.println("film Successfully removed");
			}
			else
			{
				System.out.println("film Not Found");
			}
		}
		public void searchFilm()
		{
			System.out.println("search film by film id");
			short film_id=sc.nextShort();
			Film film=filmservice.searchFilm((int) film_id);
			if(film !=null)
			{
				System.out.println("found "+film);
			}
			else
				System.out.println("not found");
		}	
		public List getAllFilm()
		{
			List films= (List) filmservice.getAllFilm();
			System.out.println("all films are "+films);
			return films;
		}
		public Actor AddActor()
		{
			Actor actor=new Actor();
			System.out.println("enter first name");
			String firstname=sc.next();
			System.out.println("enter last name");
			String lastname=sc.next();
			return actorservice.AddActor(firstname,lastname);
		}
		public void modifyActor()
		{
			
			Map<Integer,Object> actorList=new HashMap();
			
			System.out.println("enter id of the actor to modify");
			actorList.put(1,sc.nextInt());
			System.out.println("Enter firstname");
			actorList.put(2,sc.next());
			
			System.out.println("Enter  lastname");
			actorList.put(3,sc.next());
			
			System.out.println(actorservice.modifyActor(actorList));
			
			/*System.out.println("enter actor id that shoulb be modified");
			int actor_id=sc.nextInt();
			System.out.println("enter first name");
			String firstname=sc.next();
			System.out.println("enter last name");
			String lastname=sc.next();
			System.out.println("modified actor details are "+actorservice.modifyActor((short) actor_id,firstname,lastname));*/
		}
		public void searchActor()
		{    
			System.out.println("enter the actor id that should be retrievd");
			int actor_id=sc.nextInt();
			Actor actor=actorservice.searchActor(actor_id);
			if(actor !=null)
			{
				System.out.println("Found "+actor);
			}
			else
			{
				System.out.println("Not Found");
			}
		}
			
		public void removeActor()
		{
			System.out.println("enter actor id that should be removed");
			int actor_id=sc.nextInt();
			if(actorservice.removeActor((short) actor_id))
			{
				System.out.println("actor details removed sucessfully");
			}
			else System.out.println("cannot be removed");
				
		}
		public List getAllActor()
		{
		List actors=(List) actorservice.getAllActor();
			System.out.println("all actor details "+actors);
			return actors;
			
			
		}
			
		public void exit(){
			System.exit(0);
		}
	
	}
		
	
	
	

