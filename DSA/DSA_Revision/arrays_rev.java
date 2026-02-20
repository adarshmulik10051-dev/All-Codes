package DSA.DSA_Revision;

import java.util.HashMap;

public class arrays_rev {
    public static int[] two_sum( int array[],int key) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int reqno = key - array[i];
            if (hm.containsKey(reqno)) {
                return new int[]{hm.get(reqno), i};
            }
            hm.put(array[i], i);
        }
        return new int[]{-1, -1};
    }
    public static int majority_ele(int arr[]){
        int count=0 ;
        int element=arr[0];

        for(int i = 0 ; i < arr.length;i++) {
            if (count == 0) {
                element = arr[i];
            } else if (element == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
        count=0;
        for(int i = 0 ; i < arr.length; i++){
            if(element==arr[i]){
                count++;
            }
        }
        if(count>arr.length/2){
            return element;
        }
        return -1;
    }
public static void main (String args[]){

        /*int arr[]={2,6,5,8,11};
        int [] idxs=two_sum(arr,14);
        System.out.println(idxs[0]+","+idxs[1]);*/


       /*2)majprity element in array greater than n/2
        int arr[]={5,5};
       int me=majority_ele(arr);
       System.out.println(me);*/




   }
}
