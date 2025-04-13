package basics.assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignments3_EmpGroups extends Assignments3_Employees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignments3_EmpGroups emp = new Assignments3_EmpGroups();
		

		for (int i = 0; i < emp.Employee_Names.length; i++) {
			
			
            System.out.println("Employee Name: " + emp.Employee_Names[i] + ", Employee ID: " + emp.Employee_IDs[i]);
        }
		
		
		
		System.out.println();
		System.out.println();
		
		
        System.out.println("Employee Name: " + emp.Employee_Names[0] + ", Employee ID: " + emp.Employee_IDs[0]);
        System.out.println("Employee Name: " + emp.Employee_Names[1] + ", Employee ID: " + emp.Employee_IDs[1]);
        System.out.println("Employee Name: " + emp.Employee_Names[2] + ", Employee ID: " + emp.Employee_IDs[2]);

        
        List<Integer>li=new ArrayList<Integer>();
        li.add(567);
        li.add(567);
        li.add(567);     li.add(567);     li.add(567);
   
        System.out.println(li);

	}

}
