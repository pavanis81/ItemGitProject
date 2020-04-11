package com.example.ShopWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

	
	
	@RequestMapping("/find")
	  public String  findItemByMaxAndMin(int min,int max)
	   {
		   
		   //This is where we go to DB and find all items using
		   
		   // select * from item where price between (min,max);
		
		
		DataBaseUtility db = new DataBaseUtility();
		
		db.connect();
		
		String query ="select * from item where cost between "+min+" and "+max;
		
		db.getAllItems(query).forEach(item->System.out.println(item.name));
		
		db.closeConnection();
		
		
		return "result.html";
	   }
	
	
}
