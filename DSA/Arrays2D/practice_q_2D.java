package DSA.Arrays2D;
public class practice_q_2D {
    public static int count(int matrix[][], int key){
        int count =0 ;
        for(int i = 0 ; i< matrix.length;i++){
            for(int  j = 0 ; j<matrix[0].length;j++ ){
                if(matrix [i][j]== key ){
                    count++;
                }
            }

        }
        return count;
    }
    public static int sum_of_row(int matrix [][],int row){
        int sum = 0;
        for(int j = 0 ; j<matrix[0].length;j++){
            sum += matrix[row][j];
        }
        return sum;
    }
    public static int [][] tranpose(int matrix[][]){
        int transpose[][]= new int [matrix[0].length][matrix.length];
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
               transpose [j][i] = matrix[i][j];
            }
        }
        return transpose;

    }
    public static void print_matrix(int matrix [][]){
        for(int i = 0 ; i< matrix.length; i++){
            for(int j = 0 ;j < matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String urgs[]){
        int matrix [][]={{4,7,8},{8,8,7}};
//         countfor key
//        int key =1;
//        System.out.println("count is:"+count(matrix,key));

//        int row = 1;
//System.out.println("sum of  row no "+row+"is : "+sum_of_row(matrix ,row));

       int transposed[][] =  tranpose(matrix);
        print_matrix(transposed);
    }
}
