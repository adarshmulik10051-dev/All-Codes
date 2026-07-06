
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
         
         public void AddFirst(int data){
            //step 1:create new node :
            Node newNode = new Node(data);
            size++;
            // step 2: check if LL is empty 
            if(head==null){
             //step 3:then assign head and tail to new node :  
                newNode=head=tail;
                return;
            }
            //step 4: if no ,then assign newNode next point to head:
            newNode.next=head;
            //Srep 5 : asiggn newNode to head :
            head=newNode;
         } 

         public void AddLast(int data){
            //step 1: create a newNode
            Node newNode = new Node(data);

            //step 2: cheak if ll is empty
            if(head==null){
                newNode=head=tail;
                return;
            }
            //step 3 : if no,assign tail.next to newNode
            tail.next=newNode;
            newNode=tail;
         }
        
         

   
          
    public static void main (String args[]){

        SLinkList ll = new SLinkList();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddLast(4);
        ll.AddLast(5);
       
         



        
        
    }    
}

