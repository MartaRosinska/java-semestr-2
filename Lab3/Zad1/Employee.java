// Marta Rosińska
package com.marta.pracownicy;

public class Employee
{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private Date date;

	public Employee(int id, String firstName, String lastName, int salary, Date date)
	{
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.date = date;
	}

	public static void test()
	{
		Employee X = new Employee(1, "Marta", "Rosińska", 1000, new Date(4,4,2019));
		X.setSalary(2000);
		System.out.println(X.getSalary());

	}
	public int getID()
	{
		return id;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getName()
	{
		return firstName + " " + lastName;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary(int sSalary)
	{
		salary = sSalary;
	}
	public int getAnnualSalary()
	{
		return salary * 12;
	}
	public int raiseSalary( int percent )
	{
		double floatPercent = percent;
		salary = (int) (salary + (salary * floatPercent / 100.0));
		return salary;
	}
	public String toString()
	{
	return "Employee["+id+",name="+getName()+",salary="+salary+"]";
	}
}
