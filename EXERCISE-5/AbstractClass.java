import java.util.*;

abstract class Area{
    int a,b;
    abstract void printArea();
}

class Rectangle extends Area{
    int a,b;
    void printArea(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Length of the Rectangle : ");
        int a = s.nextInt();

        System.out.print("Enter Breadth of the Rectangle : ");
        int b = s.nextInt();

        double Area = a*b;
        System.out.printf("The area of the rectangle having length %d and breadth %d is %f.",a,b,Area);;
        System.out.println();
    }
}

class Triangle extends Area{
    int a,b;
    void printArea(){
    Scanner s = new Scanner(System.in);

        System.out.print("Enter Height of the Triangle : ");
        int a = s.nextInt();

        System.out.print("Enter Base of the Triangle : ");
        int b = s.nextInt();

        double Area = (0.5)*a*b;
        System.out.printf("The area of triangle having height %d and base %d is %f.",a,b,Area);
        System.out.println();
    }
}

class Circle extends Area{
    int r;
    final double pi = 3.14;
    void printArea(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Radius of the Circle : ");
        int r = s.nextInt();

        double Area = pi*r*r;
        System.out.printf("The area of the circle having radius %d is %f.",r,Area);
        System.out.println();
    }
}

public class AbstractClass{
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.printArea();

        Triangle t = new Triangle();
        t.printArea();

        Circle c = new Circle();
        c.printArea();
    }
}