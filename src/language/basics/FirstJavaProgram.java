package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;


public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		/******** Advantages of print statements  *************/
		
		//Debugging and error detection
		//Monitor and Program execution
		//Testing and validation
		//Logging System
		
		
		//print and go to next line
	  System.out.println("Hello,World!");
	  
	  
	//print and stay on same line
	  System.out.print("Hello ");
	  System.out.print("World ");
	  
	  //print the formatted content and stay on same line
	  System.out.printf("Bala is completed the B.tech,Bala employee id is 1234,Bala visa status is true");
	  
	  System.out.println();

	  System.out.printf("%s is completed the B.tech,employee id is %d,visa status is %b","chandra",1236,false);

	  System.out.println();
	  
	  //Formatted 

	  System.out.format("");
	  
	  // Concatenating the words to single 
	  
	  System.out.append("chandra").append("sekhar");
	  
	  System.out.println();
	  
	  //print the ASCI value
	  
	  System.out.write(65);
	  
	  System.out.println();
	  
	 //logger data into console
	 Logger log= Logger.getLogger("MyLogger");
	 
	 log.info("My cuurent line is 44");
	 
	 log.warning("please check the libraries are installed");
	 
	 //print the error statement
	 
	 System.err.println("ERROR: Expected result is not matching with expected result");
	 
	 //print data in Note pad
	 
	 PrintWriter write=new PrintWriter("C:\\AutomationTraining\\AutomationProject\\Log.txt");
	
	 write.println(LocalDateTime.now()+"Currently Line 54 is running");
	 write.println(LocalDateTime.now()+"Currently Line 55 is running");
	 write.println(LocalDateTime.now()+"Execution is compled");
	 
	 write.close();
	 
	 
	 
	  
	  
	}

}
