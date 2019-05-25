// Marta Rosińska
package com.marta.pracownicy;

class Account
{
	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name)
	{
		this.id = id;
		this.name = name;
		this.balance = 0;
	}

	public static void test()
	{
		Account X = new Account("999", "Marta");

	}
	public String getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getBalance()
	{
		return balance;
	}
	public int credit (int amount)
	{
		balance = amount + balance;
		return balance;
	}
	public int debit(int amount)
	{
		if (amount<=balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public int transferTo(Account another, int amount)
	{
		if(amount<=balance)
		{
			balance = balance - amount;
			another.credit(amount);
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}	
	public String toString()
	{
		return "Account[id="+id+",name="+name+",balance="+balance+"]";
	}
}
