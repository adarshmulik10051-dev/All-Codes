
import java.util.*;

public class SLinkList {

    /*
     * 📌1.linklist:
     * defination:
     * Linklist is linear data structure in which element (called nodes) are
     * connected
     * using pointer/refrence
     * 
     * 1.2.Structure of a Node:
     * +------+-------+
     * | Data | Next |
     * +------+-------+
     * 
     * -data : actual value ex: int char bool string.
     * -next:addres of next node.
     * 
     * 1.3.Why Linked List:
     * - dynamic size
     * -insert delete without shifting
     * -according to memory requrment create node
     * 
     * 1.4.example:
     * [Engine] ---> [Coach1] ---> [Coach2] ---> [Coach3] ---> null
     * 
     * 1.5.important:
     * -link list : node connect using reference
     * -Node : Linklist each ealemnt(data+Next)
     * -Data :Node madhil value
     * -Next :next node refrence.
     * -Head :node 1 reference(Strart point)
     * -Tail :Last Node Reference(end point)
     */
//📌2.How to create Node :
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /*
     * // When we write:
     * // Node n = new Node(5);
     * // it becomes:
     * // +--------+
     * // | data=5 |
     * // | next --|----> null
     * // +--------+
     */
    // 📌3.what is Head And Tail in ll:
    Node head;
    Node tail;
    int size;

//📌4.Add first in LL:
     // add new Node in first position

    public void addFirst(int data) {
        // step 1:create new node :
        Node newNode = new Node(data);
        size++;
        // step 2: check if LL is empty
        if (head == null) {
            // step 3 :if yes, asiggen tail & new node to head
            head = tail = newNode;
            return;
        }
        // step 4: if no ,then assign newNode next point to head:
        newNode.next = head;// connection
        // Srep 5 : asiggn newNode to head :
        head = newNode;// head update

    }

//📌5.add new node to Last position
    public void addLast(int data) {
        // step 1: create a newNode
        Node newNode = new Node(data);
        size++;

        // step 2: cheak if ll is empty
        if (head == null) {
            // step 3 :if yes, asiggen tail & new node to head
            head = tail = newNode;
            return;
        }
        // step 4: if no,assign tail.next to newNode
        tail.next = newNode;// connection
        // step5: update tail
        tail = newNode;// tailUpdate
    }

//📌6.how to print LinkList
    public void print() {
        // step 1: store head in temp
        Node temp = head;
        // traverse until temp goes to tail
        while (temp != null) {
            // step 3 print temp data
            System.out.print(temp.data + "-->");
            // step 4. store next node in temp with help of next reference
            temp = temp.next;
        }
        System.out.println("null");
    }

//📌7.add the new node in middle
    public void addMiddle(int idx, int data) {
        //
        if (idx == 0) {
            addFirst(data);
            return;
        }
        // step 1 .create new node
        Node newNode = new Node(data);
        size++;

        // step 2.store head in temp
        Node temp = head;   
        // step 3 .increase temp until on position prev idx-1:
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;// move next next
            i++;
        }
        // step 4.we on prev now

        newNode.next = temp.next;// connection new->rightnode
        temp.next = newNode;// leftnode show to new node
    }

// 📌8.remove first element in list
    public int removeFirst() {

        // case 1: cheack if ll is empty
        if (size == 0) {
            System.out.println("the ll is empty");
            return Integer.MIN_VALUE;
        }
        // case3: cheak if ll have single node
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // step 1:store vale of head
        int val = head.data;
        // step 2: move head to nextnode
        head = head.next;
        // step 3: decrese the size
        size--;
        // step 4:return val
        return val;
    }
 // 📌8.how to remove lastnode
    public int removelast() {

        // check ll is empty
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        // check is single node in ll
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // Step - 3: create a temporary node to traverse the LL:
        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            // Step - 4: move temp till the second last node:
            temp = temp.next;
        }
        // Step - 5: store the value of the last node:
        int val = temp.next.data;
        // Step - 6: make second last node the new tail:
        temp.next = null;
        tail = temp;
        // Step - 7: decrease the size:
        size--;
        // Step - 8: return the removed value:
        return val;
    }

