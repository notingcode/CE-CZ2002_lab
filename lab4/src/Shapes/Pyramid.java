package Shapes;
public class Pyramid implements Shape{
    private double base, height;

    public Pyramid(){
        this.base = 1;
        this.height = 2;
    }

    public Pyramid(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getArea(){
        double slantLength = Math.sqrt(height * height + (base * base)/4);

        Square s = new Square(base);
        Triangle t = new Triangle(base, slantLength);

        return s.getArea() + (4 * t.getArea());
    }
}
