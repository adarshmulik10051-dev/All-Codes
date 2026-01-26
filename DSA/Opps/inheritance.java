package DSA.Opps;
public class inheritance {
    public static void main(String args[]){

      fish shark = new fish();
      shark.breath();

    }
}
class animal {// base class
    String color ;
    void eat (){
        System.out.println("eats");

    }
    void breath(){
        System.out.println("breaths");
    }
}
class mamal extends animal{//derived class
    int legs;
}

class dogs extends mamal{//derived class from derived class mean multilevel inheriatance
    String breed ;
}

class fish extends animal { // derived class
    int fins;

    void swim(){
        System.out.println("swim in water");
    }

}
