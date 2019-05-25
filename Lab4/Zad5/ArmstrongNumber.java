// Marta Rosińska
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe trzy cyfrowa");
        int number = scanner.nextInt();
        int i = number;
        int[] t = new int[3];
        t[0] = i/100;
        i = i % 100;
        t[1] = i/10;
        t[2] = i%10;
        if((t[0]*t[0]*t[0])+(t[1]*t[1]*t[1])+(t[2]*t[2]*t[2])==number)
        {
            System.out.println("Liczba jest liczba armstronga");
        }
        else
        {
            System.out.println("Liczba nie jest liczba armstronga");
        }
    }
}
