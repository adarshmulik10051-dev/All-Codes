package DSA.Strings;
import java .util.*;

public class String_PQ {
    public static void vovelscount(String str){
        int count = 0 ;
        for(int i = 0 ; i< str.length();i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch == 'e' || ch== 'i' || ch== 'o'||ch== 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void cheak_anagram(String s1 ,String s2){
        char s1arr [] = s1.toCharArray();
        char s2arr [] =s2.toCharArray();

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        System.out.println(Arrays.equals(s1arr,s2arr));

    }
    public static void main (String args[]){
//       String str = "abceidouad";
//        vovelscount(str);

        String s1 = "eat";
        String s2 = "tea";
        cheak_anagram(s1,s2);


    }
}
