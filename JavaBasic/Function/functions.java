package JavaBasic.Function;
import java .util.*;
public class functions {
    public static int calculate_sum(int a , int b){
        int sum= a+b;
        return sum;
    }
    public static void swap(int a, int b ){
        int temp = a;
        a = b;
        b =temp;
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
    public static int product(int a , int b){
        int product= a*b;
        return product;
    }
    public static int factorial(int n){
        int fact=1;
      for(int i = n ; i>=1;i--)  {
          fact*=i;
      }
      return fact;
    }
    public static int bicoff(int n ,int r ){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int bicoff = fact_n/(fact_r*fact_nmr);
        return bicoff;

    }
    public static int avrage_three_no(int a, int b, int c){
        int avrage = (a+b+c)/3;
        return avrage;
    }
    public static void palimdrome(int n ){
        int last_digit = 0;
        int rev_no = 0;
        int my_no  = n;
        while(n>0){
            last_digit= n %10;
            rev_no= rev_no*10+last_digit;
            n= n/10;
        }if(my_no==rev_no){
            System.out.println(my_no+" is the palimdrome number");
        }else{
            System.out.println(my_no+" is not palimdrome number");
        }

    }
    public static int Sum_of_digit(int n ){
        int last_digit= 0;
        int sum = 0;
        while(n>0){
            last_digit=n%10;
            sum+=last_digit;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        System.out.print("Enter a first no:");
//        int a = sc.nextInt();
//        System.out.print("Enter a sec no:");
//        int b = sc.nextInt();
//        System.out.print("Enter a third no:");
//        int c = sc.nextInt();
        System.out.print("Enter a no:");
        int n = sc.nextInt();

//        int sum = calculate_sum(a,b);
//       System.out.println("sum is:"+sum);

//        swap(a,b);

//        int prod=  product(a,b);
//        System.out.println("prod is:"+prod);

//         System.out.println("factorial is:"+factorial(n));

      /*  System.out.print("Enter a value of n:");
        int n = sc.nextInt();
        System.out.print("Enter a value of r:");
        int r = sc.nextInt();
       System.out.println("bicofficient is:"+ bicoff(n,r));*/


//        System.out.println("avarage of three no:"+avrage_three_no(a,b,c));

//        palimdrome(n);

 //      System.out.println("sum of digit:"+ Sum_of_digit(n));









    }
}
