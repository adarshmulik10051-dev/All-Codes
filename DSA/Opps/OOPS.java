public class OOPS {
    public static void main (String args[] ){

        Bank_Account MyAcc = new Bank_Account();
        MyAcc.Username = "adarsh";
//        MyAcc.password ="abcg";

    }
}

class Bank_Account {
  public String Username ;
  private String password;

}
class pen{
    String color ;
    int tip;
    String getColor(){
        return this.color;// this mean this replace honar pen la asa
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newcolor){
       this. color = newcolor;
    }
    void setTip(int newtip){
        this.tip = newtip;
    }
}
