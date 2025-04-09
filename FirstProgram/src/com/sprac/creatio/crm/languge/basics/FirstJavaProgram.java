package com.sprac.creatio.crm.languge.basics;

public class FirstJavaProgram {

	public static void main(String[] args) {
		System.out.println("Hello, world!!!");
		System.out.println("This is my First Program!");
		System.out.println("I am Entered to the Automation Testing World!!!");

		// print the content and then go to the next line
		System.out.println("Hello world");
		System.out.println("!!!");

		// print the content and then stay on same line
		System.out.print("Hellow");
		System.out.print("World");
		System.out.println("");

		// print the formate content and then stay on same line
		System.out.printf("%s is completed Btech, empId is %d and visa status is %b", "raj", 1234, true);
		System.out.println();

		// Format the digits and then prient the formated content and then stay on same
		// line
		System.out.format("Total Bill is %.2f %n", 100.98668969);
		System.out.println();

		// Join multiple print statements together
		System.out.append("My name is Raj").append("My empId is 12345");
		System.out.println();

	}

}
