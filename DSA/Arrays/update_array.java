package DSA.Arrays;
public class update_array {
    public static void update(int marks[]){
        for( int i = 0 ; i<marks.length; i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void main(String urgs[]){
        int marks[]={97,98,99};
        update(marks);
        //for printing
        for(int i = 0 ; i < marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
