package com.cg.demo.service;

import com.cg.demo.beans.Account;
import com.cg.demo.exceptions.InsufficientFundsException;
import com.cg.demo.exceptions.InsufficientInitialBalanceException;
import com.cg.demo.exceptions.InvalidAccountException;

public interface AccountService {

	public Account createAccount(double balance) throws InsufficientInitialBalanceException;
	
	public Account showBalance(int id) throws InvalidAccountException;
	
	public Account withdraw(int id, double amount) throws InvalidAccountException, InsufficientFundsException;
	
	public Account deposit(int id, double amount) throws InvalidAccountException;
}
