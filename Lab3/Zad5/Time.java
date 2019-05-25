// Marta Rosińska
package com.marta.pracownicy;

public class Time
{
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time()
	{
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	public static void test()
	{
		Time X = new Time();
		X.setHour(22);
		System.out.println(X.getHour());
		X.setMinute(23);
		System.out.println(X.getMinute());
		X.setSecond(24);
		System.out.println(X.getSecond());
	}
	public int getHour()
	{
		return hour;
	}
	public int getMinute()
	{
		return minute;
	}
	public int getSecond()
	{
		return second;
	}
	public void setHour(int sHour)
	{
		hour = sHour;
	}
	public void setMinute(int sMinute)
	{
		minute = sMinute;
	}
	public void setSecond(int SSecond)
	{
		second = SSecond;
	}
	public void setTime(int sHour, int sMinute, int sSecond)
	{
		hour = sHour;
		minute = sMinute;
		second = sSecond;
	}
	public String toString()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	public Time nextSecond()
	{
		second ++;
		if(second == 60)
		{
			second = 0;
			minute ++;
			if(minute == 60)
			{
				minute = 0;
				hour ++;
			}
		}
		return this;
	}
	public Time previousSecond()
	{
		second --;
		if(second == 0)
		{
			second = 59;
			minute --;
			if(minute == 0)
			{
				minute = 59;
				hour --;
			}
		}
		return this;
	}
}
