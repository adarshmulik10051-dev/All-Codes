package JavaBasic.Patterns.Basicpatterns;
public class pyramid_no_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i =1 ;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i-j>=0){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
}     /*1
        12
        123
        1234
        1234*/
