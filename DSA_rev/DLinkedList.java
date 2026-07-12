public class DLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    // add first :
    public void addFirst(int data) {
        // create new node;
        Node newNode = new Node(data);
        size++;
        // ll is null
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // make connections
        newNode.next = head;
        head.prev = newNode;
        // update
        head = newNode;

    }

    /// print:
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove first :
    public int removeFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;  
        }
        if(head.next==null){//ll hav single NOde 
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
       head = head.next;
       head.prev=null;
        size--;
        return val;
    }

    //reverse ll 
     public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next=null;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            curr.prev=next;//new add this for prev show forwad 
            prev=curr;
            curr=next;
        }
        head=prev;
     }

    public static void main(String args[]) {
        DLinkedList dll = new DLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(1);
        dll.print();
       System.out.println("the removed first Node data is :"+ dll.removeFirst()+"size is:"+dll.size);
        dll.print();
        dll.reverse();;
        dll.print();
    }

}
