
package JavaBasic.Loops;
import java.util.*;
public class sum_of_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a range:");
        int n = sc.nextInt();
        int count = 0;
        int sum =0;
        while(count<=n){
            sum = sum+count;
            count++;

        }
        System.out.print("sum is:"+sum);
    }
}
