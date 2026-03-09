package DSA.BackTracking;
import java.util.*;

public class String_subset {
    public static void print_subset(String str , String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //choice yes
        print_subset(str,ans+str.charAt(i),i+1);
        //choice no
        print_subset(str,ans,i+1);


    }
    public static void main(String args[]){
        String str="abc";
        print_subset(str,"",0);
    }
}
