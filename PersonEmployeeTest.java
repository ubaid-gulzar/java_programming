/*
Question 2:
Create a class “Person” with fields “name” and “age” and a method “display()”
that prints the name and age of the person.
Create a subclass “Employee” that extends “Person” and adds a field “salary”
and a method “display()” that prints the name, age, and salary of the employee.
Create an object of the “Person” class and call the “display()” method.
Create an object of the “Employee” class and call the “display()” method.
*/

class Person {
    String name = "Ubaid";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary = 50000;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class PersonEmployeeTest {
    public static void main(String[] args) {

        Person p = new Person();
        p.display();

        Employee e = new Employee();
        e.display();
    }
}