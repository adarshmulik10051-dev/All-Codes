public class Queues_implementation {
     public static class Queue{
        //queue implementation araays
        static int array [];
        static int size;
        static int rear;

        Queue(int n ){
            array =new int[n];
            size = n;
            rear = -1;
        }
        //1.isempty():
        /*
        approch:
          1. rear jr -1 asel tr array rikama ahe 
         */

        public static boolean isEmpty(){
            return rear==-1;
        }

        //2.add
        /*approch:(rear jo ahhe to end ahhe maza tyala appan pointer sarkh pude pude neyach)
          1.pahila bg array full ahhe ka 
          2.rear la +1 kr 
          3.mg data add kr array md 
         */
        public static void add(int data){
            if(rear==size-1){
                System.out.println("queue is full!!");
                return;
            }
            rear= rear +1;
            array[rear]=data;
        }
        //remove
        /*approch:
            1.pahila bg array empty ahhe ka 
            2.nasel tr- 
            3.pahila idx varch store kr front mde 
            4.sagle element 1 ne pati ghe array mde loop laun 
            5. rear la 1 srep pati gheun ye rear = rear -1 ;
            5.return kr front done
        
        */
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }

            int front = array[0];
            for(int i = 0 ; i <rear  ; i ++){
                array[i]=array[i+1];
            }
            rear=rear-1;
            return front;
        }
        //3 .peek :
        /*
            1.pahila bg que empty ahhe ka 
            2-nasel tr -
            3.tr pahila index varcha return kr na 
        */
        public static int peek(){
            if(isEmpty()){
                System.out.println("arrays is empty");
                return -1;
            }
            return array[0];
        }


     }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
                 q.remove();
        }
   
    }
}
