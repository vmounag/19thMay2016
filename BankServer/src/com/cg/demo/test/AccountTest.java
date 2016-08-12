package com.cg.demo.test;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cg.demo.beans.Account;
import com.cg.demo.exceptions.InsufficientFundsException;
import com.cg.demo.exceptions.InsufficientInitialBalanceException;
import com.cg.demo.exceptions.InvalidAccountException;
import com.cg.demo.repo.AccountRepo;
import com.cg.demo.service.AccountService;
import com.cg.demo.service.AccountServiceImpl;

import static org.junit.Assert.*;

public class AccountTest {
// user story
	// Test cases for createAccount()
	//1.customer object reference should not be null
	//2. Account should be opened with min Rs. 500
	//3. If valid information is passed then system should create the account successfully.
	
	
	private AccountService service;
	@Mock private AccountRepo repo;
	private Exception IllegalArgumentException;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		service = new AccountServiceImpl(repo);
	}
	//@Test
	//public void customerObjectReferenceShouldNotBeNull()
	
	
	@Test(expected=com.cg.demo.exceptions.InsufficientInitialBalanceException.class)
	public void accountShouldBeOpenedWithAtLeast500() throws InsufficientInitialBalanceException{
		service.createAccount(100);
	}
	
	@Test
	public void ifTheValidInfoIsPassedAccountShouldBeCreatedSuccessfully() throws InsufficientInitialBalanceException{
		Account a = new Account(1);
		a.setBalance(1000);
		when(repo.save(a)).thenReturn(true);
		assertEquals(a.getBalance()+"", service.createAccount(1000).getBalance()+"");
	}

	//1. if the account no is invalid system should throw exception while getting the balance
	//2. System should return Account details if the account no is valid
	
	@Test(expected=com.cg.demo.exceptions.InvalidAccountException.class)
	public void ifTheAccountNoIsInvalidSystemShouldThrowException() throws InvalidAccountException{
		
		service.showBalance(1);

	}

	@Test
	public void ifTheAccountNoIsValidSystemShouldReturnAccountDetils() throws InvalidAccountException{
		Account a = new Account(4);
		a.setBalance(4000);
		when(repo.findById(4)).thenReturn(a);
		
		assertEquals(a.getBalance()+"", service.showBalance(4).getBalance()+"");
	}
      //1.if amount greater than balance throw insufficient balance exception
	//2.if account number is negative throw illegal argument exception
	//3.Account number should be valid
	@Test(expected=com.cg.demo.exceptions.InsufficientFundsException.class)
	public void IfAmountGreaterThanBalance() throws InsufficientFundsException, InvalidAccountException
	{
		Account a=new Account(2);
		a.setBalance(5000);
		//when(repo.withDraw(2,6000));
		double amount=2000;
		service.withdraw(2, 2000);
		if(a.getBalance()<amount)
        throw new InsufficientFundsException();
    		}
@Test//(expected=com.cg.demo.exceptions.IllegalArgumentException.class)
public void ifNumberIsNegative() throws IllegalArgumentException
{
	Account a=new Account(5);
	if(a.getId()<0)
	{
		throw new IllegalArgumentException();
	}
}



	@Test
	public void ifTheAccountNumberIsNotValid() throws InvalidAccountException
	{
		Account a=new Account(4);
		when(repo.findById(4)).thenReturn(a);
		assertEquals(a,repo.findById(4));
	}
		
		
		
	
}



















