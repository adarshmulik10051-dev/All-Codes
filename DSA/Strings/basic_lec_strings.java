package DSA.Strings;
import java.util.*;
public class basic_lec_strings {
    public static void  cration_Strings(){
        //two methods
        String str = "a,b,c,d";
        String str2 = new String("xyz");
        //String are immutable ;
    }
    public static void inpur_String(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        //nextLine-full line
        // next - for only single word
    }
    public static void find_length() {
        String name = "adarsh mulik";
        System.out.print(name.length());
        // () imp ahhe  String sathi
        //array la () nastat
    }
    public static void concatenetion(){
        String first_name = "Adarsh ";
        String last_name = "Mulik";
        System.out.println(first_name+" "+last_name);

         // concantesion mean 2-3 String add karna simple way ha ahhe ;
    }
    public static void  char_at_use(){
       String str = "Adarsh mulik";
        for(int i = 0 ; i < str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }

    }
    public static boolean cheak_palindrome(String str){
        int n = str.length();
        for(int i = 0 ; i<n/2 ; i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false ;
            }
        }
        return true;
    }
    public static float get_shortest_path(String str){
        int x = 0 ;
        int y = 0;
        for(int i = 0  ; i < str.length(); i++){
            char dir = str.charAt(i);
            //east
            if(dir=='E'){
             x++;
            }
            // west
            if(dir=='W'){
                x--;
            }
            //north
            if(dir=='N'){
                y++;
            }
            //south
            if(dir=='S'){
                y--;
            }


        }
        int X = (x*x);
        int Y = (y*y);
        return (float) Math.sqrt(X+Y);

    }
    public static void learn_String_compare(){
        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if(s1.equals(s3)){  // A == a

            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
    }
    public static void largest_String(String fruits[]){
        String largest = fruits[0];
        for(int i = 1 ; i < fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }System.out.println(largest);
    }
    public static void main (String args[]){

//        String str = "racecar";
//      System.out.println(  cheak_palindrome(str));

//        String str = "WNEENESENNN";
//        System.out.println("Shortest path is : "+get_shortest_path(str));

        String fruits [] ={"Apple", "orange","banana"};
        largest_String(fruits);
    }
}
