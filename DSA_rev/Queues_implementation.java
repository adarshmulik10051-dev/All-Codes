import java.util.*;
public class Queues_implementation {
    public static class QueueA {
        // queue implementation araays
        static int array[];
        static int size;
        static int rear;

        QueueA(int n) {
            array = new int[n];
            size = n;
            rear = -1;
        }
        // 1.isempty():
        /*
         * approch:
         * 1. rear jr -1 asel tr array rikama ahe
         */

        public static boolean isEmpty() {
            return rear == -1;
        }

        // 2.add
        /*
         * approch:(rear jo ahhe to end ahhe maza tyala appan pointer sarkh pude pude
         * neyach)
         * 1.pahila bg array full ahhe ka
         * 2.rear la +1 kr
         * 3.mg data add kr array md
         */
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("queue is full!!");
                return;
            }
            rear = rear + 1;
            array[rear] = data;
        }

        // remove
        /*
         * approch:
         * 1.pahila bg array empty ahhe ka
         * 2.nasel tr-
         * 3.pahila idx varch store kr front mde
         * 4.sagle element 1 ne pati ghe array mde loop laun
         * 5. rear la 1 srep pati gheun ye rear = rear -1 ;
         * 5.return kr front done
         * 
         */
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty Queue");
                return -1;
            }

            int front = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        // 3 .peek :
        /*
         * 1.pahila bg que empty ahhe ka
         * 2-nasel tr -
         * 3.tr pahila index varcha return kr na
         */
        public static int peek() {
            if (isEmpty()) {
                System.out.println("arrays is empty");
                return -1;
            }
            return array[0];
        }

    }

    // implement queue using circular queqe
    public static class QueueC {
        static int array[];
        static int size;
        static int front;
        static int rear;

        QueueC(int n) {
            array = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // isEmpty
        public static boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // isFull
        public static boolean isFull() {
            return (rear + 1) % size == front;// rear la me pude ghetoy pn thithech front ahhe mnje quequ full ahhe
        }

        // add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("queqe is full");
                return;
            }
            if (front == -1) {// first element add
                front = 0;
            }
            rear = (rear + 1) % size;
            array[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queqe is empty");
                return -1;
            }
            int result = array[front];
            // delete last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("arrays is empty");
                return -1;
            }
            return array[front];
        }

    }

    // linklist
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class QueqeLL {
        static Node head = null;
        static Node tail = null;

        // isEmpty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = head.data;
            if (tail == head) {// for a single element
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queqe is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String args[]) {
        QueueA q = new QueueA(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println("array over circuler start");

        QueueC q1 = new QueueC(3);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        System.out.println(q1.remove());
        q1.add(4);
        System.out.println(q1.remove());
        q1.add(5);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }

        System.out.println("circular array is over LL start");
        QueqeLL q2 = new QueqeLL();
        q2.add(1);
        q2.add(2);
        q2.add(3);

        while (!q2.isEmpty()) {
            System.out.println(q2.peek());
            q2.remove();
        }

        System.out.println("java framework start ");

       // how to declare Queqe
        Queue<Integer> q3 = new LinkedList<>();
       // Here Queue is an interface, and LinkedList is a class that implements the Queue interface.
        //because LinkedList implements Queue and makes the FIFO behavior easy to understand.
        //you can aslo use :->Queue<Integer> q3 = new ArrayDeque<>();
        q3.add(1);
        q3.add(2);
        q3.add(3);
        while (!q3.isEmpty()) {
            System.out.println(q3.peek());
            q3.remove();
        }

        

        
    }
}
/*
1️⃣ Array Queue
[1][2][3][ ][ ]
 ↑           ↑
front       rear
Add → rear पुढे
Remove → first element काढून सगळे shift
Remove = O(n)
2️⃣ Circular Queue
[1][2][3]
 ↑     ↑
front rear
Array च्या रिकाम्या जागेचा पुन्हा वापर
rear = (rear + 1) % size
Add/Remove = O(1)
3️⃣ Linked List Queue
head              tail
 ↓                 ↓
[1] → [2] → [3] → null
Add → tail कडे
Remove → head कडून
Add/Remove = O(1)
4️⃣ Java Queue
Queue<Integer> q = new LinkedList<>();
Queue → Interface
LinkedList → Implementation
add() → element add
remove() → front remove
peek() → front पाहतो
isEmpty() → Queue empty आहे का?

एकदम short मध्ये:

Queue = FIFO → First In First Out
Normal Array → shifting
Circular Array → space reuse
Linked List → head remove, tail add
Java → Queue interface + LinkedList/ArrayDeque implementation
*/
