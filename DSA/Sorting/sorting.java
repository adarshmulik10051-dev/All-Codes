package DSA.Sorting;
public class sorting {
    public static void bubble_sort(int arr[]){
        for(int turn  = 0; turn<arr.length-1;turn++ ){
            for(int j = 0; j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


    public static void selection_sort(int arr[]){
        for(int i =0 ; i<arr.length-1;i++){
            int min_pos= i ;
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[min_pos] > arr[j]){
                    min_pos = j;
                }
            }
            int temp  = arr[min_pos];
            arr[min_pos]=arr[i];
            arr[i]=temp;
        }
    }


    public static void insertion_sort(int arr[]){
        for(int i = 1 ; i<arr.length;i++){
            //pick
            int curr = arr[i];
            int prev = i-1;
            //slide
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insert
            arr[prev+1]=curr;
        }

    }


    public static void counting_sort(int arr[]){
        // find largest for length of count array
        int max = Integer.MIN_VALUE;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //make count array for freq
        int count [] = new int[max+1];
        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;
        }
        // rebulid sorted array from using count
        int index = 0;
        for(int i = 0 ; i<=max ; i++){
            while(count[i]>0){
              arr[index]=i;
              index++;
              count[i]--;
            }
        }
    }


    public static void counting_sort2(int arr[]){
        //max_element for size of  cont array
        int max = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length;i++){
            if(max<arr[i]){
                max= arr[i];
            }
        }
      //  create count array for freq
        int count []= new int[max+1];
        for(int i =0 ; i<arr.length;i++){
            count[arr[i]]++;
        }
        // track freq and print sorted array
        for(int i = 0; i<=max;i++){
            int freq = count[i];
            while(freq>0){
                System.out.print(i+" ");
                freq--;
            }
        }
    }

    public static void print_arr(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String urgs[]){
        int arr[] = {5,4,1,3,2,1,3,2,5};
//        bubble_sort(arr);
       selection_sort(arr);
//        insertion_sort(arr);
//        counting_sort2(arr);
        print_arr(arr);


    }
}
