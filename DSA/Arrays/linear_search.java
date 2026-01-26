package DSA.Arrays;
public class linear_search {
    public static int linear_search(int numbers[], int key){
        for(int i = 0 ; i < numbers.length ; i++ ){
            if (numbers[i]== key ){
                return i ;
            }
        }
        return -1;
    }
    public static void main (String urgs[]){

        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int key = 7;
        int index = linear_search(numbers,key);
        if ( index == -1){
            System.out.println("key is not found");
        }else{

            System.out.println("key on index:"+index);
        }
    }
}
