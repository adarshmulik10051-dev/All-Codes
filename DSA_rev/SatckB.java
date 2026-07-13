import java.util.*;

public class SatckB {
    // stack using arraylist
    static class StackAl {
        static ArrayList<Integer> List = new ArrayList<>();

        // op1 is empty():it can return the tru?false when its empty
        public static boolean isEmpty() {
            return List.size() == 0;
        }

        // push(): it can add on top of stack mean end of the List at the top
        public static void push(int data) {
            List.add(data);
        }

        // pop(): it can be remove top of the List/stack at the top
        public static int pop() {
            if (List.isEmpty()) {
                return -1;
            }
            int top = List.get(List.size() - 1);
            List.remove(List.size() - 1);
            return top;
        }

        // peek():it used to see top value (vakun bgane fkt)
        public static int peek() {
            if (List.isEmpty()) {
                return -1;
            }
            int top = List.get(List.size() - 1);
            return top;
        }

    }// stackAl samla block

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class StackLL {
        static Node head;

        // 1.is empty():
        public static boolean isEmpty() {

            return head == null;
        }

        // 2. push();
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {// ll is empty
                head = newNode;
                return;
            }
            // conect
            newNode.next = head;
            head = newNode;

        }

        // pop()
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        // peek()
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String args[]) {
        StackAl s = new StackAl();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println("satckLL start");
        StackLL s1 = new StackLL();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
        System.out.println("jcf");
        // java framework :
        Stack<Integer> s3 = new Stack<>();
        s3.push(1);
        s3.push(2);
        s3.push(3);

        while (!s3.isEmpty()) {
            System.out.println(s3.peek());
            s3.pop();
        }

    }

}
