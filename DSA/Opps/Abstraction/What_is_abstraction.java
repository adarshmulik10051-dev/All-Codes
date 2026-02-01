package DSA.Opps.Abstraction;

public class What_is_abstraction {
    public static void main (String args[]){
     Dog dubby = new Dog();
     dubby.walk();
     dubby.eat();
     Chickens chik = new Chickens();
     chik.walk();
     chik.eat();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();// abstraction have nobody it just idea no implemetation

}
class Dog extends Animal{//dog extend animal tr ya mde walk name fucntion implement karavch lagel

    void walk(){
        System.out.println("Walk on four legs");//implementation abstarct class walk();
    }
}
class Chickens extends Animal{
    void walk(){
        System.out.println("Walk on two legs"); //depend upon subclass not parent class
    }
}