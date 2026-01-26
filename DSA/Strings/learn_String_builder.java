package DSA.Strings;
import java.util.*;
public class learn_String_builder {
    public static String To_upper_case(String sentance){
        StringBuilder  sb = new StringBuilder("");
        sb.append(Character.toUpperCase(sentance.charAt(0)));
        for(int i = 1 ; i< sentance.length(); i++){
            if(sentance.charAt(i)== ' '&&  i < sentance.length()-1){
                       sb.append(sentance.charAt(i));
                       i++;
                       sb.append(Character.toUpperCase(sentance.charAt(i)));
            }else{
                sb.append(sentance.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress_string(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i <str.length();i++){
            Integer count = 1 ;
            while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
//        StringBuilder sb = new StringBuilder("");
//        for(char ch = 'a'; ch <= 'z'; ch++){
//            sb.append(ch);
//        }
//        System.out.println(sb);

//        String sentance ="hi i am adarsh";
//        System.out.print(To_upper_case(sentance));
//

        String str = "aaabbccc";
       System.out.print( compress_string(str));
    }
}
