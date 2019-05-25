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
    Human Marta = new Human();
    Marta.setWiek(20);
    System.out.print(Marta.getAge());
  }
}


// you can add other public classes to this editor in any order
public class Human
{
  private int wiek;
  private float waga;
  private float wzrost;
  private String imie;
  private boolean plec;
  private int numerIndeksu;
  private int rozmiarStopy;
  
  public int getAge()
  {
    return wiek;
  }
  public float getWeight()
  {
    return waga;
  }

  public float getHeight()
  {
    return wzrost;
  }

  public String getName()
  {
    return imie;
  }

  public boolean isMale()
  {
    return plec;
  }
  
  public int getIndexNumber()
  {
    return numerIndeksu;
  }
    
  public int getFeetSize()
  {
    return rozmiarStopy;
  }
  
  public void setWiek( int sWiek )
  {
    wiek = sWiek;
  }
  public void setWaga( float sWaga )
  {
    waga = sWaga;
  }

  public void setWzrost( float sWzrost )
  {
    wzrost = sWzrost;
  }

  public void setImie( String sImie )
  {
    imie = sImie;
  }

  public void setPlec( boolean sPlec )
  {
    plec = sPlec;
  }
  
  public void setNumerIndeksu( int sNumerIndeksu )
  {
    numerIndeksu = sNumerIndeksu;
  }
    
  public void setRozmiarStopy( int sRozmiarStopy )
  {
    rozmiarStopy = sRozmiarStopy;
  }


}