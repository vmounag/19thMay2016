package com.cg.demo.service;

import com.cg.demo.beans.Account;
import com.cg.demo.exceptions.InsufficientFundsException;
import com.cg.demo.exceptions.InsufficientInitialBalanceException;
import com.cg.demo.exceptions.InvalidAccountException;
import com.cg.demo.repo.AccountRepo;

public class AccountServiceImpl implements AccountService {
	
	private AccountRepo repo;
	
	public AccountServiceImpl(AccountRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Account createAccount(double balance) throws InsufficientInitialBalanceException {
	
		if(balance <500)
			throw new InsufficientInitialBalanceException();
		
		Account a = new Account(1);
		a.setBalance(balance);

		if(repo.save(a)){
			return a;
		}
		return null;
	}

	@Override
	public Account showBalance(int id) throws InvalidAccountException {
		// TODO Auto-generated method stub
		Account a = repo.findById(id);
		if(a==null){
			throw new InvalidAccountException();
		}
		return a;
	}

	@Override
	public Account withdraw(int id, double amount) throws InvalidAccountException, InsufficientFundsException 
	{
		Account a=new Account(1);
		
		if((a.getBalance()-amount)>=0)
		{
			a.setBalance(a.getBalance()-amount);
			return a;
		}
		
		throw new InsufficientBalanceException();
		
		return null;
	}

	@Override
	public Account deposit(int id, double amount) throws InvalidAccountException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
