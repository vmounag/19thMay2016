package com.flp.fms.view;

import java.text.ParseException;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;
import com.flp.fms.dao.FilmDaoImplForList;

public class BootClass {

	public static UserInteraction ui= new UserInteraction();
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
	
		
		
			menuSelection();

	}
	

		private static void menuSelection() throws ParseException{
			
			int choice;
			while(true)
			{
				System.out.println("Menu");
				System.out.println("1.Add film");
				System.out.println("2.Modify film");
				System.out.println("3.Remove film");
				System.out.println("4.Search film");
				System.out.println("5.GetAll film");
				System.out.println("6.Add Actor");
				System.out.println("7.Modify Actor");
				System.out.println("8.Remove Actor");
				System.out.println("9.Search Actor");
				System.out.println("10.GetAll Actor");
				System.out.println("11.Exit");	
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:ui.addFilm();
				        break;
				case 2: ui.modifyFilm();
				        break;
				case 3:ui.removeFilm();
				       
				       break;
				case 4:
			           ui.searchFilm();
			          
			           break; 
				case 5:ui.getAllFilm();
				       break;
				case 6:ui.AddActor();
				       break;
				case 7:ui.modifyActor();
				       break;
				case 8:ui.removeActor();
				       break;
				case 9:ui.searchActor();
				       break;
				case 10:ui.getAllActor();
				       break;
				case 11:ui.exit();
				       break;
				       
				}
			}
			
			}
}
				       
				       
	



