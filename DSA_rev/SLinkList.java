
import  java.util.*;
public class SLinkList { 


/*📌1.linklist:
         defination: 
         Linklist is linear data structure in which element (called nodes) are connected 
         using pointer/refrence

         1.2.Structure of a Node:
         +------+-------+
         | Data | Next  |
         +------+-------+
         
         -data :  actual value ex: int char bool string.
         -next:addres of next node.

         1.3.Why Linked List:
          - dynamic size 
          -insert delete without shifting
          -according to memory requrment create node

         1.4.example:
         [Engine] ---> [Coach1] ---> [Coach2] ---> [Coach3] ---> null

         1.5.important:
         -link list : node connect using reference
         -Node : Linklist each ealemnt(data+Next) 
         -Data :Node madhil value 
         -Next :next node refrence.
         -Head :node 1 reference(Strart point)
         -Tail :Last Node Reference(end point)
        */
 //📌2.How to create Node :
         public static class Node {
            int data;
            Node next;

             Node(int data){
                this.data=data;
                this.next=null;
            }
         }
         /*
            // When we write:
            // Node n = new Node(5);
            // it becomes:
            // +--------+
            // | data=5 |
            // | next --|----> null
            // +--------+      
          */
 //📌3.what is Head And Tail in ll:
         Node head ;
         Node tail ;
         int  size ;

//📌4.Add first in LL:
         //add new Node in first position  
         
         public void addFirst(int data){
            //step 1:create new node :
            Node newNode = new Node(data);
            size++;
            // step 2: check if LL is empty 
            if(head==null){
            //step 3 :if yes, asiggen  tail & new node to head     
                head=tail=newNode;
                return;
            }
            //step 4: if no ,then assign newNode next point to head:
            newNode.next=head;//connection
            //Srep 5 : asiggn newNode to head :
            head=newNode;//head update

         } 
//📌5.add new node to Last position
         public void addLast(int data){
            //step 1: create a newNode
            Node newNode = new Node(data);
            size++;

            //step 2: cheak if ll is empty
            if(head==null){
            //step 3 :if yes, asiggen  tail & new node to head   
                head=tail=newNode;
                return;
            }
            //step 4: if no,assign tail.next to newNode
            tail.next=newNode;//connection
            //step5: update tail
            tail=newNode;//tailUpdate
         }
//📌6.how to print LinkList
         public void print(){
            //step 1: store head in temp 
            Node temp=head;
            //traverse until temp goes to tail
            while(temp!=null){
                //step 3 print temp data 
                System.out.print(temp.data+"-->");
                //step 4. store next node in temp with help of next reference 
                temp=temp.next;
            }
            System.out.println("null");
         }
//📌7.add the new node in middle
         public void addMiddle(int idx ,int data){
         //
            if(idx==0){
                addFirst(data);
                return;
            }
            //step 1 .create new node 
            Node newNode = new Node(data);
            size++;

            //step 2.store head in temp
             Node temp =head;
             //step 3 .increase temp until on position prev idx-1:
              int i = 0 ; 
              while(i<idx-1){
                temp = temp.next;//move next next 
                i++;
              }
              //step 4.we on prev now 

              newNode.next=temp.next;//connection new->rightnode
              temp.next=newNode;//leftnode show to new node    
         } 
//📌8.remove first element in list                  
         public int removeFirst(){

            //case 1: cheack if ll is empty
            if(size==0){
                System.out.println("the ll is empty");
                return Integer.MIN_VALUE;
            }
            //case3: cheak if ll have single node
            else if(size==1){
                int val = head.data;
                head=tail=null;
                size=0;
                return val;
            }
            //step 1:store vale of head 
            int val = head.data;
            //step 2: move head to nextnode 
            head=head.next;
            //step 3: decrese the size
            size--;
            //step 4:return val
            return val;
         }
//📌8.how to remove lastnode
        public int removelast(){
           
            //check ll is empty
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }
            //check is single node in ll 
            if(size==1){
               int val = head.data;
                head=tail=null;
                size=0;
                return val;
            }
             // Step - 3: create a temporary node to traverse the LL:
            Node temp = head;

            for(int i = 0 ; i < size-2; i++){
                // Step - 4: move temp till the second last node:
                temp=temp.next;
            }
             // Step - 5: store the value of the last node:
            int val = temp.next.data;
            // Step - 6: make second last node the new tail:
            temp.next=null;
            tail=temp;
             // Step - 7: decrease the size:
            size--;
            // Step - 8: return the removed value:
            return val;
        }         
    public static void main (String args[]){

        SLinkList ll = new SLinkList();
        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.print();

        ll.addMiddle(2,8);
        ll.print();

        System.out.println(ll.size);

       int val = ll.removeFirst();
       System.out.println("removed firstNode data is :"+val);
        ll.print();

        int valr=ll.removelast();
        System.out.println("removed lastNode val is:"+valr);
        ll.print();




         



        
        
    }    
}

