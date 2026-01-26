package DSA.Arrays;
public class max_sub_array_kadans {
    public static void kadans(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum =0;
        for(int i = 0 ; i<numbers.length;i++){
            curr_sum= curr_sum+numbers[i];
            if(curr_sum<0){
                curr_sum=0 ;
            }
            if(max_sum<curr_sum){
                max_sum = curr_sum ;
            }
        }
          System.out.println("Max sum is "+max_sum);
    }
    public static void main(String urgs[]){
        int numbers[]={1,-2,6,-1,3};
        kadans(numbers);
    }
}
