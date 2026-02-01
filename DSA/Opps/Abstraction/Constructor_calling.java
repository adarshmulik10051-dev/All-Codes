package DSA.Opps.Abstraction;

public class Constructor_calling {
    public static void main(String args []){
  Alphonso al = new Alphonso();// we juat create alphonso it called constructor from base class to derived class
  // Fruits-->Mango-->Alphonso
    }
}
abstract class Fruits{
     Fruits(){
        System.out.println("Fruits constructor called...");
    }
 void eat(){
     System.out.println("Yes eatable!!");

   }
    abstract void taste();
}
class Mango extends Fruits{
     Mango(){
        System.out.println("Mango constructor called...");
    }

    void taste(){
        System.out.println("Sweet ");
    }

}
class Alphonso extends Mango{
     Alphonso(){
        System.out.println("Alphonso constructor called...");
    }
}
