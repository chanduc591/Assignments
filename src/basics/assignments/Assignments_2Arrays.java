package basics.assignments;

public class Assignments_2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 3D array to represent the following data: 1 Semesters as the first
		 * dimension. 2 Subjects and Status/Marks as the second dimension. 3 Actual
		 * values for Subject Names and Marks as the third dimension.
		 */

		String[][][] students = new String[5][6][6];

		// Semister1

		students[0][0][0] = "Mathematics I";
		students[0][1][0] = "Physics";
		students[0][2][0] = "Chemistry";
		students[0][3][0] = "Computer Programming";
		students[0][4][0] = "Engineering Drawing";
		students[0][5][0] = "Basic Electrical Eng.";

		students[0][0][1] = "Pass(78)";
		students[0][1][1] = "Pass(85)";
		students[0][2][1] = "Fail(21)";
		students[0][3][1] = "Pass(74)";
		students[0][4][1] = "Pass(88)";
		students[0][5][1] = "Pass(79)";

		// semister2

		students[1][0][0] = "Mathematics II";
		students[1][1][0] = "Mechanics";
		students[1][2][0] = "Environmental Science";
		students[1][3][0] = "Basic Electronics";
		students[1][4][0] = "Engineering Physics";
		students[1][5][0] = "Engineering Graphics";

		students[1][0][1] = "Pass(82)";
		students[1][1][1] = "Pass(77)";
		students[1][2][1] = "Pass(93)";
		students[1][3][1] = "Fail(19)";
		students[1][4][1] = "Fail(24)";
		students[1][5][1] = "Pass(90)";

		// semister3

		students[2][0][0] = "Data Structures";
		students[2][1][0] = "Discrete Mathematics";
		students[2][2][0] = "Digital Electronics";
		students[2][3][0] = "Operating Systems";
		students[2][4][0] = "Signals and Systems";
		students[2][5][0] = "Object-Oriented Prog.";

		students[2][0][1] = "Pass(88)";
		students[2][1][1] = "Pass(81)";
		students[2][2][1] = "Pass(76)";
		students[2][3][1] = "Fail(32)";
		students[2][4][1] = "Pass(85)";
		students[2][5][1] = "Pass(78)";

		// Semester 4
		students[3][0][0] = "Algorithms";
		students[3][1][0] = "Computer Networks";
		students[3][2][0] = "Database Systems";
		students[3][3][0] = "Microprocessors";
		students[3][4][0] = "Communication Eng.";
		students[3][5][0] = "Software Engineering";

		students[3][0][1] = "Pass(91)";
		students[3][1][1] = "Pass(73)";
		students[3][2][1] = "Fail(19)";
		students[3][3][1] = "Pass(80)";
		students[3][4][1] = "Pass(76)";
		students[3][5][1] = "Pass(87)";

		// Semester 5
		students[4][0][0] = "Probability & Stats";
		students[4][1][0] = "Machine Learning";
		students[4][2][0] = "Compiler Design";
		students[4][3][0] = "Theory of Computation";
		students[4][4][0] = "Embedded Systems";
		students[4][5][0] = "Computer Graphics";

		students[4][0][1] = "Pass(86)";
		students[4][1][1] = "Pass(88)";
		students[4][2][1] = "Pass(84)";
		students[4][3][1] = "Pass(95)";
		students[4][4][1] = "Pass(73)";
		students[4][5][1] = "Pass(90)";
		
		
		
		
		
		
		 String[][][] data = 
			 
			 {
		            {   // Semester 1
		                {"Mathematics I", "Pass(78)"},
		                {"Physics", "Pass(85)"},
		                {"Chemistry", "Fail(21)"},
		                {"Computer Programming", "Pass(74)"},
		                {"Engineering Drawing", "Pass(88)"},
		                {"Basic Electrical Eng.", "Pass(79)"}
		            },
		            
		            
		            {   // Semester 2
		                {"Mathematics II", "Pass(82)"},
		                {"Mechanics", "Pass(77)"},
		                {"Environmental Sci.", "Pass(93)"},
		                {"Basic Electronics", "Fail(19)"},
		                {"Engineering Physics", "Fail(24)"},
		                {"Engineering Graphics", "Pass(90)"}
		            },
		            
		            
		            {   // Semester 3
		                {"Data Structures", "Pass(88)"},
		                {"Discrete Mathematics", "Pass(81)"},
		                {"Digital Electronics", "Pass(76)"},
		                {"Operating Systems", "Fail(32)"},
		                {"Signals and Systems", "Pass(85)"},
		                {"Object-Oriented Prog.", "Pass(78)"}
		            },
		            {   // Semester 4
		                {"Algorithms", "Pass(91)"},
		                {"Computer Networks", "Pass(73)"},
		                {"Database Systems", "Fail(19)"},
		                {"Microprocessors", "Pass(80)"},
		                {"Communication Eng.", "Pass(76)"},
		                {"Software Engineering", "Pass(87)"}
		            },
		            
		            {   // Semester 5
		                {"Probability & Stats", "Pass(86)"},
		                {"Machine Learning", "Pass(88)"},
		                {"Compiler Design", "Pass(84)"},
		                {"Theory of Computation", "Pass(95)"},
		                {"Embedded Systems", "Pass(73)"},
		                {"Computer Graphics", "Pass(90)"}
		            }
		            
		        };

		
		
		//output
		 
		 
		 
			// Task Outputs:
			System.out.println("Semester 2, Subject 4 Name: " + data[1][3][0]);
			System.out.println("Semester 2, Subject 5 Name: " + data[1][4][0]);

			System.out.println("Semester 4, Subject 3 Marks: " + data[3][2][1]);
			System.out.println("Semester 4, Subject 6 Marks: " + data[3][5][1]);
		
		
		
		
			
			System.out.println();
			System.out.println();
			
			

		// output

		System.out.println(
				"Print Semester 2 Subject 4 and Subject 5 names :" + students[1][3][0] + " , " + students[1][4][0]);
		System.out.println("Print the Status/Marks of Semester 4 Subject 3 and Subject 6.:" + students[3][2][1] + " , "
				+ students[3][5][1]);

		System.out.println();
		System.out.println();

		// output in other way

		// Task Outputs:
		System.out.println("Semester 2, Subject 4 Name: " + students[1][3][0]);
		System.out.println("Semester 2, Subject 5 Name: " + students[1][4][0]);

		System.out.println("Semester 4, Subject 3 Marks: " + students[3][2][1]);
		System.out.println("Semester 4, Subject 6 Marks: " + students[3][5][1]);

	}

}
