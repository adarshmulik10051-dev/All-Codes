package DSA.Arrays;
public class max_sum_array {
    public static  void max_sub(int arrays[]){
        int cuursum= 0;
        int max_sum = Integer.MIN_VALUE;
        for ( int i =0 ; i< arrays.length; i++){
            for( int j = i ; j<arrays.length; j++){
                int currsum= 0;
                for( int k = i ;k<=j;k++){
                    currsum+=arrays[k];
                    System.out.println(currsum);
                }
                if(max_sum < currsum){
                    max_sum=currsum;
                }
                System.out.println();
            }

        }System.out.println("Max sum is :"+max_sum);

    }
    public static void main (String urgs[]){
        int arrays []= {-5,-1,7,8,2};
        max_sub(arrays);
    }
}
