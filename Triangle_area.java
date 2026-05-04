//write a java program to create a class Rectangle with three sides as data members. 
//Using objects validate whether the sides form a triangle, identify its types(equilateral, isosceles, or scalene)
//calculate its area using herons formula

import java.util.Scanner;

class Triangle {
    double a, b, c;

    boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    void type() {
        if (a == b && b == c)
            System.out.println("Equilateral Triangle");
        else if (a == b || b == c || a == c)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class Triangle_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();

        System.out.print("Enter three sides: ");
        t.a = sc.nextDouble();
        t.b = sc.nextDouble();
        t.c = sc.nextDouble();

        if (t.isValid()) {
            System.out.println("Valid Triangle");

            t.type();

            System.out.println("Area = " + t.area());
        } else {
            System.out.println("Not a valid triangle");
        }

        sc.close();
    }
}