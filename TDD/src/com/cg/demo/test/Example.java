package com.cg.demo.test;

public class Example {
public String even(int a)
{
	if (a==0)
		return "even";
	if(a==1)
		return "odd";
	if(a<0) 
		throw new IllegalArgumentException();
		return "exception";
		
}
}
