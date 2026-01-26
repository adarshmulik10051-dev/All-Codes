package JavaBasic.Function;
import java.util.*;
public class dec_to_bin {
    public static int bin_to_dec(int dec){

        int binno = 0;
        int rem = 0;
        int pow= 0;
        while(dec>0){
            rem = dec % 2;
            binno= binno+(rem*(int)Math.pow(10,pow));
            dec=dec/2;
            pow++;

        }
        return binno;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int dec = sc.nextInt();
        System.out.println("decno of "+dec+" is "+bin_to_dec(dec));
    }
}
