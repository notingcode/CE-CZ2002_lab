package Shapes;

public class Cubiod implements Shape{
    private double length, breadth, height;

    public Cubiod(){
        this.length = 2;
        this.breadth = 3;
        this.height = 1;
    }

    public Cubiod(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getArea(){
        Rectangle side1 = new Rectangle(length, breadth);
        Rectangle side2 = new Rectangle(breadth, height);
        Rectangle side3 = new Rectangle(length, height);

        return 2 * (side1.getArea() + side2.getArea() + side3.getArea());
    }
}
