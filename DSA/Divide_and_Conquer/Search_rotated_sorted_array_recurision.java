package DSA.Divide_and_Conquer;

public class Search_rotated_sorted_array_recurision {
    public static int search(int arr[], int si ,int ei,int target){
     if(si>ei){
         return -1 ;
     }
        int mid = si+(ei-si)/2;
       // case found
        if(arr[mid]==target){
            return mid ;
        }
      // case1:mid on line 1;
      if(arr[si]<=arr[mid]){
          //case a : left of line 1
          if(arr[si]<=target&&target<=arr[mid]){
            return  search(arr,si,mid-1,target);
          }
          //ase b:right og line 1
          else{
            return  search(arr,mid+1,ei,target);
          }

      }
     // case2:mid on line 2
      else{
          //case c:left of line 2
          if(arr[mid]<=target && target<=arr[ei]){
          return search(arr,mid+1,ei,target);
          }else{
          return search(arr,si,mid-1,target);
          }

      }

    }
    public static void main (String args[]){
        int arr[]={4,5,6,1,2,3};
        int target= 6;
        int idx = search(arr,0,arr.length-1,target);
        System.out.println("target is present on :"+idx);

    }
}
