//Factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
         Scanner Sc = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int a = Sc.nextInt();
         int fec = 1;
         for(int i = 1; i <= a; i++){
             fec = fec*i;
         }
         System.out.print("The Fectorial of the number is: "+fec);
    }
}
