package DSA.Arrays2D;
public class A2Z_BS_ON_2D {

    public static boolean Search_in_sorted_array(int array [][],int key ) {

         int row = 0 ;
         int column = array[0].length-1;
                 while(row < array.length && column >=0){

                     if(array[row][column]== key ){
                         System.out.println("index present on : "+"["+row+","+column+"]");
                         return true;
                     }
                     else if(array[row][column]<key){
                         row++;
                     }else{
                         column--;
                     }
                 }
                 return false;
    }
   public static int lower_bound(int array[],int m  , int key ){
        int mid = 0 ;
        int start = 0 ;
        int end = m-1;
        int ans = m;
        while( start <= end ){

            mid = (start +end )/2;
             if (array[mid]>= key){
                 ans = mid ;
                 end = mid -1 ;
             }else{
                 start= mid+1;
             }
        }return ans ;
   }
    public static void max_one_row(int array [] []){
        int n = array.length;
        int m = array[0].length;
        int max_count = 0;
        int index = -1;

        for(int i = 0 ; i < array.length ; i++ ){
            int count_one = m- lower_bound( array[i], m ,1 );
            if(max_count<count_one){
                max_count= count_one;
                index = i ;
            }
        }
        System.out.println("Row with maximum number of 1's: "+index);
    }
    public static boolean search_in_sortedarray(int array[][],int n , int m,int key ){
        int start = 0;
        int end = (n*m)-1;
        while(start <= end ){

            int mid = (start + end )/2;
             int row = mid / m ;
             int col = mid % m ;
             if(array[row][col]==key){
                 System.out.println("index present on : "+"["+row+","+col+"]");
                 return true ;
             }
             else if ( array[row][col]< key){
                 start = mid + 1;
             }
             else{
                 end = mid -1 ;
             }
        }
        return false;

    }
    
    public static void main (String args[]) {

//        1)seaerch in sorted array
//        int array[][]={{1,2,3,4},
//                       {5,6,7,8},
//                      {9,10,12,13}};
//         int key = 8;
//        Search_in_sorted_array(array,key);

//      2) max row with one
//       int array[][]={ {0,0,1,1,1},
//                       {0,0,0,0,0},
//                       {0,1,1,1,1},
//                       {0,0,0,0,0},
//                       {0,1,1,1,1}
//       };
//        max_one_row(array);
        int array[][] = {{3, 4, 7, 9},
                {12, 13, 16, 18},
                {20, 21, 23, 29}};
        int n = array.length;
        int m = array[0].length;
        int key = 29 ;
        System.out.println("key is present : "+search_in_sortedarray(array,n,m,key));
    }
}
