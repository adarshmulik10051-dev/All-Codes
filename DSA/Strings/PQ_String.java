package DSA.Strings;
import java.util.*;
public class PQ_String {
    public static int count_ovels(String str){
        int count = 0 ;
        for(int i = 0 ; i< str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' ) {
                count ++;
            }
        }return count ;
    }
    public static void anagrams(String s1, String s2){
        char s1array [] = s1.toCharArray();//{ 't', 'e','a'};
        char s2array []= s2.toCharArray();// {'e','a','t'};
        Arrays.sort(s1array);// aet
        Arrays.sort(s2array);//aet
        System.out.println(Arrays.equals(s1array,s2array));

    }
    public static void main (String args[]){
//        String str = "abcefgjijklmnopqrstuvwxyz";
//       System.out.println( count_ovels(str));

//        String s1 = "tea";
//        String s2 = "eat";
//        anagrams(s1,s2);

    }
}
