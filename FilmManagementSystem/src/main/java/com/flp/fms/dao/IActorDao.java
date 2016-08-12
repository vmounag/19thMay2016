package com.flp.fms.dao;

import java.util.List;

import com.flp.fms.domain.Actor;

public interface IActorDao {

	public Actor AddActor(Actor actor);
	
	public Actor modifyActor(Actor actor);
	
	public boolean removeActor(int actor_id);
	
	public Actor searchActor(int actor_id);
	
	public List<Actor> getAllActor();
	
}
