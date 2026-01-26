package JavaBasic.Loops;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a no:");
        int number = sc.nextInt();
        int fact=1;
        for(int i = number;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("factorial is:"+fact);
    }
}
