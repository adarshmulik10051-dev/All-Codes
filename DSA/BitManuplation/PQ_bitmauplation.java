package DSA.BitManuplation;
public class PQ_bitmauplation {
    public static void swap_two_no(int a,int b){
        a = a^b;
        b= a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void add_one_integer(int n){
        System.out.println(-(~n));
    }
    public static void main(String args[]){
//        swap_two_no(5,6);
        add_one_integer(10);
    }
}
