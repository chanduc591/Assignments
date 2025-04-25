package basics.assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment9 {
	
	    String name;
	    double baseSalary;
	    double experience;
	    double rating;
	
	
	public static void main(String[] args) {
		

Map<String,String>EmployeeTable1=new HashMap<String ,String>();
		
		EmployeeTable1.put("Name", "AliceJohnson");
		EmployeeTable1.put("BaseSalary", "75000.0");
		EmployeeTable1.put("Experience", "5.1");
		EmployeeTable1.put("Rating", "4.2");
		
		Map<String,String>EmployeeTable2=new HashMap<String ,String>();
		
		EmployeeTable2.put("Name", "Bob Smith");
		EmployeeTable2.put("BaseSalary", "68000.0");
		EmployeeTable2.put("Experience", "3.2");
		EmployeeTable2.put("Rating", "3.8");
		
		Map<String,String>EmployeeTable3=new HashMap<String ,String>();
		
		EmployeeTable3.put("Name", "Carol Davis");
		EmployeeTable3.put("BaseSalary", "82000.0");
		EmployeeTable3.put("Experience", "7.1");
		EmployeeTable3.put("Rating", "2.5");
		
		Map<String,String>EmployeeTable4=new HashMap<String ,String>();
		
		EmployeeTable4.put("Name", "David Brown");
		EmployeeTable4.put("BaseSalary", "90000.0");
		EmployeeTable4.put("Experience", "10.2");
		EmployeeTable4.put("Rating", "4.5");
		
		Map<String,String>EmployeeTable5=new HashMap<String ,String>();
		
		
		EmployeeTable5.put("Name", "Eva Green");
		EmployeeTable5.put("BaseSalary", "60000.0");
		EmployeeTable5.put("Experience", "2.4");
		EmployeeTable5.put("Rating", "3.5");
		
		
		
		Map<String,Map<String,String>> empdate=new HashMap<String,Map<String,String>>()	;	
		
		empdate.put("emp1", EmployeeTable1);
		empdate.put("emp2", EmployeeTable2);
		empdate.put("emp3", EmployeeTable3);
		empdate.put("emp4", EmployeeTable4);
		empdate.put("emp5", EmployeeTable5);
		
		
		Map<String,Double>hikepercentage=new HashMap<String ,Double>();
		
		
		
		for(Map<String ,String> percent:empdate.values()) {
			
			
			String name= percent.get("Name");
			
			double baseSalary =Double.parseDouble(percent.get("BaseSalary"));
			
			double experience=Double.parseDouble(percent.get("Experience"));
			
		    double rating=Double.parseDouble(percent.get("Rating"));
			
		
		    
		    
		    double variablePay = 0.0;
		    
		    double bonus = 0.0;
		    
		    double reward = (experience >= 5.0) ? 5000 : 0;

		    
		    
		    
		 // Determine variable pay and bonus based on rating
		    if (rating >= 4.0) {
		        variablePay = 15.0;
		        bonus = 1500;
		    } else if (rating >= 3.0) {
		        variablePay = 10.0;
		        bonus = 1200;
		    } else {
		        variablePay = 3.0;
		        bonus = 300;
		    }

			
		    double hikeAmount = (baseSalary * variablePay / 100.0) + bonus + reward;
		    double hikePercentage = (hikeAmount / baseSalary) * 100.0;

		    // Store result
		    hikepercentage.put(name, hikePercentage);
			
		}
		
		
		
		
		for (Map.Entry<String, Double> entry : hikepercentage.entrySet()) {
		    System.out.println(entry.getKey() + " -> " + String.format("%.2f", entry.getValue()) + "%");
		}
		
		
		
	}
	

}
