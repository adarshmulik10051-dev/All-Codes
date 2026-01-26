package DSA.Strings;
    import java.util.*;
    public class smller_touppercase {
        public static String To_uppercase(String str){
            StringBuilder sb = new StringBuilder("");

            char first = Character.toUpperCase(str.charAt(0));
             sb.append(first);
             for(int i = 1 ; i<str.length();i++){
                 if(str.charAt(i)==' '&& i < str.length()-1){
                     sb.append(str.charAt(i));
                     i++;
                     sb.append(Character.toUpperCase(str.charAt(i)));
                 }else{
                     sb.append(str.charAt(i));
                 }
             }return sb.toString();
        }
        public static void main (String args[]){
            String str = "hi i am adarsh";
            System.out.print(To_uppercase(str));
        }
    }
