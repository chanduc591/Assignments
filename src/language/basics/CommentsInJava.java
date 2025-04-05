package language.basics;

public class CommentsInJava {
	
	
	public static void main(String[] args) {
		
		
		add(5, 6);
		
	
		
		System.out.println("Facorial of "+calculateFactorial(6)); 
		
		System.out.println("divide : "+divide(20, 2)); 
		
		
		
	}
	
		// Calculate the sum of a and b
		       
		public static void add(int a,int b) {
			
			
			 int sum = a + b; 
			 
		System.out.println("sum of two numbers : "+sum);  
		}
				
				/*
				* This method calculates the factorial of a number. The result is stored in the
				* variable 'factorial'.
				*/
				public static int calculateFactorial(int number) {
					
					
				int factorial =1;
				for (int i = 1; i <= number; i++) {
				factorial *= i;
				}
				return factorial;
				}
				
				/**
				* Divides two numbers.
				* @param numerator The numerator.
				* @param denominator The denominator (must not be zero).
				* @return The result of the division.
				* @throws ArithmeticException If the denominator is zero.
				*/
				public static double divide(double numerator, double denominator) throws ArithmeticException {
				if (denominator == 0) {
				throw new ArithmeticException("Cannot divide by zero.");
				}
				return numerator / denominator;
				
	
	}
	

}
