class InSufficientBalanceException extends Exception{
	
}

 class Checker1 {


	public Amount withDraw(Amount a,double f)throws InSufficientBalanceException {
		
			
		
		if(a.getBalance()<f)
		{
			throw new InSufficientBalanceException();
		}
		else{
			double b=a.getBalance()-f;
			a.setBalance(b);
		return a;
		
		}
		
		
		}
}


