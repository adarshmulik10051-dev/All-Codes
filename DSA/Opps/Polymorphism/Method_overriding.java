package DSA.Opps.Polymorphism;

public class Method_overriding {// it is a Run time polymorphism
    public static void main(String args[]){// it have same name fuction but work diffrent
        Deer d = new Deer();
        d.eat();// When overriding  happens then it can show child class property not parent class
    }
}
class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}
class Deer extends Animal {
    void eat(){
        System.out.println("Eat grass");
    }
}