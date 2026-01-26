package JavaBasic.Conditional;
import java.util.*;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Three Numbers a,b,c:");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         if (a>=b  && a>=c){
             System.out.println(a+"is grater");
         }else if(b>=c){
             System.out.println(b+"is grater");
         }else{
             System.out.println(c+"is grater");
         }

    }
}
