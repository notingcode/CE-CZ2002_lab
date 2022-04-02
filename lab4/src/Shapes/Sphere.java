package Shapes;
public class Sphere extends Circle{
    public Sphere(){
        this.radius = 1;
    }

    public Sphere(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return 4 * super.getArea();
    }
}
