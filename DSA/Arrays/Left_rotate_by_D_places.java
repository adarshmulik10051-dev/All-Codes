package DSA.Arrays;

public class Left_rotate_by_D_places {
    public static int []Left_rotate_by_d(int array[],int D,int n ){
         D = D%n;

         int temp[] = new int [D];
         for(int i = 0 ; i < D ; i++){//store d place in temp array
             temp[i]=array[i];
         }
         for(int i = D;i < n ; i++){
             array[i-D]=array[i];
         }
         for(int i = n-D;i<n ;i++){
             array[i]=temp[i-(n-D)];
         }
         return array;
    }
    public static void print_arr(int array[],int n ){
        for(int i = 0 ; i< n ;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]){
        int array[] = {1,2,3,4,5,6,7};
        int D =3;
        int n = array.length;
        Left_rotate_by_d(array,D,n);
        print_arr(array,n);

    }
}
