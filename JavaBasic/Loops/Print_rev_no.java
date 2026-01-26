package JavaBasic.Loops;
import java.util.*;
public class Print_rev_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a no:");
        int n = sc.nextInt();
        int lastdigit=0;
        int revno=0;
        while(n>0){
            lastdigit= n % 10;
            System.out.print(lastdigit);
            n=n/10;
        }

    }
}
