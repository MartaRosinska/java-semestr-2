// Marta Rosińska
public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle()
    {

    }
    public Rectangle(double width,double length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width,double length,String color,boolean filled)
    {
        super(color,filled);
        this.length = length;
        this.width = width;
    }
    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea()
    {
        return width*length;
    }
    public double getParimeter()
    {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString()+",lenght="+length+",width="+width;
    }
}











