package DSA.Opps;
public class polymorphism {
    public static void main(String args[]){
        calculator cal = new calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)2.5,(float)1.5));
        System.out.println(cal.sum(1,2,3));

        Deer d = new Deer();
        d.eat();
    }
}


//method/function over loading / compile time poly compiler ko pata tha konsa para meater kidhar pass karna hai
class calculator{

    int sum (int a , int b){
        return a+b;
    }

    float   sum (float a, float b){
        return a+b ;
    }

    int sum (int a , int b, int c){
        return a+b+c;
    }
}
class Animal {
    void eat(){
        System.out.println("eat anything!!");
    }
}
// overriding mean same name diff work
class Deer extends Animal {
    void eat (){
        System.out.println("eat grass");
    }

}

