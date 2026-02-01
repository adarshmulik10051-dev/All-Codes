package DSA.Opps.Inheritance;

public class Single_level {// one base class one derived class
    public static void main (String args[]){
   Information_Technology IT = new Information_Technology();
    IT.Principle_name();
    }
}
class College{  // base class
    String Principal_name;
    int intake;

    void Principle_name(){
        System.out.println("Sandhya Jadhav");
    }
}
class Information_Technology extends College {  // derived class   single college-->IT
    int intake;
    String Hod;

}
