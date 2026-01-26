package JavaBasic.Conditional;
import java .util.*;
public class ifelse {
    public static void main (String urgs[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("you can drive , Drink ,smoke,party");
        }else{
            System.out.println("not adult");
        }
    }
}
