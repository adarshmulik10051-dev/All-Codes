package DSA.Arrays2D;
public class sum_of_digonals {
    public static int sum_of_digo(int matrix[][]){
        int sum = 0;
      for(int i = 0 ; i< matrix.length;i++){
        //pd
          sum += matrix[i][i];
          //sd
          if(i!= matrix.length-1-i){
             sum += matrix[i][matrix.length-1-i];
          }

      }
      return sum;
    }
    public static void main (String urgs[]){
        int matrix [][]= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(sum_of_digo(matrix));
    }
}
