import java.util.Scanner;
public class checks_number {
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int num = sc.nextInt();
        if(num < 0){
            System.out.println("number is negative");
        }
        else if(num > 0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is zero");
        }

        if(num % 2 == 0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        if(num % 5 == 0){
            System.out.println("number is multiple of 5");
        }
        else{
            System.out.println("number is not multiple of 5");
        }
        int count  = 0;
        while(num > 0){
            num = num / 10;
            count ++;
        }
        if(count == 3){
            System.out.println("it is three digit number");
        }
        else{
            System.out.println("it is not three digit number");
        }
    }
}
