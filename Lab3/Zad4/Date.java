// Marta Rosińska
package com.marta.pracownicy;

public class Date
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public Date()
	{
		
	}

	public static void test()
	{
		Date X = new Date();
		X.setDay(5);
		System.out.println(X.getDay());
		X.setMonth(1);
		System.out.println(X.getMonth());
		X.setYear(2015);
		System.out.println(X.getYear());
	}
	public int getDay()
	{
		return day;
	}
	public int getMonth()
	{
		return month;
	}
	public int getYear()
	{
		return year;
	}
	public void setDay(int sDay)
	{
		day = sDay;
	}
	public void setMonth(int sMonth)
	{
		month = sMonth;
	}
	public void setYear(int sYear)
	{
		year = sYear;
	}
	public void setDate(int sDay, int sMonth, int sYear)
	{
		day = sDay;
		month = sMonth;
		year = sYear;
	}
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
}
