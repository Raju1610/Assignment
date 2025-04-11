package org.sprac.cretio.crm.basics;

public class EmpGroups {
	
	public class EmpGroup extends Employees{
	}

	public static void main(String[] args) {
		
		Employees obj = new Employees();
		System.out.println("Name of the Employe:" + obj.name1);
		System.out.println("EmployID of the Employe:" + obj.EmpId1);
		System.out.println("Name of the Employe:" + obj.name2);
		System.out.println("EmployID of the Employe:" + obj.EmpId2);
		System.out.println("Name of the Employe:" + obj.name3);
		System.out.println("EmployID of the Employe:" + obj.EmpId3);
		
		

	}

}
