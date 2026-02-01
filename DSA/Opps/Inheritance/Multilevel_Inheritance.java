package DSA.Opps.Inheritance;

public class Multilevel_Inheritance {// one base class multiple derived class Showroom-->car--->BMW
    public static void main(String args[]){
   BMW  f1 = new BMW();
   f1.color ="Orange";
    System.out.println(f1.color);
    }
}
class Showroom{// base class
    String availabel;
    void Acceseries(){
        System.out.println("Yes Available");
    }

}
class Cars{
    int Doars;
    String color;
    String fuel;
    int speed;

     void setColor(String color){
         this.color=color;
     }
     void fuel(){
         System.out.println("both Disel+Petrol");
     }
}

class BMW extends Cars{// Showroom-->car--->BMW
    int price;

    void Speed_limit(int speed){
        this.speed=speed;

    }

}
