import java.util.*;

public class StackQ {

    public static void PushAtBottom(Stack<Integer> s, int data) {
        // 1.push at bottom :
        // approch:
        // 1.use recursion
        // 2.pahila pop kr store kr
        // 3.recursive call kr mnje next level ja
        // 4.jeva stack empty hoil teva data push kr return
        // 5.khali yetna save kelela to push krt ye
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, data);
        s.push(top);// top add krr
    }

    public static String reveseString(String str) {

        // approch:
        // stack banv 1
        // 1. String mdhla 1-1 char add kr stack mde
        // 2.string madhla 1-1 char pop karun append kr result mde
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reveseStack(Stack<Integer> s1) {
        // approch :
        // 1.varti jatana pop
        // 2.khali yetna pushh ar bottom
        if (s1.isEmpty()) {
            return;
        }
        int top = s1.pop();
        reveseStack(s1);
        PushAtBottom(s1, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    // stock-span problem using stack

    public static void calSpan(int stocks[], int span[]) {

        Stack<Integer> s = new Stack<>();// in stack we store idx of prev high
        span[0] = 1;// 0 varch nehmi 1 asnar span
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {// for itrate each day
            int currPrice = stocks[i];

            while (!s.isEmpty() && currPrice >= stocks[s.peek()]) {
                s.pop();// currprice peksha chota asel tr span mde nko kadun taka
            }
            if (s.isEmpty()) {// kadun takta takta empty tr zala nhi na stack:if yes
                span[i] = i + 1;
            } else {// if no
                int prevhigh = s.peek();
                span[i] = i - prevhigh;
            }
            s.push(i);// idx store kela stack mde
        }

    }

    // next greter element :
    public static void nxtGreater(int arr[], int nxtgreterarr[]) {

        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            // while
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // if else
            if (s.isEmpty()) {
                nxtgreterarr[i] = -1;
            } else {
                nxtgreterarr[i] = arr[s.peek()];
            }
            // push
            s.push(i);
        }

    }

    // valid parenthesis:
   public static boolean validParaString(String str){
    Stack<Character> s = new Stack<>();

    for(int i=0; i<str.length(); i++){

        char ch = str.charAt(i);

        if(ch=='(' || ch=='[' || ch=='{'){
            s.push(ch);
        }
        else{

            if(s.isEmpty()){
                return false;
            }

            if((s.peek()=='(' && ch==')') ||
               (s.peek()=='{' && ch=='}') ||
               (s.peek()=='[' && ch==']')){
                s.pop();
            }
            else{
                return false;
            }
        }
    }

    return s.isEmpty();
}

    public static void main(String args[]) {

        // 1.push at bottom:
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        PushAtBottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        // 2.reverse sting useing stack:
        String str = "adarsh";
        String revstr = reveseString(str);
        System.out.println("rev String is: " + revstr);

        // 3.reverse the stack :
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        reveseStack(s1);
        printStack(s1);

        // stock span problem using stack
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        calSpan(stocks, span);
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ,");

        }
        System.out.println("");

        // next greater element
        int arr[] = { 5, 9, 1, 0, 2 };
        int nxtgreterarr[] = new int[arr.length];
        nxtGreater(arr, nxtgreterarr);
        for (int i = 0; i < nxtgreterarr.length; i++) {
            System.out.print(nxtgreterarr[i] + " ,");

        }

        // vaid parenthesis
         String str1 = "{{[()]}}";
         System.out.println(validParaString(str1));

    }
}
