import java.util.*;

public class StackB {

    public static void PushAtBottom(Stack<Integer> s, int data) {
        // 1.push at bottom :
        //approch:
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

    }
}
