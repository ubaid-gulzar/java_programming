//program to accept a number and check whether it is even or odd (print 1 if number i even or 0 if odd)
import java.util.*;
public class even_odd {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int a = sc.nextInt();
         if(a % 2 == 0){
            System.out.print("1");
         }
         else{
            System.out.print("0");
         }
    }
}