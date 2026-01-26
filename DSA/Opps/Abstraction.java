package DSA.Opps;
public class Abstraction {
    public static void main (String args[]){
//      for abstact learn
//        Horse h = new Horse();
//        h.walk();
//
//        Chicken C = new Chicken();
//        C.walk();

        // for learn  interfaces
//        Queen Q = new Queen();
//        Q.moves();
//        King K = new King();
//        K.moves();
//        Pwan P = new Pwan();
//        P.moves();

        // 3) to learn multiple Interfaces
        Bear B = new Bear();
        B.eat();
    }
}
// 1) learn abstarct
abstract class Animals {

    void eat(){

        System.out.println("Animals eats");

    }
     abstract  void walk();// 1 idea dili pratek class la ki walk() ghya va lagel ani to
                            //atta Animal class varti depend nhi to class varti deoend ahhe
}
 class Horse extends Animals{
    void walk (){
        System.out.println("horses walk on 4 leg");
    }
 }
 class Chicken extends Animals{
    void walk(){
        System.out.println("Chiken walk on 2 leg");
    }
 }
 // 2)for down learn Iterfaces comment out upper porsion

interface Chessplayer{
    void moves();// interface tayar kela yane tuala idea bhetli ky implemnt karaych ahhe
}

class Queen implements Chessplayer {
      public void moves(){// interface ahe mnun tula acces modifiers public chi garj lagli nhi tr void moves() only
           System.out.println("Up,Down,Right,Left,Digonal(in all direction)");
       }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left(one step)");
    }
}
class Pwan implements Chessplayer {
     public void moves(){
         System.out.println("Up,Down(one step)");
     }

}

//3) to learn mulitiple interfaces

interface carnivore {
    void eat();

}

interface herbivore{
    void eat();

}
class Bear implements carnivore,herbivore {
    public void eat(){
        System.out.println("bear is herbivore and carnivore");
    }

}
