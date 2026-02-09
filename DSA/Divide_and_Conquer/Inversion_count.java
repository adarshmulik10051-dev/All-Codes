package DSA.Divide_and_Conquer;

public class Inversion_count {
    public static void print_arr(int arr[]){
        //for printing array
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int merge_sort(int arr[],int si , int ei){
        int count=0;
        if(si>=ei){
            return 0;
        }
        int mid = si+(ei-si)/2;

        int left=merge_sort(arr,si,mid);// left part
        int right=merge_sort(arr,mid+1,ei);//right part
        int both =merge(arr,si,ei,mid);//merging
        count = left+right+both;
          return count;

    }
    public static int merge(int arr[], int si, int ei, int mid){

        //if si=0;ei=5 then array size is ei-si+1
        int temp[]= new int [ei-si+1];
        int i =si;//idx for first sorted part
        int j =mid+1;//idx for 2nd sorted part
        int k = 0 ;//idx for temp arr
        int count= 0 ;
        while(i <= mid && j <=ei ){
            if(arr[i]<arr[j]){

                temp[k]= arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
                count+=(mid-i+1);
            }

        }
        // left over element for 1st sorted part
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        //right over element for 1st sorted part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy for temp array to arr
        for( k = 0 ,i = si ; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

      return count;
    }

    public static void main (String args[]){
        int arr[]={13,12,11,10};
      int ans=  merge_sort(arr,0,arr.length-1);
      System.out.println("inversion count is:"+ans);


    }
}
