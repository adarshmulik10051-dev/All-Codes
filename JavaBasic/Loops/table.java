package JavaBasic.Loops;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter a no:");
           int n = sc.nextInt();
           int table = 1;
           for(int i =1;i<=10;i++){
               table= n * i;
               System.out.println("("+n+"*"+i+")"+"="+table);
           }

    }
}
