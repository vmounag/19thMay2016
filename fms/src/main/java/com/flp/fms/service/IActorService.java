package com.flp.fms.service;

import java.util.List;

import com.flp.fms.domain.Actor;

public interface IActorService {

	Actor AddActor(String firstName,String lastName);

	Actor ModifyActor(int actorId,String firstName,String lastName);

	boolean RemoveActor(int actorId);

	Actor SearchActor(int actorId);

	List<Actor> getAllActor();

}