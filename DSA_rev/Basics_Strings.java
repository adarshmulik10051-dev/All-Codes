import java.util.*;

public class Basics_Strings {
    public static void main (String args[]){
        
    //1.how to create:
    String str1= "adarsh";
    String str2 = new String("mulik");

    //2.how to print:
    System.out.println("String 1 :"+ str1);
    System.out.println("String 2 :"+str2);

    //3.how take input 
   /*Scanner sc = new Scanner(System.in);
    System.out.print("enter your firstName:");
    String firstName =sc.next(); // for single word
    System.out.print("enter your lastName:");
    String lasteName=sc.nextLine();*/ // for line / para

    //4.length function 
    System.out.println("length of string 1 is: "+ str1.length());
    
    //5.how to concatenate string: str1+str2
    System.out.print(str1+" "+str2);

    //6.how to compare Strings  
    // in heap ex1&ex2 located at same address""abc" they are not separate one abc store 
    //but we create new then abc new addres obtain 
    //so both are not same
      String  ex1="abc";  
      String ex2="abc";
      String ex3=new String("abc");
      System.out.println();

      if(ex1==ex2){
        System.out.println("same");//true
      }else{
        System.out.println("not same");
      }

       if(ex1==ex3){
        System.out.println("same");
      }else{
        System.out.println("not same");//true
      }

     //7.string method/functions
     String str="sidhivinayak";
     //7.1.**method: str.charAt()
     //to get specific/acess char in string 

      for(int i = 0 ; i < str.length();i++){
        System.out.print(str.charAt(i)+" ");
      }
      System.out.println();

      for(int i = 0 ; i < str.length() ; i++){
        if(str.charAt(i)=='h'){
            System.out.print("present on inex:"+i);
        }
      }


      //7.2. how to compare Strings
      //7.2.1 **method:str1.equals(str2);
      // Note:(A!=a)
      boolean result=  ex1.equals(ex3);
      System.out.println(result);

    //7.2.2**Method:str1.compareTo(str3)
    //note:A=a
    //Returns 0 → both strings are equal.
    //Returns negative value → str1 comes before str2. // adhi z asel mg a asel
    //Returns positive value → str1 comes after str2.  .. adhi a mg z 
    System.out.println(str1.compareTo(str2));

    //7.3 convert into uppercase 
    // **method str.toUppercase();
    System.out.println( str1.toUpperCase());

    //7.4for replace  char in string
    // ** method: str.replace("str","str") || ('ch','ch');
    String color = "red";
    String ucolor= color.replace('r','m');
     System.out.println(ucolor);

     //8.how to get substring in og string 
     //method :str.subString(si,ei);
     // ei is excluid start is incluid 
     System.out.println(color.substring(0,2));

     //13.how to convert strings to arrays:
     // **Method: str.toCharArray();
        String fullname="adarsh ashok mulik ";
         char fullnamearray[]= fullname.toCharArray();
          for(char sd :fullnamearray ){
            System.out.print(sd+" ");
          }
          System.out.println();

     //14.how to spilt the string after delimeter 
     //ex after ,or after space 
     String s ="adarsh,sarthak,rohit";
    String friends[]= s.split(",");
    for(String el : friends){
        System.out.print(el+" ");
    }
    System.out.println();

    String s2 = "a.b.c";
            String[] arr = s2.split("\\.");
            for (String nums : arr) {
                  System.out.print(nums + " ");
            }
            System.out.println();

    //topic: StringBuilder
    //1. creation
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new  StringBuilder("Rohit") ;  
    StringBuilder sb3 = new StringBuilder(50) ;

    //2 how to print:
    System.out.println(sb);
    System.out.println(sb2);
    System.out.println(sb3);
    
    //Methods
    StringBuilder ex =new StringBuilder("hello DSA");
    //1. append(String || int || boolean )-- add data at end 
    sb2.append("pandit"); //rohit pandit
    System.out.println(sb2);
    sb2.append(78); 
    System.out.println(sb2);//rohit pandit 78

    //2.insert(inx,str||char)
    sb2.insert(5,'X');//RohitXpandit78
    System.out.println(sb2);
    sb2.insert(14, " dadya");
    System.out.println(sb2);//RohitXpandit78 dadya

    //3.delete(int ,int )// delete char in specific range
    sb2.delete(0,5);
    System.out.println(sb2);//Xpandit78 dadya

    //4.replace(idx ,idx )-->replace a range of characters
    sb2.replace(1,4,"PAN");
    System.out.println(sb2);

    //5.reverse
   System.out.println( sb2.reverse() );

   //6.length()-->return length of String
   System.out.println(sb2.length());

   //7. charAt();
       System.out.println(sb2.charAt(1));
    //8.setCharAt(idx,char''')
    sb2.setCharAt(1,'d');
    //9.deletCharAt(idx)
    sb2.deleteCharAt(3);

    //10 toString()--> convert all char int float into string
    sb2.toString();


    












      









    }
}
