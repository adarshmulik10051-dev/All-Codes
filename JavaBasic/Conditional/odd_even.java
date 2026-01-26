package JavaBasic.Conditional;
import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("given no is even");
        }else{
            System.out.println("given no is not even ");
        }
    }
}
