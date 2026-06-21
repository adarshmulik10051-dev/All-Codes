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

            //8.questions by apna college 
            //8.1Largest in array o(n)
            int uni[]={1,2,3,4,5};
            int n1 = uni.length;
            int maximum = Integer.MIN_VALUE;
            for(int i = 0 ; i < uni.length;i++){
                if(maximum<uni[i]){
                    maximum=uni[i];
                }
            }
            System.out.println("maximum number in array is : "+maximum);

            
            //8.2reverse an array--> o(N)
            int start1 = 0;
            int end1=uni.length-1;
            while(start1 < end1){
                int temp=uni[start1];
                    uni[start1]=uni[end1];
                    uni[end1]=temp;
                    start1++;
                      end1--;
            }
            
            for(int revarr : uni){
                System.out.print(revarr+", ");
            }
            System.out.println();

            //8.3 pairs in array o(n^2) 
            for(int i = 0 ; i <n1 ;i++){
                for(int j = 0 ; j <n1 ; j++){
                    System.out.print("("+uni[i]+","+uni[j]+")");
                }
                System.out.println();
            }
            System.out.println();

            //8.4 print subarrays o(n^3)
            for(int i = 0 ; i < n1 ; i ++){
                for(int j = i  ; j < n1 ; j++){
                    for(int k = i ; k <=j ; k++){
                        System.out.print(uni[k]+",");
                    }
                    System.out.println();
                }
            }
            System.out.println();

            //8.5 maximumsum subarray
            //8.5.1 brute force--o(n^3)
            int maxsum= Integer.MIN_VALUE;
            for (int i = 0 ; i < n1 ; i ++){
                for(int j = i ; j<n1 ; j++){
                    int sum = 0 ; 
                    for(int k = i ; k<=j ; k++){
                        sum+=uni[k];
                    }
                    if(maxsum<sum){
                        maxsum =sum;
                    }
                }
            }
            System.out.println("maximum sum of subarray is :"+maxsum);

            //8.5.2 prefixsum:o(n)+o(n^2)
            int currsum=0;
            int prefix []= new int [n1];
            prefix[0]=uni[0];
            for(int i = 1; i <prefix.length; i++){
                prefix[i]=uni[i]+prefix[i-1];
            } 
            int maxs =Integer.MIN_VALUE;
            for(int i = 0 ; i < n1 ;i++){
                for(int j = i ;j<n1 ; j++ ){
                    currsum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                    if(maxs<currsum){
                        maxs=currsum;
                    }
                }
               
            }
            System.out.println("maxsumsubarray is :"+maxs);
             
            //8.5.3 Optimal solution (kadan's algo):o(n)
            int cs = 0 ;
            int ms = Integer.MIN_VALUE;
            for(int i = 0 ; i < n1 ; i ++){
                cs +=uni[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
            System.out.println("Maxsum is :"+ms);
            
            //8.6 Trapped rain water problem 
          

            int [] height={4,2,0,6,3,2,5};
            int length=height.length;
            
            //calculate leftmax boundry
            int leftMax[]=new int[length];
            leftMax[0]=height[0];
            for(int i = 1; i < length ; i ++){
                leftMax[i]=Math.max(leftMax[i-1],height[i]);
            }

            //calculate rightMax boundry
            int rightMax[]=new int [length];
            rightMax[length-1]=height[length-1];
            for(int i =length-2 ; i >=0 ; i--){
                rightMax[i]=Math.max(rightMax[i+1],height[i]);
            }
             int trapedWater=0;
            for(int i = 0 ; i < length ; i ++){
                //calculate waterlevel
                int waterlevel=Math.min(leftMax[i], rightMax[i]);
            //calculate traped water 
             trapedWater += waterlevel-height[i];
            
            }
            System.out.println("tp is ; "+trapedWater);


            //1.Basic of 2D Array 
            //1 How to create:
            int d1 [][]=new int [2][2];
            int d2 [][]={ {1,2,3},
                          {3,4,5},
                          {6,7,8},
                          {9,1,0}
                         };
            //2 length
            int row = d2.length;//no of row  
            int col=d2[0].length;//no of col 
            System.out.println("row size is: "+row+" and col size is : "+col);

            //3. printing 2D array:
            for(int i= 0 ; i < row ; i ++){
                for(int j = 0 ; j < col ; j++){
                    System.out.print(d2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();

            //4.update in 2D array 
            d2[0][1]=88;
            d2[2][1]=66;
            for(int i= 0 ; i < row ; i ++){
                for(int j = 0 ; j < col ; j++){
                    System.out.print(d2[i][j]+",");
                }
                System.out.println();
            }
            System.out.println();

            //Question by AC
            //1.Search position 
            int key1 = 88 ;
            for(int i = 0 ; i < row ; i ++){
                for(int j = 0 ; j < col ; j++){
                    if(d2[i][j]==key1){
                        System.out.println("the key is present on index:"+i+","+j);
                        break;
                    }  
                }
            }
            //2.Spiral Matrix
            int spiral [][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            int n2 = spiral.length;
            int m2= spiral[0].length;
            int startRow = 0 ;
            int endRow = n2-1;
            int startCol = 0;
            int endCol= m2-1;
            
            while(startRow<=endRow &&startCol<=endCol ){

                // top boundery
                for(int j = startCol ; j <=endCol ; j++){
                    System.out.print(spiral[startRow][j]+" ");
                }
                // rightboundery
                for(int i = startRow+1 ; i <=endRow ; i++){
                    System.out.print(spiral[i][endCol]+" ");
                }
                //bottomboundery
                for(int j= endCol-1 ; j >= startCol ; j--){
                    if(startRow==endRow){
                        break;
                    }
                    System.out.print(spiral[endRow][j]+" ");
                }
                //leftboundery
                for(int i = endRow-1 ; i >=startRow+1 ; i--){
                    if(startCol==endCol){
                        break;
                    }
                    System.out.print(spiral[i][startCol]+" ");
                }
                startRow++;
            startCol++;
            endCol--;
            endRow--;
            }
            System.out.println();
            //3.sum of digonal in 2D 
            int sum = 0 ;
             for(int i = 0 ;  i < n2 ; i++){
                sum+=spiral[i][i];
                if(i!=n2-1-i){
                    sum+=spiral[i][n2-i-1];
                }
             }
           System.out.println("sum of digonals is :"+sum);

           //4.Search in sorted 2D array 
           int sortArr[][]={{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}
                            };
            int cell=48;
            int rows = 0 ;
            int column= sortArr[0].length-1;
             while(rows<=sortArr.length-1&&column>=0){
                 int cellValue=sortArr[rows][column];
                if(cellValue==cell){
                    System.out.println("key is found on index:"+rows+","+column);
                }
                if(cellValue<cell){
                    rows++;
                }else{
                    column--;
                }
             }
            System.out.println();

            //5.Transpose of 2d Arraay:
            int set [][]={{1,2,3,4},{5,6,7,8}} ;
            int n3=set.length;
            int m3= set[0].length;
            
            int transpose[][]= new int [m3][n3];
            for(int i = 0 ; i < n3 ; i ++){
                for(int j = 0 ; j < m3 ; j++){
                    transpose[j][i]=set[i][j];
                }
            }
            for (int i = 0; i < m3; i++) {
                  for (int j = 0; j < n3; j++) {
                        System.out.print(transpose[i][j] + " ");
                  }
                  System.out.println();
            }
            System.out.println();



    }
}