//📌9.iterative search :
    public int iterativeSearch(int key) {
        //step 1.store head in temp varible
        Node temp = head;
        int i = 0;
        //step 2:iterate head-->node1-->node2-->tai-->null comes  break
        while (temp != null) {
            //step3. if key found return i
           if(temp.data==key){
            return i;
           }
           //step 4. key not found go to next node 
           temp=temp.next;
           i++;
        }
       // step5. key is not present then
        return -1;
        //TC:o(n);

    }
//📌10.recursive Search :
    public int helper(Node head , int key){//o(n)
     //step 2:base case: the key is not in LL
      if(head==null){
        return -1;
      }
      //step 3:if key is found 
      if(head.data==key){
        return 0 ;
      }
      //step 4:check next Node as a head 
      int idx= helper(head.next, key);
      //step 5: idx not found return -1
       if(idx==-1){
        return -1 ;
       }
       //step 5: idx found then return 
       return idx+1;

        }
            public int recursiveSearch(int key){
            //step 1 ; create helper function 
            return helper(head, key);
            
        }   
         

//📌10. reverse the LL
public void reverse(){
   // step 1: decrale 3 varible 
    Node prev=null;
    Node curr =tail=head;
    Node next;

    while(curr!=null){
        //step 2 : declare 4 step:
        next=curr.next;//curr-->next.
        curr.next=prev;// curr-->prev.
        prev=curr;// curr la replce kela  prev.
        curr=next;// next la replce kel curr.
    }
    head=prev;
}
//📌11.remove  nth node from lasst\
    public void removeFrLast(int idx){
        //step 1 : calculate size 
        int sz= 0 ; 
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        //step 2: remove head 
        if(idx==sz){
            head = head.next ;
            return;
        }

        //step 3: to rach idx cha prev node
        int i = 1 ;
        Node prev = head ;
        while(i<(sz-idx)){//prev idx size-idx
            prev= prev.next;
            i++;
        }
        //step 4 : we are on prev node 
        //step 5:now break connection with deleting node apoint to next
        prev.next=prev.next.next;
        return;

    }
//📌11 cheak ll is  palindrome:
  // step 1: find middle Node 
public Node findmid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null &&fast.next!=null){
        slow=slow.next;//slow=slwo+1
        fast = fast.next.next;//fast=fast+2
    }
    return slow ;//mid=slow;
}
public boolean isPalindrome(){
    //corner case: ll is null and ll contain node
    if(head==null || head.next==null){
        return true ;
    }
    //step 1: find mid 
    Node middleNode = findmid(head);
    //step 2:reverse the 2nd half
      Node prev = null;
      Node curr = middleNode;
      Node next;

      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
       Node right=prev;//right half head 
       Node left =head;
    //step 3:cheak 1st half = 2nd half
    while(right!=null){
        if(right.data!=left.data){
            return false;
        }
        left=left.next;
        right=right.next;
    } 
    return true;
}
    public static void main(String args[]) {

        SLinkList ll = new SLinkList();
      /*   ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        ll.addMiddle(2, 8);
        ll.print();

        System.out.println(ll.size);

        int val = ll.removeFirst();
        System.out.println("removed firstNode data is :" + val);
        ll.print();

        int valr = ll.removelast();
        System.out.println("removed lastNode val is:" + valr);
        ll.print();

        int idx=ll.iterativeSearch(8);
        System.out.println("keay is on index:"+idx);

        int keyidx = ll.recursiveSearch(3);
        System.out.println("keay is on index:"+keyidx);

        ll.reverse();
        ll.print();

        ll.removeFrLast(2);
        ll.print();*/

        // jeva palindrome run karatay teva varch sagla comment out kara 
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print();
       System.out.println( ll.isPalindrome());
    



    }
}
