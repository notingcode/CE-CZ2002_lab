import Shapes.*;
import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNum;
        int selection;
        double length, breadth, height, radius, totalArea;

        System.out.print("Enter total number shapes: ");
        inputNum = sc.nextInt();

        Shape[] shapes = new Shape[inputNum];

        for(int i=0; i < inputNum; i++){
            printShapeOptions(i);
            selection = sc.nextInt();

            switch(selection){
                case 1:
                    System.out.print("Radius: ");
                    radius = sc.nextDouble();
                    shapes[i] = new Sphere(radius);
                    break;
                case 2:
                    System.out.print("Height: ");
                    height = sc.nextDouble();
                    System.out.print("Base: ");
                    length = sc.nextDouble();
                    shapes[i] = new Pyramid(length, height);
                    break;
                case 3:
                    System.out.print("Length: ");
                    length = sc.nextDouble();
                    System.out.print("Breadth: ");
                    breadth = sc.nextDouble();
                    System.out.print("Height: ");
                    height = sc.nextDouble();
                    shapes[i] = new Cubiod(length, breadth, height);
                    break;
                case 4:
                    System.out.print("Height: ");
                    height = sc.nextDouble();
                    System.out.print("Radius: ");
                    radius = sc.nextDouble();
                    shapes[i] = new Cone(radius, height);
                    break;
                case 5:
                    System.out.print("Height: ");
                    height = sc.nextDouble();
                    System.out.print("Radius: ");
                    radius = sc.nextDouble();
                    shapes[i] = new Cylinder(radius, height);
                    break;
                default:
                    System.out.println("Invalid Choice! Enter Again");
                    i -= 1;
                    break;
            }
        }

        totalArea = 0;

        for(int i=0; i < inputNum; i++){
            totalArea += shapes[i].getArea();
        }

        System.out.printf("Total Area is %.2f\n", totalArea);

        sc.close();
    }

    public static void printShapeOptions(int i){
        System.out.print("Shape #" + (i+1) + "\n" + "1. Sphere" + "\n" + "2. Pyramid" + "\n" 
                            + "3. Cubiod" + "\n" + "4. Cone" + "\n" + "5. Cylinder" + "\n" + "Your Choice: ");
    }
}
