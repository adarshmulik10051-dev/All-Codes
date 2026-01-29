package DSA.Opps;

public class Oops_concept {
    public static void main(String args[]){
        Pen p1 = new Pen();// is just created Pen object P1   &&  {pen () is constructar} &&
                          // new just created memory for Pen class That store String color,int tip
        p1.setcolor("white");// here we use dot function
        System.out.println(p1.color);
        p1 .settip(5);
        System.out.println(p1.tip);

    }
}

class Pen {//class
    String color;//properties
    int tip;     // properties

    void setcolor(String new_color){ // function
        color =new_color;
    }
    void settip (int new_tip){ // function
        tip= new_tip;
    }
}

class Student{ //class
    String name;//properties
    float percentage;//properties

    void cal_percantage(int phy, int maths, int chem){//functon
        percentage= (phy+maths+chem)/3;
    }
}
