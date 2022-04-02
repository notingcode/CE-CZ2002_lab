package Shapes;
public class Triangle implements Shape{
    protected double base;
    protected double height;

    public Triangle(){
        this.base = 1;
        this.height = 2;
    }

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        return 0.5 * this.base * this.height;
    }
}