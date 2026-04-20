import java.util.Scanner;

public class five_digit_number {
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the five digit number");
     int number = sc.nextInt();
     int rem;
     int odd = 0;
     int even = 0;
     for(int i = 0; i<5 ; i++){
        rem = number % 10;
        number = number /10;
        if(i % 2 == 0){
            odd = odd + rem;
        }
        else{
            even = even + rem;
        }
     }
         System.out.println("even position sum = "+ even);
         System.out.println("odd position sum = "+ odd);
    }
}
