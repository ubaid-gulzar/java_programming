//write a java program to create a class circle with radius as a data member. using objects 
//calculate area and circumfrence, compare two circles based on area, determine whether one circle can fit inside another

import java.util.Scanner;

class Circle {
    double radius;

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

    boolean canFitInside(Circle c) {
        return this.radius < c.radius;
    }
}

public class Circle_area_comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.print("Enter radius of first circle: ");
        c1.radius = sc.nextDouble();

        System.out.print("Enter radius of second circle: ");
        c2.radius = sc.nextDouble();

        System.out.println("\nCircle 1 Area = " + c1.area());
        System.out.println("Circle 1 Circumference = " + c1.circumference());

        System.out.println("\nCircle 2 Area = " + c2.area());
        System.out.println("Circle 2 Circumference = " + c2.circumference());

        if (c1.area() > c2.area()) {
            System.out.println("\nCircle 1 is larger (based on area).");
        } else if (c1.area() < c2.area()) {
            System.out.println("\nCircle 2 is larger (based on area).");
        } else {
            System.out.println("\nBoth circles have equal area.");
        }

        if (c1.canFitInside(c2)) {
            System.out.println("Circle 1 can fit inside Circle 2.");
        } else if (c2.canFitInside(c1)) {
            System.out.println("Circle 2 can fit inside Circle 1.");
        } else {
            System.out.println("Neither circle can fit inside the other.");
        }

        sc.close();
    }
}