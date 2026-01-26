public class A2Z_BS_on_1D {
    public static void Binary_search(int array [], int key ){
        int start = 0 ;
        int end = array.length-1;
        int mid = 0 ;

         while(start<=end){
            mid = (start + end )/2 ;
            if(array[mid]==key ){
                System.out.print("key is present on index : "+mid);
                break ;
            }
           else if(array[mid]<key){
                start = mid+1 ;
            }else{
                end = mid-1 ;
            }

         }
    }
    public static int lower_bound(int array[] , int key ){
        int start = 0;
        int end =array.length-1;
        int ans = array.length;

        while(start <= end ){
            int mid = (start+end)/2;
            if(array[mid]>=key){
                ans = mid ;
                end =  mid-1;
            }
            else{
                start = mid+1 ;
            }
        }
        return ans ;
    }
    public static int upper_bound(int array [],int key){
        int start   =  0 ;
        int end =  array.length-1;
        int ans = array.length;
        int mid = 0 ;
        while(start <= end ) {
            mid = (start + end) / 2;

            if (array[mid] > key) {
                ans = mid;
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static int Search_in_sorted_rotated_array(int array[],int target){
        int start   =  0 ;
        int end =  array.length-1;
        int mid = 0 ;
        while(start <= end ){

            mid = (start +end )/2 ;
            if(array[mid]==target){
                return mid ;
            }
             // cheak which part sorted
           else if(array[start]<= array [mid]){
                //left part is sorted
                if(array[start]<= target  && target<=array[mid]){
                    end = mid -1 ;
                }else{
                    start = mid +1 ;
                }
            }else{
                //right part is sorted
                if(array[mid]<= target && target<=array[end]){
                    start = mid +1;
                }else
                    end = mid-1 ;
            }
        }
        return -1;
    }
    public static int minimum_in_roted_sorted_arry(int array[]) {
  int start = 0 ;
  int end = array.length-1;
  int min = Integer.MAX_VALUE;
  int mid = 0 ;

  while(start<= end ){

      mid  = (start+end)/2;
       // which part is soreted
      if (array[start] <= array[mid]) {
          // left part sorted
          min = Math.min(min , array[start]);
          start = mid +1 ;
      }
      else {
          //right part sort

          min = Math.min(min, array[mid]);
          end = mid - 1;
      }
  }
  return min ;

    }
    public static int first_ocurence(int arr [ ],int target ){
//         lower bound
        int start = 0 ;
        int end = arr.length-1;
        int mid = 0 ;
        int first =  -1 ;

        while(start <= end ) {

            mid = (start + end) / 2;
            if(arr[mid]>= target){
                first = mid;
                end= mid -1 ;
            }else{

                start = mid +1;

            }


        }
        return first ;
    }
    public static int  last_ocuurence(int arr [], int target){
        int start = 0 ;
        int end = arr.length-1;
        int mid = 0 ;
        int last =-1;

        while(start <= end ){

             mid = (start+end)/2;
              if(arr[mid]>target){
                  last = mid ;

                  end= mid -1 ;
              }else{

                  start = mid +1;              }
        }
        return last;
    }
  public static void main (String args[]){
//      1) bineray search
//      int array [] ={ 2,4,5,6,7,9,10,13};
//        int key = 5 ;
//        Binary_search(array,key);

//      2)lower bound
//      int array[]={3,5,8,15,19};
//        int key = 13 ;
//        int index = lower_bound(array,key);
//        System.out.print("lower bound is :"+index);

//        3)upper bound
//
//        int array[]={3,5,8,15,19};
//        int key = 17;
//        int index = upper_bound(array,key);
//        System.out.print("upper bound is :"+index);

//      4)Search_in_sorted_rotated_array

//      int array []={4,5,6,7,0,1,2,3};
////      int target =0 ;
//      int index = Search_in_sorted_rotated_array(array,target);
//      if(index==-1){
//          System.out.println("keyy is not present in array ");
//      }else{
//          System.out.println("key is present on index : "+index);
//      }

//     4) int array []={4,5,6,7,8,0,1,2,3};
//      System.out.print("minimum is on sorted roteted array is  : "+minimum_in_roted_sorted_arry(array));

       int arr [ ]= {5,7,7,7,8,8,10};
       int target = 7 ;
     int first =  first_ocurence(arr,target);
      int last =  last_ocuurence(arr,target);

      if(first ==-1 || last==-1){
          System.out.print("[-1,-1]");
      }else {
          System.out.println("[" + first + "," + (last - 1) + "]");
      }






    }
}
