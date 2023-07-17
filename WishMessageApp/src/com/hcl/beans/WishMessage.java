package com.hcl.beans;

import java.util.Date;

public class WishMessage {

	private Date date;

	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public String Wish(String user)
	{
		int hour=date.getHours();
		
		if(hour<=12)
		{
			return "Good Morning"+user;
					
		}else if(hour<=16)
		{
			return "Good Afternoon"+user;
		}else if(hour<=20)
			return "Good Night"+user;
		else
			throw new IllegalArgumentException(); 
		
	}
	
}
