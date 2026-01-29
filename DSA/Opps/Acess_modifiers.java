package DSA.Opps;

public class Acess_modifiers {
    public static void main (String args[]){
   Bank_Account Myacc = new Bank_Account();
   Myacc.change_pass("abcd");
//   System.out.print(password); we use private do not visible to outside class ;
    }
}
class Bank_Account{
    public String name ;  // public use witthin class,pakage,outside pak,
    private String password; // only in class

    public void change_pass(String new_pwd){
        password= new_pwd;
    }
}