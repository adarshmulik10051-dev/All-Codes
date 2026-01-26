package DSA.Opps;
public class Encapsulation {
    public static void main (String args[]){
    student s1 = new student();
//    student s2= new student("adarsh");
//    student s3 = new student(123);
        String name ="Adarsh";
        int rollno = 12;
        student s2 =new student(s1);//copy construstoctor banla s1 cha sagla data s1 mde pass zala;
    }
}
class student{
    String name ;
    int rollno;
    String pass;
    student (student s1){// ha dusra counstructor banvla jo ki s1 con cop zala
        this.name=name;
        this.rollno=rollno;

    }
    student(){// non parameterized
        System.out.println("constructor is called");
    }
    student(String name ){ //parameterized
        this.name=name;
    }
    student(int rollno){  //parameterized
        this.rollno=rollno;
    }
}
