package DSA.Divide_and_Conquer;

public class Merge_sort {//it is depth first ms hai
    public static void print_arr(int arr[]){
        //for printing array
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge_sort(int arr[],int si , int ei){
        if(si>ei){
            return;
        }
        if(si==ei){
            return;
        }
        int mid = si+(ei-si)/2;

        merge_sort(arr,si,mid);// left part
        merge_sort(arr,mid+1,ei);//right part
         merge(arr,si,ei,mid);//merging
    }
    public static void merge(int arr[], int si, int ei, int mid){
        //if si=0;ei=5 then array size is ei-si+1
        int temp[]= new int [ei-si+1];
        int i =si;//idx for first sorted part
        int j =mid+1;//idx for 2nd sorted part
        int k = 0 ;//idx for temp arr

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

    }
    public static void main (String args[]){
       int arr[]={1,2,4,3,5,6};
        merge_sort(arr,0,arr.length-1);
        print_arr(arr);

    }
}
