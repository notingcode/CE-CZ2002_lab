package Shapes;
public class Cone implements Shape{
    private double radius, height;

    public Cone(){
        this.radius = 1;
        this.height = 2;
    }

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getArea(){
        double slantLength = Math.sqrt((height * height) + (radius * radius));
        double ratio = radius / slantLength;

        Circle small = new Circle(this.radius);
        Circle large = new Circle(slantLength);

        return small.getArea() + (large.getArea() * ratio);
    }
}
