package com.flp.fms.service;

import java.util.List;
import java.util.Map;

import com.flp.fms.domain.Actor;
import com.flp.fms.exceptions.FieldEmptyException;
import com.flp.fms.exceptions.NegativeNumberException;
import com.flp.fms.exceptions.RecordNotFoundException;

public interface IActorService {
Actor AddActor(String firstname,String lastname) throws FieldEmptyException;
//Actor modifyActor(short actor_id,String firstname,String lastname);
boolean removeActor(int actor_id) throws NegativeNumberException, FieldEmptyException, RecordNotFoundException;
Actor searchActor(int actor_id) throws NegativeNumberException, FieldEmptyException, RecordNotFoundException;
List<Actor> getAllActor();
String modifyActor(Map<Integer, Object> actorList);

}
