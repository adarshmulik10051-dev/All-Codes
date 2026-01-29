package DSA.Opps.Encapsulation;

public class Copy_constructor {
    public static void main(String args[]){
    Studentss s1 = new Studentss();
    s1.name="adarsh";
    s1.roll_no=3536;
    s1.password= "abcd";
    s1.marks[0]=100;
    s1.marks[1]=99;
    s1.marks[2]=98;

    Studentss s2 = new Studentss(s1);//s1 all properties copy in s2;
    s2.password="xyz";

    for(int i = 0 ; i <= 3 ; i++){
        System.out.println(s2.marks[i]);
    }
    }
}
class Studentss {
    String name;
    int roll_no;
    String password;
    int marks[];

    Studentss(Studentss s1){  // copy constructor banvla
        marks =new int [3];
        this.name= s1.name;
        this.roll_no= s1.roll_no;
        this.marks=s1.marks;

    }
    Studentss(){
        System.out.println("Constructor is called.....");
    }
}