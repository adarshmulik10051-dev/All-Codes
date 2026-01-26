package JavaBasic.Loops;
import java.util.*;
public class prime_or_notprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no:");
        int number = sc.nextInt();
        boolean isprime = true;
        if (number == 2) {
            isprime = true;
        }
        for (int i = 2; i <= number - 1; i++) {
            if(number%i==0){
                isprime= false;
                break;
            }

        }
        if(isprime==true){
            System.out.print("is prime");
        }
        else{

            System.out.print("is not prime");
        }


     }
    }

