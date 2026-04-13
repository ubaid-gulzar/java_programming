//program that accepts three  integers and returns true if two or more of them(integers) have the same right most digit.
import java.util.Scanner;
public class _even_odd {
    public static void main(String[] args){
         Scanner Sc = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int a = Sc.nextInt();
         System.out.print("Enter the Second number: ");
         int b = Sc.nextInt();
         System.out.print("Enter the Third number: ");
         int c = Sc.nextInt();
         if(a % 10 == b % 10 || a % 10 == c % 10 || c % 10 == b % 10){
            System.out.print("True");
         }
        else{
            System.out.print("False");
         }
    }
}
