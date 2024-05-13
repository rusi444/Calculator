package main.com.example;

public class Point
{
    private double x;
    private double y;

    public double GetX()
    {
        return x;
    }

    public double GetY()
    {
        return y;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Point(double X, double Y)
    {
        this.x = X;
        this.y = Y;
    }

}
