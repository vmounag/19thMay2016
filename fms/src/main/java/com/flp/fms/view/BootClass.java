package com.flp.fms.view;

import java.text.ParseException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.flp.fms.dao.FilmDaoImplForDB;

public class BootClass 
{
	static BootClass bc=new BootClass();
	static Scanner sc=new Scanner(System.in);

	UserInteraction ui=new UserInteraction();
	
	public static void main(String args[]) throws ParseException
	{	
		while(true)
		{
			System.out.println("Menu");
			System.out.println("-------------");
			System.out.println("1.AddFilm"+"\n"+"2.ModifyFilm"+"\n"+"3.RemoveFilm"+"\n"+"4.SearchFilm"+"\n"+"5.getAllFilm"+"\n"+"6.AddActor"+"\n"+"7.ModifyActor"+"\n"+"8.RemoveActor"+"\n"+"9.SearchActor"+"\n"+"10.getAllActor"+"\n"+"11.Exit");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			
			bc.menuSelection(choice);
		}
	}
	
	private void menuSelection(int choice) throws ParseException
	{
		switch(choice)
		{
			case 1:ui.AddFilm();
					break;
			case 2:ui.ModifyFilm();
					break;
			case 3:ui.RemoveFilm();
					break;
			case 4:ui.SearchFilm();
					break;
			case 5:ui.getAllFilm();
					break;
			case 6:ui.AddActor();
					break;
			case 7:ui.ModifyActor();
					break;
			case 8:ui.RemoveActor();
					break;
			case 9:ui.SearchActor();
					break;
			case 10:ui.getAllActor();
					break;
			default:System.out.println("Inavalid Menu Selection");
					break;
			case 11:System.exit(0);
					break;
		}
	}
}
