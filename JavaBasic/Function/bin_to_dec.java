package JavaBasic.Function;
import java.util.*;
public class bin_to_dec {
    public static int bi_to_dec(int binno){
        int lastdigit=0;
        int pow=0;
        int decNo=0;
        while(binno>0){
            lastdigit =binno %10;
            decNo = decNo+(lastdigit*(int)Math.pow( 2,pow));
            binno=binno/10;
            pow++;
        }
        return decNo;
    }
    public static void main (String args []){
       Scanner sc = new Scanner (System.in);
       int binno = sc.nextInt();

       System.out.println(bi_to_dec(binno));

    }
}
