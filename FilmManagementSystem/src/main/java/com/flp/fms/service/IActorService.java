package com.flp.fms.service;

import java.util.List;
import java.util.Map;

import com.flp.fms.domain.Actor;

public interface IActorService {
Actor AddActor(String firstname,String lastname);
//Actor modifyActor(short actor_id,String firstname,String lastname);
boolean removeActor(int actor_id);
Actor searchActor(int actor_id);
List<Actor> getAllActor();
String modifyActor(Map<Integer, Object> actorList);

}
