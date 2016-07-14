package com.flp.fms.dao;

import java.util.List;

import com.flp.fms.domain.Actor;

public interface IActorDao
{
	Actor AddActor(Actor actor);
	Actor ModifyActor(Actor actor);
	boolean RemoveActor(int actor_id);
	Actor SearchActor(int actor_id);
	List<Actor> getAllActor();
}

