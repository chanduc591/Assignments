package basics.assignments;

import java.util.*;

public class Assignment4_collections {

	public static void main(String[] args) {
	
       // 1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined
		
		
		List<Integer>area=new ArrayList<Integer>();
		
		area.add(12093);
		area.add(6993);
		area.add(5498);
		area.add(5083);
		area.add(4758);
		
	
		System.out.println("Print the total area of the 3rd and 4th cities combined : "+area.get(2)+  "   "  +area.get(3));
		
	
	
	// 2.Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		
		
		
		Set<String>visited=new HashSet<String>();
		
		    visited.add("Eiffel Tower");
		    visited.add("Great Wall of China");
		    visited.add("Statue of Liberty");
		    visited.add("Louvre Museum");
		    visited.add("Colosseum");
		    visited.add("Times Square");
		    visited.add("Disneyland");
		    visited.add("Machu Picchu");
		    visited.add("Burj Khalifa");
		    visited.add("Niagara Falls");
		    
		    System.out.println("Top 10 Tourist Attractions:");
		    
	        for (String attraction : visited) {
	        	
	            System.out.println("- " + attraction);
	        }

	        System.out.println("Total attractions: " + visited.size());
	        
	        
	        
	        
	        
	        
	        // 3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and  6th Value.
	  
	
	
	        int[] L1=  {15, 22, 7, 40, 55, 65, 10, 89, 33, 50};
	        
	        
	        
	        System.out.println("Average of 5th and 6th value will be :  "+(L1[4]+L1[5])/2);
	        
	        
	        
	        // 4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
	        
	        List<String> movies =new ArrayList<String>();
	        
	        movies.add("Avatar");
	        movies.add("Avengers: Endgame");
	        movies.add("Titanic");
	        movies.add("star Wars: The Force Awakens");
	        movies.add("Avengers: Infinity War");
	        
	        System.out.println("third highest grosser movie : "+movies.get(2));
	                

	        
	}		
		
		
		
		
	
	

}
