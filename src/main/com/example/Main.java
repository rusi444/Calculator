package main.com.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args)
    {
        Point startPoint = new Point(1,1);
        Point endPoint = new Point(10,12);

        Otrezok segment = new Otrezok(startPoint, endPoint);

        double length = segment.calculateLength();
        System.out.println("Длина отрезка составляет " + length);
    }
}