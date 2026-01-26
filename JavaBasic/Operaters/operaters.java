package JavaBasic.Operaters;
import java.util.*;
public class operaters {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a first no:");
        int a = sc.nextInt();
        System.out.print("Enter a second no:");
        int b = sc.nextInt();
         System.out.println("sum is ="+(a+b));
        System.out.println("sub is ="+(a-b));
        System.out.println("product is ="+(a*b));
        System.out.println("division is ="+(a/b));
        System.out.println("modulo is ="+(a%b));
    }
}
