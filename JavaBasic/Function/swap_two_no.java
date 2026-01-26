
package JavaBasic.Function;
import java.util.*;
public class swap_two_no {
    public static void swap(int a, int b ){
        int temp = a;
               a = b;
               b =temp;
               System.out.println("value of a:"+a);
               System.out.println("value of b:"+b);
    }
    public static int product(int a , int b){
        int product= a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a first no:");
        int a = sc.nextInt();
        System.out.print("Enter a sec no:");
        int b = sc.nextInt();
        //swap(a,b);
      int prod=  product(a,b);
      System.out.println("prod is:"+prod);

    }
}
