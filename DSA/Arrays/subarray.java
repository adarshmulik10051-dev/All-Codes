package DSA.Arrays;
public class subarray {
    public static void subarray(int arrays[]){
        for ( int i = 0;  i< arrays.length;i++){
            for( int j = 0; i<arrays.length;j++){
                //start = i &end=j
                for( int k = i ; k<j
                        ;k++){
                    System.out.print(arrays[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main (String urgs[]){
        int arrays [] ={2,4,6,8,10};
         subarray(arrays);
    }
}
