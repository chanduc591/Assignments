package basics.assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment5_MapCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/****************
	 * 
	 * Inside this Excel There are 3 TestCases with each Test case having 3 rows of data. Now, Create Map<String,
Map<String,String>> to store all the data and Print the data from Product details > Supplier Name > Office Depot from
the Map<String, Map<String,String>>

*
*
*
*
*/
		
		//Student  details maintained in a Maps
		
Map<String,String>student1=new HashMap<String ,String>();
		
student1.put("Name", "John Doe");
student1.put("Age", "20");
student1.put("Gender", "Male");
student1.put("Roll Number", "S12345");
student1.put("Grade", "A");
student1.put("Major", "Computer Science");
student1.put("GPA", "3.8");
student1.put("Email", "john@example.com");
student1.put("Contact Number", "9876543210");
student1.put("Address", "123 Elm St");


Map<String,String>student2=new HashMap<String ,String>();

student2.put("Name", "Jane Smith");
student2.put("Age", "21");
student2.put("Gender", "Female");
student2.put("Roll Number", "S12346");
student2.put("Grade", "B");
student2.put("Major", "Mathematics");
student2.put("GPA", "3.5");
student2.put("Email", "jane@example.com");
student2.put("Contact Number", "9876543211");
student2.put("Address", "456 Elm St");


Map<String,String>student3=new HashMap<String ,String>();

student3.put("Name", "Mike Brown");
student3.put("Age", "22");
student3.put("Gender", "Male");
student3.put("Roll Number", "S12347");
student3.put("Grade", "A");
student3.put("Major", "Physics");
student3.put("GPA", "3.9");
student3.put("Email", "mike@example.com");
student3.put("Contact Number", "9876543212");
student3.put("Address", "789 Elm St");



	

Map<String,Map<String,String>> table1=new HashMap<String,Map<String,String>>();

table1.put("st1",student1);
table1.put("st2",student2);
table1.put("st3",student3);


//System.out.println("table1"+table1.get("st2"));

/*
 



*/


//Student  details maintained in a Maps

Map<String,String>employee1=new HashMap<String ,String>();

employee1.put("Employee ID", "E001");
employee1.put("Name", "Alice Green0");
employee1.put("Age", "30");
employee1.put("Gender", "Female");
employee1.put("Department", "Engineering");
employee1.put("Position", "software");
employee1.put("Salary", "75,000");
employee1.put("Email", "alice@example.com");
employee1.put("Contact Number", "9876543213");



Map<String,String>employee2=new HashMap<String ,String>();

employee2.put("Employee ID", "E002");
employee2.put("Name", "Bob Johnson");
employee2.put("Age", "35");
employee2.put("Gender", "Male");
employee2.put("Department", "Marketing");
employee2.put("Position", "Marketing");
employee2.put("Salary", "85,000");
employee2.put("Email", "bob@example.com");
employee2.put("Contact Number", "9876543214");



Map<String,String>employee3=new HashMap<String ,String>();

employee3.put("Employee ID", "E003");
employee3.put("Name", "Carol White");
employee3.put("Age", "28");
employee3.put("Gender", "Female");
employee3.put("Department", "Sales");
employee3.put("Position", "Sales Executive");
employee3.put("Salary", "65,000");
employee3.put("Email", "carol@example.com");
employee3.put("Contact Number", "9876543215");

		

Map<String,Map<String,String>> table2=new HashMap<String,Map<String,String>>();

table2.put("emp1",employee1);
table2.put("emp2",employee2);
table2.put("emp3",employee3);


//System.out.println("table2"+table2.get("emp2"));


//Product details


//Student  details maintained in a Maps

Map<String,String>product1=new HashMap<String ,String>();

product1.put("Product ID", "P001");
product1.put("Name", "Laptop");
product1.put("Category", "Electronics");
product1.put("Price", "1,200$");
product1.put("Stock Queue", "50");
product1.put("Supplier", "Tech Supplies");
product1.put("Warrenty", "2 years");
product1.put("Rating", "4.5");
product1.put("Manufacturing Date", "15/01/2023");
product1.put("Expiry Date", "15/01/2025");



Map<String,String>product2=new HashMap<String ,String>();


product2.put("Product ID", "P002");
product2.put("Name", "Desk Chair");
product2.put("Category", "Furniture");
product2.put("Price", "150$");
product2.put("Stock Queue", "100");
product2.put("Supplier", "office Depot");
product2.put("Warrenty", "1 year");
product2.put("Rating", "4");
product2.put("Manufacturing Date", "10/02/2023");
product2.put("Expiry Date", "NA");
		



Map<String,String>product3=new HashMap<String ,String>();

product3.put("Product ID", "P003");
product3.put("Name", "Coffee Maker");
product3.put("Category", "Kitchen");
product3.put("Price", "75$");
product3.put("Stock Queue", "200");
product3.put("Supplier", "Kitchen World");
product3.put("Warrenty", "6 months");
product3.put("Rating", "4.2");
product3.put("Manufacturing Date", "20/03/2023");
product3.put("Expiry Date", "20/03/2024");
		

Map<String,Map<String,String>> table3=new HashMap<String,Map<String,String>>();

table3.put("prod1",product1);
table3.put("prod2",product2);
table3.put("prod3",product3);


System.out.println("Print the data from Product details > Supplier Name > will be :  "+table3.get("prod2").getOrDefault("Supplier",""));


















	}

}