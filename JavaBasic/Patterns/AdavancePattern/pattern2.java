package JavaBasic.Patterns.AdavancePattern;
import java.util.*;
public class pattern2 {
    public static void hollow_rectangle(int row,int column){
        for(int i = 1 ; i <= row; i++){
            for(int j = 1 ; j<=column; j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
                                        /******
                                         *    *
                                         *    *
                                         *    *
                                         ******/
        }
    }
    public static void left_bottom(int row ){
        for ( int i = 1 ; i<= row; i++){
            for( int j = 1 ; j <= row; j++){
                if ( i+j>= row+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           /*
           **
          ***
         ****/
        }
    }
    public static void upper_tringular_no(int row){
        for ( int i = 1 ; i<= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i + j <= row + 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*1234
          123
          12
          1*/
    }
    public static void floid_tri(int row){
        int counter= 1;
        for (int i = 1 ; i <= row; i++){
            for(int j = 1 ; j <=row; j++){
                if(i-j>=0){
                    System.out.print(counter+" ");
                    counter++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }/*1
           2 3
           4 5 6
           7 8 9 10*/
    }
    public static void triangle_1_0(int row){
        for (int i = 1 ; i<= row; i++){
            for (int j = 1; j<=i; j++){
                if((i-j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int row){
        for( int i = 1 ; i<= row; i++){
            for (int j= 1 ; j<= row;j++){
                if(i-j>=0||i+j>=row+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
        for( int i = row ; i>= 1; i--){
            for (int j= 1 ; j<= row;j++){
                if(i-j>=0||i+j>=row+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }

    }
    public static void buterfly_2(int row){
        for(int i = 1 ; i<= row; i++){
            //for star
            for(int j = 1 ; j<= i;j++){
                System.out.print("*");
            }
            //vspace
            for(int j = 1 ; j<= 2*(row-i);j++){
                System.out.print(" ");
            }
            // for star
            for (int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for ( int i = row ; i >= 1; i--){
            //for star
            for(int j = 1 ; j<= i;j++){
                System.out.print("*");
            }
            //vspace
            for(int j = 1 ; j<= 2*(row-i);j++){
                System.out.print(" ");
            }
            // for star
            for (int j = 1 ; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_rhombus(int row){
        for(int i = 1; i <= row; i++ ){
            //for space
            for(int j = 1 ; j <= row - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
  /*****
 *****
*****/

    }
    public static void Hollo_rohobus(int row){
        for(int i = 1; i<= row; i++){
            //for space
            for(int j = 1 ; j<= row-i; j++){
                System.out.print(" ");
            }
            //print hollo recangle
            for(int j = 1 ; j<= row; j++){
                if(i==1||i==row||j==1||j==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int row){
        for(int i = 1; i <= row;i++){
            // for space
            for(int j = 1; j<= row-i; j++){
                    System.out.print(" ");
            }
            for(int j= 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = row ; i>=1 ;i--){
            // for space
            for(int j = 1; j<= row-i; j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
  //       int column = sc.nextInt();
  //      hollow_rectangle(row,column);
  //            left_bottom(row)
  //          upper_tringular_no(row);
  //      floid_tri(row);
  //      triangle_1_0(row);
  //      butterfly(row);
  //      buterfly_2(row);
 //       solid_rhombus(row);
 //       Hollo_rohobus(row);
        diamond(row);
    }
}
