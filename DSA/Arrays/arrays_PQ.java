package DSA.Arrays;
public class arrays_PQ {
    public static boolean duplicate_in_array(int arrays[]){
        for(int i = 0 ;i<arrays.length-1;i++ ){
            for(int j = i+1; j<arrays.length;j++){
                if(arrays[i]==arrays[j]){
                    return true;
                }
            }
        }return false;
    }
    public static void main(String urgs[]){
        int arrays []= {1,2,3,4};
      System.out.println(duplicate_in_array(arrays))  ;
    }
}
