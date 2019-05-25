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
    Cezar myObject = new Cezar();
    myObject.Szyfruj("Marta");
	myObject.Szyfruj("Rosinska");
	myObject.Szyfruj("Adrian");
	myObject.Szyfruj("Witkowski");
    //myObject.Przekatna();
  }
}

// you can add other public classes to this editor in any order
public class Cezar
{
  private String slowo;
  
  
  public void Szyfruj(String sSlowo )
  {
  	String szyfr = "";
    for(int i=0; i<sSlowo.length(); i++)
    {
      char znak = sSlowo.charAt(i);
      znak+=3;
      szyfr+=znak;
    }
    
    System.out.print("Po zaszyfrowaniu: ");
    System.out.println(szyfr);
  }

  
}