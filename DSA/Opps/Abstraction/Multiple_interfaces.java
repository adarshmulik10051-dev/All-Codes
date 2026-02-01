package DSA.Opps.Abstraction;

public class Multiple_interfaces {
    public static void main (String args[]){
     Bear bhalu = new Bear();
      bhalu. eat();
    }
}
interface herbivor{
     void eat();
}
interface carnivor{
      void eat();
}
class Bear implements herbivor, carnivor{

    public void eat(){
        System.out.println("bear is carnivore & harbivore");
    }

}
