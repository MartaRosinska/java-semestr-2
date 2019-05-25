// Marta Rosińska
package com.marta.pracownicy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Employee.test();
        Invoice.test();
        Account.test();
        Date.test();
        Time.test();
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"Marta","Rosinska",2500,new Date(4,1,2019)));
		employees.add(new Employee(2,"Jakub","Bubkowski",3300,new Date(12,3,2011)));
		employees.add(new Employee(3,"Darek","Lubkowski",4500,new Date(31,6,2012)));
		employees.add(new Employee(4,"Ania","Gubkowska",5000,new Date(23,9,2009)));
		employees.add(new Employee(5,"Mariusz","Dubkowski",2000,new Date(14,11,2010)));
		employees.add(new Employee(6,"Konrad","Rutkowski",4000,new Date(26,2,2013)));
		employees.add(new Employee(7,"Marlena","Orlik",3500,new Date(26,4,2010)));
		employees.add(new Employee(8,"Kasia","Kot",3000,new Date(4,12,2008)));
		
		System.out.println(employees.toString());
    }
}
