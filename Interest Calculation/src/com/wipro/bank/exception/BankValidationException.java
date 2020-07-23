package com.wipro.bank.exception;

public class BankValidationException extends Exception {
	public String toString() 
	{
		return "Invalid  Date";
	}
	public BankValidationException(String str)
	{
		super(str);
	}

}
