
package JavaBasic.Loops;
import java.util.*;
public class rev_the_given_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a no:");
        int number = sc.nextInt();
        int lastdigit=0;
        int revno=0;
        while(number>0){
            lastdigit = number %10;
            revno =(revno*10)+lastdigit;
            number = number / 10 ;
        }
        System.out.print("rev no is:"+revno);
    }
}
