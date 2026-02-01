package DSA.Opps.Abstraction;

public class Static_keyword {
    public static void main(String args[]){
  Student s1 = new Student ();
    s1.School_name="xyz";

    Student s2 = new Student();
    s2.School_name="abc";
    System.out.println(s2.School_name); // static mula s2 la pn school name tech gela
    }
    Student s3 = new Student();

}
class Student {
    String name;
    int  roll_no;
    static String School_name;

    void setName(String name){
        this.name =  name;
    }
    String getname(){
        return name;

    }
}