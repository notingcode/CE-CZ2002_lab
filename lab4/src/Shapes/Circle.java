package Shapes;

import java.lang.Math;

public class Circle implements Shape{
    protected double radius;

    public Circle(){
        this.radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }
}