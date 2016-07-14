package com.flp.fms.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.flp.fms.dao.ActorDaoImplForDB;
import com.flp.fms.dao.IActorDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.domain.Film;

public class ActorServiceImpl implements IActorService
{
	IActorDao actorDao;
	
	public ActorServiceImpl() {
		actorDao=new ActorDaoImplForDB();
	}

	
	public Actor AddActor(String firstName,String lastName)
	{
		Actor actor=new Actor();
		actor.setFirst_name(firstName);
		actor.setLast_name(lastName);
		return actorDao.AddActor(actor);
	}
	
	
	public Actor ModifyActor(int actorId,String firstName,String lastName) {
		Actor actor=actorDao.SearchActor(actorId);
		
		if(actor!=null)
		{
			actor.setFirst_name(firstName);
			actor.setLast_name(lastName);
			return actorDao.ModifyActor(actor);
		}
		return null;
		
	}

	
	public boolean RemoveActor(int actorId) {
		return actorDao.RemoveActor(actorId);
	}

	
	public Actor SearchActor(int actorId) {
		return actorDao.SearchActor(actorId);
	}

	
	public List<Actor> getAllActor() {
		return actorDao.getAllActor();
	}
}
