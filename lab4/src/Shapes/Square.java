package Shapes;
public class Square implements Shape{
    private double sideLength;

    public Square(){
        this.sideLength = 1;
    }

    public Square(double length){
        this.sideLength = length;
    }

    public double getArea(){
        return this.sideLength * this.sideLength;
    }
}
