package com.flp.fms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.flp.fms.domain.Actor;

public class ActorDaoImplForList implements IActorDao {
	
	private EntityManager em;
	private EntityManagerFactory emf;
	public ActorDaoImplForList() {
		this.emf = Persistence.createEntityManagerFactory("hello");
		this.em = emf.createEntityManager();
	
	}

	public Actor AddActor(Actor actor) {
		em.getTransaction().begin();
		em.persist(actor);
		em.getTransaction().commit();
		
		
		return actor;
	}
	public Actor modifyActor(Actor actor) {
		
		em.getTransaction().begin();
		em.persist(actor);
		em.getTransaction().commit();
		return actor;
			
	}
	

	public boolean removeActor(int actor_id) {
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

	

	public List<Actor> getAllActor() {
		TypedQuery<Actor> query = em.createQuery("Select actor from Actor actor",Actor.class);
		return query.getResultList();
		
	}

	public Actor searchActor(int actor_id) {
		Actor actor=em.find(Actor.class, actor_id);
		return actor;
	
	}

	

	

}
