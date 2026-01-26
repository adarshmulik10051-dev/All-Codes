package DSA.Arrays2D;
public class spiral_matrix {
    public static void spiral_matrix(int matrix[][]){
        int start_row =0;
        int start_column = 0;
        int end_row = matrix.length-1;
        int end_column = matrix[0].length -1;
           while(start_row<=end_row && start_column<=end_column){
               //top_boundary
               for(int j = start_column; j <= end_column;j++){
                   System.out.print(matrix[start_row] [j]+" ");
               }

               //right_boundary
               for(int i = start_row+1; i<= end_row;i++){
                   System.out.print(matrix [i][end_column]+" ");
               }
               //bottom boundary
               for(int j = end_column-1; j>=start_column;j--){
                   if(start_column==end_column){
                       break;
                   }
                   System.out.print(matrix[end_row][j]+" ");
               }
               //left_boundary
               for(int i = end_row-1; i>=start_row+1;i--){
                   if(start_column==end_column){
                       break;
                   }
                   System.out.print(matrix[i][start_column]+" ");
               }
               start_row++;
               start_column++;
               end_row--;
               end_column--;
           }

    }
    public static void main(String urgs[]){
        int matrix [] []={
                         {1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}
                                     };
        spiral_matrix(matrix);
    }
}
