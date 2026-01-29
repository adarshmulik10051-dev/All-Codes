package DSA.Opps.Encapsulation;

    class Basic {
    public static void main (String args[]){
        Students s1 = new Students("Adarsh");//constructoe call zala name pass zala
        System.out.println(s1.name);
    }
}
class Students {
  String name;
  int roll_no;

    Students(String name){
        this.name= name ;
    }
        }
