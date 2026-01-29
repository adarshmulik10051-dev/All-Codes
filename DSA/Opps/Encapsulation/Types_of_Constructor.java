package DSA.Opps.Encapsulation;

public class Types_of_Constructor {
  public static void main (String args[]){
      Student s1 = new Student();
     Student s2  = new Student("Adarsh");
     Student s3 =  new Student(3532);
  }
}
class Student {
    String name;
    int roll_no ;

     Student(){    // This is type 1 -Non-Parameterize
        System.out.println("Constructor is called....");
    }

     Student (String name){ // this is type 2 parameterize...
        System.out.println(this.name);
    }
     Student (int roll_no){
        System.out.println(this.roll_no);
    }
}