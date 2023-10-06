package com.hcl.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessage {
	
	@Autowired
	private LocalDateTime ltd;
	
	public String message(String user)
	{
		int hour=ltd.getHour();
		
		if(hour<12)
		{
			return "Good Morning:+"+user;
		}
		else if(hour<16)
		{
			return "Good Afternoon:+"+user;
		}
		else if(hour<20)
		{
			return "Good Evening:+"+user;
		}
		else
		{
			return "Good Night+"+user;
		}
	}
	
	
	
	

}
