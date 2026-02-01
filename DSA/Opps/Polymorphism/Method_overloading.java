package DSA.Opps.Polymorphism;

public class Method_overloading { //compile time polymorphism
    public static void main(String args[]){// it mean same funtion name but diffrent parameter pass
        Calculator cal = new Calculator();
        System.out.println(cal.sum(3,2));
        System.out.println(cal.sum((float) 3.2,(float) 2.3));
        System.out.println(cal.sum(1,2,3));

    }
}
class Calculator{

    int sum(int a ,int b){
        int sum = a+ b;
        return sum;
    }

     float sum (float a , float b){
        float sum = a+b;
        return sum;
     }

     int sum (int a, int b , int c){
        int sum = a+b+c;
        return sum;
     }
}
