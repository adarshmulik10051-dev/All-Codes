package JavaBasic.Conditional;
import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in );
        System.out.print("Enter your Income: ");
        int Income = sc.nextInt();
        int tax;
        if (Income<500000){
            tax= Income*0;
            System.out.println("No Tax ");
        }else if(Income>=500000 && Income<=1000000){
            tax =(int)( Income*0.2);
            System.out.println("20% Tax ");

        }else{
            tax = (int)(Income * 0.3);
            System.out.println("30% Tax ");

        }
        System.out.println("tax is:"+tax);

    }


}
