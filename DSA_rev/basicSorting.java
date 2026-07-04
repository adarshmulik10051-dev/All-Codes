public class basicSorting {
    public static void basicSorting(){
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
    public static void main (String args[]){
        basicSorting();
        
    }
    
}
