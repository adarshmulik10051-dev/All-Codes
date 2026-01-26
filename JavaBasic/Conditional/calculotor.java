package JavaBasic.Conditional;
import java.util.*;
public class calculotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a two no A & B : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter a choice for add(1),sub(2),prod(3),division(4):");
         int choice = sc.nextInt();
         switch(choice){
             case 1 :
                 int sum = a+b;
                 System.out.println("sum is "+sum);
             break;
             case 2 :
                 int sub = a-b;
                 System.out.println("sub is :"+sub);
                 break;
             case 3 :
                 int product = a*b;
                 System.out.println("product is :"+product);
                 break;
             case 4:
                   int division = a/b;
                 System.out.println("division is:"+division);
                  break;
             default:

         }
    }
}
