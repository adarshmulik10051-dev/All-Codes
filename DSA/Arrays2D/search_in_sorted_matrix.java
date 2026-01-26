package DSA.Arrays2D;
public class search_in_sorted_matrix {
    public static boolean search(int matrix[][],int key){
        int row = 0 ;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0){

            if(matrix[row][col]==key){
                System.out.print("key is present on sell:"+"("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;//left side la gelo
            }else{
                row++;//dowen side la gelo
            }
        }
        System.out.println("key is not present");
        return false;
    }
    public static void main(String urgs[]){
        int matrix [][]= {
                         {10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,28},
                         {32,33,39,40}};
        int key = 35;
        search(matrix,key);

    }

}
