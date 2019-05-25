// Marta Rosińska
public class Square extends Rectangle{
    private double side;

    public Square() {

    }

    public Square(double side)
    {
        this.side = side;
    }
    public Square(double side,String color,boolean filled,double width, double length)
    {
        super(width,length,color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) { side = super.getWidth();
    }

    @Override
    public void setLength(double side) {
        side = super.getLength();
    }

    @Override
    public String toString() {
        return super.toString()+",side="+side;
    }
}
