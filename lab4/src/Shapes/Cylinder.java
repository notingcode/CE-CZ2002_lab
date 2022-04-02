package Shapes;
public class Cylinder implements Shape{
    private double radius, height;

    public Cylinder(){
        this.radius = 1;
        this.height = 2;
    }

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getArea(){
        double length = 2 * Math.PI * radius;

        Circle c = new Circle(radius);
        Rectangle r = new Rectangle(length, height);

        return (2 * c.getArea()) + r.getArea();
    }
}
