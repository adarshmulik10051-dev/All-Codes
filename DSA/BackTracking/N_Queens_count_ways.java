package DSA.BackTracking;

public class N_Queens_count_ways {
    public static boolean is_Safe(char board[][],int row, int col){
        //upward
        for(int i =row-1;i>=0;i-- ){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left-digonal
        for(int i =row-1 ,j=col-1;i>=0&&j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //rightdownward
        for(int i = row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void N_queens(char board[][],int row){
        if(row==board.length){
           count++;
            return;
        }
        for(int j = 0 ; j < board.length;j++){
            if(is_Safe(board,row,j)){
                board[row][j]='Q';//work
                N_queens(board,row+1);//functioncall
                board[row][j]='x';//backtrack
            }

        }
    }
    static int count=0;
    public static void main(String args[]){
        int n = 4;
        char board[][]= new char [n][n];
        //inilize the board with X
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < n;j++){
                board [i][j]='x';
            }
        }
        N_queens(board,0 );//row==0;
        System.out.println("The all possible ways to place Queen is : "+count);

    }
}
