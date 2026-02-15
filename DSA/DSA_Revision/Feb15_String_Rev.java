package DSA.DSA_Revision;

public class Feb15_String_Rev {
    public static void palindrome_cheak(String str){
        int si = 0;
        int ei = str.length();
        for(int i = 0 ;i < ei/2;i++ ){
            if(str.charAt(i)!=str.charAt(ei-i-1)){
                System.out.println("not palindrome");
                return;
            }
            else{
                System.out.println("yes palindrome");
                return;
            }
        }
    }
    public static void print_substring(String str, int si , int ei){
        for(int i = si ; i <=ei; i++){
            System.out.print(str.charAt(i));
        }
    }
    public static void smaller_to_upper(String str){
     StringBuilder sb = new StringBuilder();
      char first = Character.toUpperCase(str.charAt(0));
      sb.append(first);
       for(int i = 1 ; i < str.length();i++){
           if(str.charAt(i)==' '&& i<str.length()){
               sb.append(str.charAt(i));
               i++;
               sb.append(Character.toUpperCase(str.charAt(i)));
           }
           else{
               sb.append(str.charAt(i));
           }
       }
       System.out.print(sb);
    }
    public static void main (String args[]){

       /*1.cheack palindrome
        String str = "madam";
        palindrome_cheak(str);*/

        /*2.print substring
        String str = "adarshmulik";
        print_substring(str,0,5);*/

        /*3 smaller to upper case
        String str = "i am adarsh mulik";
        smaller_to_upper(str);*/








    }
}
