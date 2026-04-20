import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        if (num < 10 || num > 99) {
            System.out.println("Please enter a valid two-digit number.");
        } else {
            int tens = num / 10;
            int ones = num % 10;

            int sum = tens + ones;
            int product = tens * ones;

            if (sum + product == num) {
                System.out.println(num + " is a Special Number.");
            } else {
                System.out.println(num + " is NOT a Special Number.");
            }
        }
    }
}