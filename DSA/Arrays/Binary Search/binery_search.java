public class binery_search {
    public static int binery_search(int numbers[], int key){
        int start = 0;
        int end = numbers.length;
        int mid = 0 ;
        while(start<end){
            mid = (start+end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }return -1;
    }
    public static void main (String urgs[]){
        int numbers [] = {2,4,6,8,10,12,14,16,18,20};
        int key = 18;
        int index=binery_search(numbers,key);
        if( index==-1){
            System.out.println("key is not found");
        }else{
            System.out.println("key is on index:"+index);
        }
    }
}
