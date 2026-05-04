import java.util.Scanner;

class Calculator {
    double num1, num2;
    char op;

    String history[] = new String[5];
    int count = 0;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
    }

    void calculate() {
        double result = 0;
        String record = "";

        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            result = num1 * num2;
        } else if (op == '/') {
            if (num2 == 0) {
                System.out.println("Cannot divide by zero!");
                return;
            }
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result = " + result);

        record = num1 + " " + op + " " + num2 + " = " + result;

        if (count < 5) {
            history[count] = record;
            count++;
        } else {

            for (int i = 0; i < 4; i++) {
                history[i] = history[i + 1];
            }
            history[4] = record;
        }
    }

    void showHistory() {
        System.out.println("\nLast 5 Calculations:");
        for (int i = 0; i < count; i++) {
            System.out.println(history[i]);
        }
    }
}

public class Calculator_remembering_history {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            c.input();
            c.calculate();
            c.showHistory();

            System.out.print("\nDo you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}