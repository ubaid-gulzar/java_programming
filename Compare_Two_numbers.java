import java.util.*;
public class Compare_Two_numbers {
    public static void main(String[] args){
         Scanner Sc = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int a = Sc.nextInt();
         System.out.print("Enter the Second number: ");
         int b = Sc.nextInt();
         if(a > b){
            System.out.print("The first number is greater than the second number");
         }
         else if( a == b){
            System.out.print("Both numbers are equal");
         }
         else{
            System.out.print("The Second number is greater than the First number");
         }
    }
}
