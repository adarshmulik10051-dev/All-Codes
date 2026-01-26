package JavaBasic.Function;
import java.util.Scanner;

public class prime_no {
    public static boolean isprime(int n){
        boolean isprime= true;
        if( n==2){
            isprime= true;
        }
        for(int i= 2;i<=n-1;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }return isprime;
    }
    public static void prime_in_range(int n){
        for(int i = 2 ;i<=n-1;i++){
            if(isprime(i)==true){
                System.out.print(i+", ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a range:");
         int n = sc.nextInt();
        prime_in_range(n);

    }
}
