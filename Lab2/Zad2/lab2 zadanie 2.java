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
    Prostokat myObject = new Prostokat(4,5);
    myObject.Obwod();
    myObject.Pole();
    myObject.Przekatna();
  }
}

// you can add other public classes to this editor in any order
public class Prostokat
{
  private int dlugosc;
  private int szerokosc;
  
  public Prostokat(int a , int b )
  {
    dlugosc = a;
    szerokosc = b;
  }
  
  
  public void Obwod()
  {
  	int obwod = (dlugosc+szerokosc)*2;
    System.out.print("Obwod: ");
    System.out.println(obwod);
  }
  
  public void Pole()
  {
  	int pole = dlugosc*szerokosc;
    System.out.print("Pole: ");
    System.out.println(pole);
  }
  
  public void Przekatna()
  {
  	double przekatna = Math.sqrt((dlugosc*dlugosc) + (szerokosc*szerokosc));
    System.out.print("Przekatna: ");
    System.out.println(przekatna);
  }
  
  
}