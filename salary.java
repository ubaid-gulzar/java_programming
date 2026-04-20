import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input basic salary
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        // Calculate HRA
        double hra;
        if (basic <= 20000) {
            hra = 0.20 * basic;
        } else {
            hra = 0.30 * basic;
        }

        // Calculate DA
        double da = 0.80 * basic;

        // Calculate Gross Salary
        double gross = basic + hra + da;

        // Calculate Tax
        double tax = 0;
        if (gross > 50000) {
            tax = 0.10 * gross;
        }

        // Net Salary
        double net = gross - tax;

        // Output results
        System.out.println("\n--- Salary Details ---");
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + net);

        sc.close();
    }
}
