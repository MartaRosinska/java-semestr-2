/******************************************************************************
Autor:
Adrian Witkowski	s19439
Marta Rosinska    s18874
 ******************************************************************************/

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Trojkat myObject = new Trojkat(7,7,7);
    myObject.Obwod();
    myObject.Pole();
    myObject.isEquilateral();
    myObject.isIsosceles();
    myObject.isScalene();
    //myObject.Przekatna();
  }
}

// you can add other public classes to this editor in any order
public class Trojkat
{
  private int a;
  private int b;
  private int c;
  
  public Trojkat(int ua , int ub, int uc )
  {
    a = ua;
    b = ub;
    c = uc;
  }
  
  
  public void Obwod()
  {
  	int obwod = a+b+c;
    System.out.print("Obwod: ");
    System.out.println(obwod);
  }
  
  public void Pole()
  {
    double obwod = a+b+c;
    double p = obwod/2;
  	double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    System.out.print("Pole: ");
    System.out.println(pole);
  }
  
  public void isEquilateral()
  {
    if( a == b && a == c && c == b ) System.out.println("Jest rownoboczny");
    else
      System.out.println("Nie jest rownoboczny");
	
  }
  
  public void isIsosceles()
  {
    if( (a == b ) || (a == c) ||(c == b ) ) System.out.println("Jest rownoramienny");
    else
      System.out.println("Nie jest rownoramienny");
	
  }  
  
  public void isScalene()
  {
    if( (a != b ) && (a != c) &&(c != b ) ) System.out.println("Jest roznoramienny");
    else
      System.out.println("Nie jest roznoramienny");
	
  }  
  
  
  /*
  public void Przekatna()
  {
  	double przekatna = Math.sqrt((dlugosc*dlugosc) + (szerokosc*szerokosc));
    System.out.print("Przekatna: ");
    System.out.println(przekatna);
  }
  */
  
}