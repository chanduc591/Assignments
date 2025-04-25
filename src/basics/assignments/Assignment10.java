package basics.assignments;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int[] L1= {12 ,34,11,36,87,98,93};
	
	int min=Integer.MAX_VALUE;
	
	int first=Integer.MIN_VALUE;
	
	int second=Integer.MIN_VALUE;
	
	int third=Integer.MIN_VALUE;
	
	
	for(int num:L1) {
		
		if(num<min) {
			
			min=num;
			
			
		}if(num>first) {
			
			third=second;
			second=first;
			first=num;
			
		}else if(num>second && num!=first) {
			
			third=second;
			
			second=num;
		}else if(num>third && num!=second) {
			
			third=num;
		}
		
		
	}
	System.out.println(first);
	System.out.println(second);
	System.out.println(third);
	System.out.println(min);
	

	}

}
