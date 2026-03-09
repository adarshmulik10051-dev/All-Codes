package DSA.BackTracking;

public class Backtrack_on_array {
    public static void change_array(int arr[] ,int i , int val){
        if(i==arr.length){ //basecase
            print_arr(arr);

            return;
        }
        arr[i]=val;
        change_array(arr,i+1,val+1);//change val call
        arr[i]=arr[i]-2;//backtrack


    }
    public static void print_arr(int arr[]){
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int [5];
        change_array(arr,0,1);
        print_arr(arr);


    }
}
