package com.flp.fms.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flp.fms.dao.ActorDaoImplForList;
import com.flp.fms.dao.IActorDao;
import com.flp.fms.domain.Actor;

public class ActorServiceImpl implements IActorService {
	
	IActorDao actordao;
	
public 	ActorServiceImpl()
{
	this.actordao=new ActorDaoImplForList();
	
}
	
	public Actor AddActor(String firstname, String lastname) {
		Actor actor=new Actor();
		
		actor.setFirst_name(firstname);
		actor.setLast_name(lastname);
		
		return actordao.AddActor(actor);
	}

	

	public boolean removeActor(int actor_id) {
		
		return actordao.removeActor(actor_id);
	}

	
		
	public List<Actor> getAllActor() {
		
		return actordao.getAllActor();
	}

	public Actor searchActor(int actor_id) {
	
		 return actordao.searchActor(actor_id);
	}


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

