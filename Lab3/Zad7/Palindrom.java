//*******************************************************************
// Marta Rosińska 18874
//*******************************************************************
import java.util.Scanner;
public class Palindrom
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekst = sc.nextLine();
        int dlugosc = tekst.length();

        int jj = 0;
        int j = (dlugosc - 1);
        for (int i = 0; i < dlugosc; i++)
        {
            if (tekst.charAt(i) != tekst.charAt(j))
            {
                jj = 1;
                break;
            }
            j--;
        }
        if(jj==1)
            System.out.println("Podany tekst nie jest palindromem");
        else
        {
            System.out.println("Podany tekst jest palindromem");
        }
    }
}
