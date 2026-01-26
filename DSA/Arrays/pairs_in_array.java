package DSA.Arrays;
public class pairs_in_array {
    public static void pairs(int array[]){
        for(int i = 0; i< array.length;i++){
            int curr = array[i];
            for (int j = i+1; j<array.length;j++ ){
                System.out.print("("+curr +","+array[j]+")");
            }
            System.out.println();
        }
    }
    public static void main (String urgs[]){
        int array [] = {2,4,6,8,10};
        pairs(array);
    }
}
