package DSA.Strings;
public class stringbuildler {
    public static void main (String urgs[]){
        StringBuilder string = new StringBuilder("");
        for(char ch = 'a'; ch<='z';ch++){
            string.append(ch);
        }
        System.out.print(string);
    }
}
