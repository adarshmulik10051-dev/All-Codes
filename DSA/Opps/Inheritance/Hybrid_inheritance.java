package DSA.Opps.Inheritance;

public class Hybrid_inheritance { // 1base class multiple dervied class mulitiple subclass
    public static void main (String args[]){

    }
}
class Animal{
int legs;
String color;
 void eat(){
     System.out.println("eats");
 }
 void Breath(){
    System.out.println("breaths");
   }
}
class Fish extends Animal{
    int per;

}
class Bird extends Animal{
    String fly;
}
class Mammals extends Animal{
    int legs;
}
class Human extends Mammals{

}
class Shark extends Fish{

}

class Hen extends Bird{

}