//write a java program to create a class Rectangle with length and breadth as data members using objects
//calculate area and perimeter determine whether the rectangle is a square and compare two rectangles based on area and digional length

import java.util.Scanner;

class Rectangle {
    double length, breadth;

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    boolean isSquare() {
        return length == breadth;
    }

    double diagonalSquare() {
        return Math.sqrt(length * length + breadth * breadth);
    }
}

public class Rectangle_area_comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.print("Enter length and breadth of Rectangle 1: ");
        r1.length = sc.nextDouble();
        r1.breadth = sc.nextDouble();

        System.out.print("Enter length and breadth of Rectangle 2: ");
        r2.length = sc.nextDouble();
        r2.breadth = sc.nextDouble();

        System.out.println("\nRectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());

        if (r1.isSquare())
            System.out.println("Rectangle 1 is a Square");
        else
            System.out.println("Rectangle 1 is not a Square");

        if (r2.isSquare())
            System.out.println("Rectangle 2 is a Square");
        else
            System.out.println("Rectangle 2 is not a Square");

        if (r1.area() > r2.area())
            System.out.println("\nRectangle 1 has larger area");
        else if (r1.area() < r2.area())
            System.out.println("Rectangle 2 has larger area");
        else
            System.out.println("Both have equal area");

        if (r1.diagonalSquare() > r2.diagonalSquare())
            System.out.println("Rectangle 1 has longer diagonal");
        else if (r1.diagonalSquare() < r2.diagonalSquare())
            System.out.println("Rectangle 2 has longer diagonal");
        else
            System.out.println("Both have equal diagonal");

        sc.close();
    }
}