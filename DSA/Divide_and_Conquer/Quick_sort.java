package DSA.Divide_and_Conquer;

public class Quick_sort {
    public static void print_arr(int arr[]){
        for(int i = 0 ;i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quick_sort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int Pidx =partion(arr,si,ei);
        quick_sort(arr,si,Pidx-1);//left
        quick_sort(arr,Pidx+1,ei);//right

    }
    public static int partion(int arr[],int si, int ei){
        int pivot =arr[ei];
        int i = si-1;
        for(int j = si ; j< ei;j++){

            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i]=temp;
            }
        }
        //swap for pivot to i pos and return i
        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String args[]){
        int arr[]={6,3,9,8,2,5};
        quick_sort(arr,0, arr.length-1);
        print_arr(arr);

    }
}
