// Marta Rosińska
public class Main {
    public static void main(String[] args)
    {
        MyPoint[] points = new MyPoint[10];
        for (int i=1; i<=10; i++)
        {
            points[i-1] = new MyPoint(i,i);
        }
    }
}
