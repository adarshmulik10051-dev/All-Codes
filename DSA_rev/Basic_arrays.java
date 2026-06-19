import java.util.*;
public class Basic_arrays{
    public static void main (String args[]){
            //basic of 1D array
            // 1. Array creation 
            int array []={1,2,3,4,5};
            int array1[]= new int [5];

            //2.length fnx in array
            int n = array1.length;
            System.out.println(n);

            //3.printing of array 
            for(int i = 0 ; i < n ; i++){
                System.out.print(array1[i]+" ");
            }
            //enhanced for each 
            for(int nums:array1){
                System.out.print(nums+" ");
            }

            //4.update in array 
            array1[3]=100;
            for(int nums : array1){
                System.out.print(nums+" ");
            }
            System.out.println();
            
            //5.input from user 
            /* int size = 5 ; 
            int arr[]= new int[size];
            Scanner sc = new Scanner(System.in);
            for(int i = 0 ; i < size ; i++){
                System.out.print("Enter a numbers:");
                arr[i]=sc.nextInt();
            }
            for(int input : arr ){
                System.out.print(input+" ");
            }*/

            //6 Searching techniques in array 
            //6.1 linear search :o(n)
            int arr3[]={100,200,300,400};
            int key = 400;
            for(int i = 0 ; i < arr3.length; i++){
                if(arr3[i]==key){
                    System.out.println("key is on index:"+i);
                    break;
                }
            }

            //6.2 binery search 0(logn) 
            int start = 0 ; 
            int end = arr3.length-1;
            while(start <= end ){
                int mid = start+(end-start)/2;

                if(arr3[mid]==key){
                    System.out.print("key is on index: "+mid);
                }
                if(arr3[mid]<key){
                    start= mid + 1 ; 
                }else{
                    end = mid -1 ;
                }
            }
            System.out.println();

            //7 sorting in array
            //7.1 Bubble sort-->o(n^2)
            int arr4[]= {5,3,4,1,2};
            for(int i = 0 ; i < arr4.length; i ++){
                for(int j = 0 ; j<arr4.length-i-1; j ++){
                    if(arr4[j]>arr4[j+1]){
                      int temp = arr4[j];
                        arr4[j]=arr4[j+1];
                        arr4[j+1]=temp;
                    }
                }
            }
            for(int bs : arr4){
                System.out.print(bs+" ");
            }System.out.println();
            
            //7.2 selection sort-->o(n^2)
            int arr5 []= {500,300,100,200};
            for(int i = 0 ; i < arr5.length-1 ; i ++){
                int minidx = i; 
                for ( int j = i+1 ; j <arr5.length ; j++){
                    if(arr5[minidx]>arr5[j] ){
                        minidx=j;
                    }
                
                }
                 int temp =arr5[minidx] ;
                    arr5[minidx]=arr5[i];
                    arr5[i]=temp; 
            }
             for(int ss : arr5){
                System.out.print(ss+" ");
            }System.out.println();
             
            //7.3 Insertion sort -->o(n^2)
            int arr6[]= {5,4,1,3,2};
            //pick
               for(int i = 1 ; i < arr6.length; i++){
                 int curr = arr6[i];
                int prev = i-1;
               
            //slide
                while(prev >=0 && arr6[prev]>curr){
                    arr6[prev+1]=arr6[prev];
                    prev--;
                }
            //insert   
               arr6[prev+1]=curr;
            }
                 for(int is : arr6){
                System.out.print(is+" ");
                }
            System.out.println();
            
            //7.4 count sort

            int arr7[]={1,4,1,3,2,4,3,7};
            //find max 
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < arr7.length ; i ++){
                if(max < arr7[i]){
                    max=arr7[i];
                }
            }
            //create count array 
            int count []=new int [max+1];
            //
            for(int i = 0 ; i < arr7.length; i ++){
               count[arr7[i]]++;
            }
            // to print sorted array 
            for(int i = 0 ; i<count.length; i++){
                int freq = count[i];
                while(freq>0){
                    System.out.print(i+" ,");
                    freq--;
                }
            }
            System.out.println();
            


             

            
                


            


            
            
            
            
    
    }
}