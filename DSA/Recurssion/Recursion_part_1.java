package DSA.Recurssion;

public class Recursion_part_1 {
    public static void printdecreas(int n){

        if(n==1){//basecase
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");//kaam
        printdecreas(n-1);//inner function
    }
    public static void print_increase(int n ){
        if(n==1){
            System.out.print(n+" ");
            return ;
        }
        print_increase(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n ){
        if(n== 1) {
            return 1;
        }
      int  f =factorial(n-1);
       int fact  = n*f;

        return fact;
    }
    public static int sum_of_n(int n ){
       if(n==0){
           return 0 ;
       }
        int nm1 = sum_of_n(n-1);
       int sum = n + nm1;
       return sum ;
    }
    public static int fib(int n ){
        if(n==0||n==1){
            return n ;
        }
        int lasttearm = fib(n-1);
        int slastterm =fib(n-2);
        int ans= lasttearm+slastterm;
        return ans;
    }
    public static boolean issotred(int arr[],int i ){
        if(i==arr.length-1){
            return true ;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issotred(arr,i+1);
    }
   public static int first_occurence(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occurence(arr,key,i+1);
   }
   public static int lastocuurence(int arr[],int key ,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i ;
        }
        return lastocuurence(arr,key,i-1);
   }
   public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1 =power(x,n-1);
        int xn = x*xnm1;
        return xn ;
   }
   public static int optimize_power(int x,int n){
        if(n==0){
            return 1;
        }
        int xrn2= optimize_power(x,n/2);
        int xn =xrn2*xrn2;
        if(n%2!=0){
            xn = x*xn;
        }
        return xn;
   }
    public static void main (String args[]){
        int n = 5;
        //1) print n to 1
//        printdecreas(n);

//        2) print 1 to n
//        print_increase(n);

//        3) factorial of n
//     System.out.println("factfo is :"+factorial(n));

//        4)sum of n number
//        System.out.println("sum is "+sum_of_n(n));

//         5) print fibonaci n th term
//        System.out.println(fib(n));

        int arr []= {1,2,3,6,4,5};
        int i = arr.length-1;
//        6) cheak sorted or not array
//        System.out.println(issotred(arr,0));

//        7) firstocureance in array
//        System.out.println(first_occurence(arr,3,0));

//        8) last occurance in array
//        System.out.println(lastocuurence(arr,3,i));
        
//        9) calculate power  brute
//        System.out.println(power(2,10));

 //       10) calculate power optimize
        System.out.println(optimize_power(2,10));


    }
}
