package DSA.Arrays2D;
import java.util.*;
public class TWO_D_Array {
    public static boolean search_key(int matrix[][],int n , int m , int key){
        for( int i = 0 ; i<n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(matrix [i][j]== key){
                    System.out.print("key is on cell:"+ "("+ i + "," + j+ ")");
                }
                return true ;

            }
        }
        System.out.println("key not fount ");
        return false;
    }

    public static void main(String urgs[]){
        int matrix [][]= new int[3][3];
        int n = matrix.length , m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<n ;i++){
            for(int j = 0 ; j < m ; j++){

                matrix[i][j]= sc.nextInt();

            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){

                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int key = 5;
        search_key(matrix,n,m,key);
    }
}
