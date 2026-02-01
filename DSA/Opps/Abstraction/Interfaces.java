package DSA.Opps.Abstraction;

public class Interfaces {
    public static void main(String args[]){
     Queen q = new Queen();
     q.moves();

     King k = new King();
     k.moves();

     Rook r =  new Rook();
     r.moves();

    }
}
interface Chessplayer{// make a blueprint 1)it can totally abstract
                                        // 2)All method will public ,abstract with all implementation
                                        //variable are public static & final
     void moves();
}
class Queen implements Chessplayer {

    public void moves(){
        System.out.println("up,down,left,roght,digonal,All side ");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("Moves up dowen  left right  one step ");
    }
}
class Rook implements Chessplayer{
     public void moves(){
         System.out.println("up,down,left,roght,All side ");
     }
}
