package DSA.Arrays;
public class reverse_an_array {
    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;
        int temp= 0 ;
        while(first<last){
            temp=numbers[first];
           numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }

    }
    public static void main(String urgs[]){
        int numbers[]= {2,4,6,8,10,11,12,13};
        reverse(numbers);
        for(int i=0 ; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
