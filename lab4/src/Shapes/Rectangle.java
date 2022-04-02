package Shapes;
public class Rectangle implements Shape{
    private double length, breadth;

    public Rectangle(){
        this.length = 1;
        this.breadth = 2;
    }

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return length * breadth;
    }
}
