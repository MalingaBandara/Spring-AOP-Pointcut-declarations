package com.bitlord.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.bitlord.aopdemo.Account;


@Component
public class AccountDAO {
	
	public void addAccount( Account theAccount, boolean vipFlag ) {
		
		System.out.println( getClass() + ": DOING MY DB  WORK: ADDING AN ACCOUNT" );
		
	}

	public boolean doWork() {
		
		System.out.println( getClass() + ":  doWork()" );
		return false;
		
	}
	
}
