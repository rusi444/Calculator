package main.com.example;

public class Otrezok
{
    double x;
    private Point startPoint;
    private Point endPoint;

    public Otrezok(Point startPoint, Point endPoint)
    {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength()
    {
        double xDiff = endPoint.GetX() - startPoint.GetY();
        double yDiff = endPoint.GetY() - startPoint.GetX();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
