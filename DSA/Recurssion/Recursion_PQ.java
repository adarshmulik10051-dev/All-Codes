package DSA.Recurssion;

public class Recursion_PQ {
    public static void count_indices(int arr[],int idx,int key){

        if(idx== arr.length){
            return;
        }
        if(arr[idx]==key){
            System.out.print(idx+" ");
        }
        count_indices(arr,idx+1,key);
    }
    static String digit[]= {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    public static void printdigit(int number){

        if(number==0){
            return ;
        }
        int lastdigit = number%10;
        printdigit(number/10);
        System.out.print(digit[lastdigit]+" ");

    }
    public static void toh(int n , int  A,int C, int B){//move n disk from A TO C using B
        if(n==0){
            return ;
        }
        toh(n-1,A,B,C);
        System.out.println("move"+n+"th disk from"+A+"to"+C);
        toh(n-1,B,C,A);
    }
    public static int countsub(String str , int si, int ei){
        if(si>ei){
            return 0;
        }
        if(si==ei){
            return  1;
        }
        int firstLremove = countsub(str,si+1,ei);

        int lastLremove =countsub(str,si,ei-1);

        int firstlastLremove= countsub(str,si+1,ei-1);//common sub string in both

        int ans = firstLremove+lastLremove-firstlastLremove;

        if(str.charAt(si)==str.charAt(ei)){
            ans++;
        }
        return ans ;
    }
    public static void main(String args[]){
//      1) count indices
//     int arr [ ]= {3,2,4,5,6,2,7,2,2};
//     count_indices(arr,0,2);

//       2) number to digit
//        printdigit(1234);

//       toh(3,10,30,20);
        String str = "abcab";
        int ei =str.length()-1;
        int ans=countsub(str,0,ei);
        System.out.println(ans);


    }
}

