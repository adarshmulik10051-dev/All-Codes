package DSA.BitManuplation;
public class Bit_maiplation {
    public static void bit_operators(){
        // AND Operator '&' TT-T
        System.out.println(5&6);
        // OR Operator '|' FF-F
        System.out.println(5|6);
        //XOR Operator TT-F/ FF-F
        System.out.println(5^6);
        //1's compliment it mean not / negation use only single digit T-F F-T
        System.out.println(~5);
    }
    public static void get_ith_bit(int n ,int ith_bit){
        int bitmask = 1<< ith_bit;
        if((n & bitmask)==0){
            System.out.println(ith_bit+"th bit of "+n+" is 0");
        }else{
            System.out.println(ith_bit+"th bit of "+n+"is 1");
        }
    }
    public static int set_ith_bit(int n , int i){
        int bitmask= 1<<i;
        return n|bitmask;
    }

    public static int  clear_ith_bit(int n , int i){
        int bit_mask =~(1<<i) ;
       return n&bit_mask;

    }

    public static int update_bit(int n , int i,int new_bit){
         n = clear_ith_bit(n,i);
        int bitmask = new_bit<<i;
         return n|bitmask;
    }
    public static int clear_last_uthbit(int n , int i ){

        int bitmask = ~(0)<<i;
        return n&bitmask;
    }
    public static int clear_in_range(int i,int j,int n){
        int a  = ~(0)<<j+1;
        int b = (1<<i)-1;
        int bitmask = a|b ;
        return n&bitmask;
    }

    public static boolean num_is_power_of_two(int n ){
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static int count_set_bits(int n){
        int count = 0 ;
        while(n>0){
            if((n&1)!=0){
                count ++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void cheak_odd_even(int n ){
        int bitmask = 1 ;
        if((n&bitmask)==0){
            System.out.println("is even");
        }
        else{
            System.out.println("is odd");
        }
    }
    public static void main (String args[]){

//        1) odd even
//       int n = 11;
//       cheak_odd_even(n);


//        2) operations
//        int n =10 ;
//        int ith_bit =2;
//        int new_bit = 1;
//        get_ith_bit(n,ith_bit);
//        set_ith_bit(n,ith_bit);
//      System.out.println(clear_ith_bit(n,ith_bit));
//        System.out.println(update_bit(n,ith_bit,new_bit));
//        System.out.println(clear_ith_bit(n,ith_bit));

//        int i = 2;
//        int j =7;
//        int n = 10;
//
//        System.out.println(num_is_power_of_two(5));

//        System.out.println(count_set_bits(10));

    }
}
