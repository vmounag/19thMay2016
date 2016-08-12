package com.cg.demo.repo;

import com.cg.demo.beans.Account;

public interface AccountRepo {

	public boolean save(Account a);
	
	public Account findById(int id);
	public Account withDraw(int id,int amount)
;}
