package org.sprac.cretio.crm.basics;

public class Assignment2_Array {

	public static void main(String[] args) {

		        String[][][] semester = new String[5][6][2];

		        // Semester 1 Subjects and Marks
		        semester[0][0][0] = "Mathematics I";
		        semester[0][0][1] = "Pass(78)";
		        semester[0][1][0] = "Physics";
		        semester[0][1][1] = "Pass(85)";
		        semester[0][2][0] = "Chemistry";
		        semester[0][2][1] = "Fail(21)";
		        semester[0][3][0] = "Computer Programming";
		        semester[0][3][1] = "Pass(74)";
		        semester[0][4][0] = "Engineering Drawing";
		        semester[0][4][1] = "Pass(88)";
		        semester[0][5][0] = "Basic Electrical Engg";
		        semester[0][5][1] = "Pass(79)";

		        //  Semester 2
		        semester[1][0][0] = "Mathematics II";
		        semester[1][0][1] = "Pass(82)";
		        semester[1][1][0] = "Mechanics";
		        semester[1][1][1] = "Pass(77)";
		        semester[1][2][0] = "Environmental Sci.";
		        semester[1][2][1] = "Pass(93)";
		        semester[1][3][0] = "Basic Electronics";
		        semester[1][3][1] = "Fail(19)";
		        semester[1][4][0] = "Engineering Physics";
		        semester[1][4][1] = "Fail(24)";
		        semester[1][5][0] = "Engineering Graphics";
		        semester[1][5][1] = "Pass(90)";

		        //  Semester 3
		        semester[2][0][0] = "Data Structures";
		        semester[2][0][1] = "Pass(88)";
		        semester[2][1][0] = "Discrete Mathematics";
		        semester[2][1][1] = "Pass(81)";
		        semester[2][2][0] = "Digital Electronics";
		        semester[2][2][1] = "Pass(76)";
		        semester[2][3][0] = "Operating Systems";
		        semester[2][3][1] = "Fail(32)";
		        semester[2][4][0] = "Signals and Systems";
		        semester[2][4][1] = "Pass(85)";
		        semester[2][5][0] = "OOP in Java";
		        semester[2][5][1] = "Pass(78)";

		        //  Semester 4
		        semester[3][0][0] = "Algorithms";
		        semester[3][0][1] = "Pass(91)";
		        semester[3][1][0] = "Computer Networks";
		        semester[3][1][1] = "Pass(73)";
		        semester[3][2][0] = "Database Systems";
		        semester[3][2][1] = "Fail(19)";
		        semester[3][3][0] = "Microprocessors";
		        semester[3][3][1] = "Pass(80)";
		        semester[3][4][0] = "Communication Eng.";
		        semester[3][4][1] = "Pass(76)";
		        semester[3][5][0] = "Software Engineering";
		        semester[3][5][1] = "Pass(87)";

		        //  Semester 5
		        semester[4][0][0] = "Probability & Stats";
		        semester[4][0][1] = "Pass(86)";
		        semester[4][1][0] = "Machine Learning";
		        semester[4][1][1] = "Pass(88)";
		        semester[4][2][0] = "Compiler Design";
		        semester[4][2][1] = "Pass(84)";
		        semester[4][3][0] = "Theory of Computation";
		        semester[4][3][1] = "Pass(95)";
		        semester[4][4][0] = "Embedded Systems";
		        semester[4][4][1] = "Pass(73)";
		        semester[4][5][0] = "Computer Graphics";
		        semester[4][5][1] = "Pass(90)";


		        
		        System.out.println("Semester 2, Subject 4 Name: " + semester[1][3][0]);
		        System.out.println("Semester 2, Subject 5 Name: " + semester[1][4][0]);

		        System.out.println("Semester 4, Subject 3 Status: " + semester[3][2][1]);
		        System.out.println("Semester 4, Subject 6 Status: " + semester[3][5][1]);
		    }
		}


