package DSA.Divide_and_Conquer;

public class Merge_sort_String {
    public static void print_arr(String arr[]){
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge_sort(String arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        merge_sort(arr,si,mid);//left part

        merge_sort(arr,mid+1,ei);//right part
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si, int mid,int ei){
        String temp[]=new String [ei-si+1];
        int i = si;
        int j = mid+1;
        int k =  0;
        while(i<=mid && j<=ei){

          if(arr[i].compareTo(arr[j])<0){
              temp[k++]=arr[i++];

          }else{
              temp[k++]=arr[j++];

          }

        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for( k=0,i=si;k <temp.length;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        String arr[]={"yash","sarthak","jeevan","adarsh"};
        int n = arr.length-1;
        merge_sort(arr,0,n);
        print_arr(arr);
    }
}
