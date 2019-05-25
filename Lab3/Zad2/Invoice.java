// Marta Rosińska
package com.marta.pracownicy;

class Invoice
{
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;

	public Invoice(String id, String desc, int qty, double unitPrice)
	{
		this.id = id;
		this.desc = desc;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public Invoice()
	{
		
	}
	public static void test()
	{
		Invoice X = new Invoice();
		X.setQty(25);
		System.out.println(X.getQty());
		X.setUnitPrice(50);
		System.out.println(X.getUnitPrice());
	}
	public String getID()
	{
		return id;
	}
	public String getDesc()
	{
		return desc;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty (int sQty)
	{
		qty = sQty;
	}
	public double getUnitPrice()
	{
		return unitPrice;
	}
	public void setUnitPrice (double sunitPrice)
	{
		unitPrice = sunitPrice;
	}
	public double getTotal()
	{
		return unitPrice * qty;
	}
	public String toString()
	{
		return "Invoice[id="+id+",desc="+desc+",gty"+qty+",unitPrice="+unitPrice+"]";
	}
}
