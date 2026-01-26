package DSA.Arrays;
public class largest_in_array {
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for ( int i = 0 ; i < numbers.length; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main (String urgs[]){
        int numbers [] = {5,2,3,63,6,23,11,45,32};
        int large =largest(numbers);
        System.out.println("largest NO in array:"+large);
    }
}
