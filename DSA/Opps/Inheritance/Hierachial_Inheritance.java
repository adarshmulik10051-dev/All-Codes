package DSA.Opps.Inheritance;

public class Hierachial_Inheritance {//one ain base class and more derived class
    public static void main (String args[]){

        Satara s1 = new Satara();
        s1.cheif_minister();
        Sangli sa = new Sangli();
        sa.MLA();
    }
}
class Maharastra{//base class
    String name;
    String language;
    int population;
    void cheif_minister(){
        System.out.println("Ajit dada");
    }
}
class Sangli extends Maharastra {// derived class 1
    String river;
    int villeges;
    void MLA(){
        System.out.println("Jayant Patil");
    }

}
class Satara extends Maharastra{// derived class 2
    String fort;


}