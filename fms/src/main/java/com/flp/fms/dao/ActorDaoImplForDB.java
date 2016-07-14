package com.flp.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.flp.fms.domain.Actor;


public class ActorDaoImplForDB implements IActorDao{
	
	private EntityManager em;
	private EntityManagerFactory emf;
	public ActorDaoImplForDB() {
		this.emf = Persistence.createEntityManagerFactory("hello");
		this.em = emf.createEntityManager();
	}
	
	
	public Actor AddActor(Actor actor) {
		Actor actor1=findActorByName(actor.getFirst_name(),actor.getLast_name());
		if(actor1 == null)
		{
			em.getTransaction().begin();
			em.persist(actor);
			em.getTransaction().commit();
			return actor;
		}
		else
		{
			em.getTransaction().begin();
			em.persist(actor1);
			em.getTransaction().commit();
			return actor1;
		}
	}

	public Actor ModifyActor(Actor actor) {
		em.getTransaction().begin();
		em.persist(actor);
		em.getTransaction().commit();
		return actor;
	}

	public boolean RemoveActor(int actor_id) {
		Actor actor=em.find(Actor.class, actor_id);
		if(actor != null)
		{
			em.getTransaction().begin();
			em.remove(actor);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public Actor SearchActor(int actor_id) {
		Actor actor=em.find(Actor.class, actor_id);
		return actor;
	}

	public List<Actor> getAllActor() {
		TypedQuery<Actor> query = em.createQuery("Select a from Actor a",Actor.class);
		return query.getResultList();
	}
	
	public Actor findActorByName(String first_name,String last_name){
		TypedQuery<Actor> query = em.createQuery("Select a from Actor a",Actor.class);

		for(Actor a:query.getResultList())
		{
			if(a.getFirst_name().equals(first_name) && a.getLast_name().equals(last_name))
			{
				return a;
			}
		}
		return null;
	}
}
	
	
