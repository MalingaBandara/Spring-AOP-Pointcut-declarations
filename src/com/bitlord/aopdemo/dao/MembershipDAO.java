package com.bitlord.aopdemo.dao;

import org.springframework.stereotype.Component;


@Component
public class MembershipDAO {
	
	public boolean addSillyMember() {
		
		System.out.println( getClass() + ": DOING STUFF:  ADDING MEMBERSHIP ACOUNT " );
		
		return true;
		
	}
	
	public void goToSleep() {
		
		System.out.println( getClass() + ":  I'm going to sleep now... " );

		
	}
	

}
