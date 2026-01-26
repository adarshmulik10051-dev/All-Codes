package JavaBasic.Conditional;
import java. util.*;
public class largest_of_two_no {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first no: ");
        int a = sc.nextInt();
        System.out.print("Enter a second no: ");
        int b = sc.nextInt();
        if(a<b){
            System.out.println(b+"is greter than"+a);
        }else{
            System.out.println(a+"is greter than"+b);
        }
    }
}
