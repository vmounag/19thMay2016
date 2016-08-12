package com.flp.fms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flp.fms.dao.ActorDaoImplForList;
import com.flp.fms.dao.IActorDao;
import com.flp.fms.dao.IFilmDao;
import com.flp.fms.domain.Actor;
import com.flp.fms.exceptions.FieldEmptyException;
import com.flp.fms.exceptions.NegativeNumberException;
import com.flp.fms.exceptions.RecordNotFoundException;

public class ActorServiceImpl implements IActorService {
	
	IActorDao actordao;
	
public 	ActorServiceImpl()
{
	this.actordao=new ActorDaoImplForList();
	
}
public ActorServiceImpl(IActorDao actordao)
{
	this.actordao=actordao;
}

	
	public Actor AddActor(String firstname, String lastname) throws FieldEmptyException {
		if(firstname==null || lastname==null){
			throw new FieldEmptyException();
		}
		else{
		Actor actor=new Actor();
		
		actor.setFirst_name(firstname);
		actor.setLast_name(lastname);
		
		return actordao.AddActor(actor);
		}
	}

	

	public boolean removeActor(int actor_id) throws NegativeNumberException, FieldEmptyException, RecordNotFoundException {
		if(actor_id<0){
			throw new NegativeNumberException();
		}
		if(actor_id==0){
			throw new FieldEmptyException();
		}
		if(actordao.removeActor(actor_id))
		{
			return actordao.removeActor(actor_id);
		}
		else throw new RecordNotFoundException();
	}

	
		
	public List<Actor> getAllActor() {
		
		return actordao.getAllActor();
	}

	public Actor searchActor(int actor_id) throws NegativeNumberException, FieldEmptyException, RecordNotFoundException {
		if(actor_id==0)
		{
			throw new FieldEmptyException();
		}
		if(actor_id<0)
		{
			throw new NegativeNumberException();
		}
		if(actordao.searchActor(actor_id)!=null)
		{
			return actordao.searchActor(actor_id);
		}
		else throw new RecordNotFoundException();
	}

	@Override
	public String modifyActor(Map actorList) {
		Actor actor=actordao.searchActor((Integer)actorList.get(1));
		if(actor!=null){
			actor.setFirst_name((String)actorList.get(2));
			actor.setLast_name((String)actorList.get(3));
			actordao.modifyActor(actor);
			return "success";
			
	
	}else
		return null;

	
	}

}

