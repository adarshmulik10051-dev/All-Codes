package DSA.DSA_Revision;

public class Feb15_2DRev {


    public static boolean search_position(int matrix[][],int key){
        int n = matrix.length;
        int m= matrix[0].length;
        for(int i = 0  ; i < n ; i++){
            for(int j = 0 ; j < m ; j ++){
               if( matrix[i][j]==key){
                   System.out.println("key is on Index: "+i+","+j);
                   return true ;
               }

            }
        }
        return false;
    }
    public static void print_spiral_matrix(int matrix[][] ){
        int n = matrix.length;
        int m= matrix[0].length;

        int start_row=0;
        int end_row=n-1;
        int start_column=0;
        int end_column=m-1;

        while(start_row<= end_row && start_column<=end_column){

            // upper b
            for(int j = start_column; j <=end_column; j++){
                System.out.print(matrix[start_row][j]+" ");
            }
            // right b
            for(int i = start_row+1;i<=end_row; i++){
                System.out.print(matrix[i][end_column]+" ");
            }
            // lower b
            for(int j = end_column-1; j>=start_column;j--){
                if(start_column==end_column){
                    break;
                }
                System.out.print(matrix[end_row][j]+" ");
            }
            // left b
            for(int i = end_row-1; i>=start_row+1;i--){
                if(start_column==end_column){
                    break;
                }
                System.out.print(matrix[i][start_column]+" ");
            }
            start_row++;
            end_row--;
            start_column++;
            end_column--;
        }

    }
    public static void search_in_sorted(int matrix[][], int key){
        int n = matrix.length;
        int m= matrix[0].length;
        int row= 0;
        int col= m-1;
        while(row<n&&col>=0){
            if(matrix[row][col]==key){
                System.out.println("Key is on idx: "+row+","+col);
                return;
            }
            else if(matrix[row][col]<key){
                row++;

            }
            else{
                col--;
            }

        }
        System.out.print("key is not present");
    }
    public static void sum_of_row (int matrix[][],int row){
        int sum = 0 ;
        for(int j = 0 ; j< matrix[0].length;j++){
            sum+=matrix[row][j];
        }
        System.out.println("sum of "+row+"th row is: "+sum);
    }
    public static int [][]transpose(int matrix[][]){
        int n = matrix.length;
        int m =matrix[0].length;
        int transpose[][]=new int [m][n] ;
        for(int i = 0  ; i < n; i++){
            for(int j =0 ;j < m; j++){
                transpose[j][i]= matrix[i][j];
            }

        }
        return transpose;
    }
    public static void main (String args[]){
        int matrix [][]= {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,28},
                {32,33,39,40}};
        /* 1. search position
        int key = 35;
        search_position(matrix,key);*/

        /*2. spiral matrix
        print_spiral_matrix(matrix);*/

        /*3.search in sorted matrix
        int key = 77;
        search_in_sorted(matrix,key);*/

        /*4.sum of rows!
        int row=1;
        sum_of_row(matrix,row);*/

       /* 4. transepose the given array
       int trans[][]= transpose(matrix);
        for(int i = 0 ; i < trans.length;i++){
            for(int j  = 0 ; j < trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();

        }*/










    }
}
