package DSA.BackTracking;

public class N_Queens_all_soln {
    public static void print_board(char board[][]){
        System.out.println("----This is board---");
        for(int i = 0 ; i < board.length;i++){
            for(int j = 0 ; j < board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }
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
            print_board(board);
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

    }
}
