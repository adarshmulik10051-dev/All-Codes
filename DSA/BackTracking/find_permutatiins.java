package DSA.BackTracking;

public class find_permutatiins {
    public static void permutation(String str ,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursive
        for(int i = 0 ; i < str.length();i++){
            char curr = str.charAt(i);
            //abcde-->ab+de=abde remove c
            String new_str=str.substring(0,i)+str.substring(i+1);

            permutation(new_str,ans+curr);
        }

    }
    public static void main (String args[]){
        String str="abc";
        permutation(str,"");
    }
}
