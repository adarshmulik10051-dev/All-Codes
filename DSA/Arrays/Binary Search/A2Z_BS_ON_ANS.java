import java .util.*;
public class A2Z_BS_ON_ANS {
    public static int calculate_hour(int piles[],int k ){
        int hours = 0;
        for(int i= 0; i<= piles.length-1;i++){
            if(piles[i]%k==0){//k==mid
                hours = hours+(piles[i]/k);
            }else{
                hours = hours+(piles[i]/k)+1;
            }
        }
        return hours;
    }
    public static void  calc_total_hour(int piles[], int hour ) {// k is that min no of bannna which eat koko
        // to find max in piles
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        // for k value which give min H 1 to max
        int start = 1;
        int end = max;
        int min_hour = 0;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (calculate_hour(piles, mid) <= hour) {//mid==k
                min_hour = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("coco need eat min banana to finish all in given hours: " + min_hour);
    }

        public static void search_in_two_sorted_array(int num1[],int num2[],int n ,int m,int key){
            int union[]= new int [m+n];
            int i =0 ;
            int j =0;
            int k = 0 ;
             while(i<n&& j<m){
                  if(num1[i] < num2[j] ){
                      if ( k==0  || union[k-1]!=num1[i]){
                          union[k++]= num1[i];
                      }
                      i++;
                  }else if(num1[i]>num2[j]){
                      if(k==0 || union[k-1]!=num2[j]){
                          union[k++]= num2[j];
                      }
                      j++;
                  }
                  else{//num1 i == num 2 j
                      if(k==0 || union[k-1]!= num1[i]){
                          union[k++]= num1[i];
                      }
                      i++;
                      j++;
                  }

             }
            while(i<n){
                if(k==0||union[k-1]!=num1[i]){
                    union[k++]=num1[i];
                }
                i++;
            }
            while(j<m){
                if(k==0 || union[k-1]!=num2[j]){
                    union[k++]=num2[j];
                }
                j++;
            }

            int start = 0 ;
            int end = k-1 ;
            int mid = 0;
            int index = -1;
            while(start<= end ){
                mid =(start+end)/2;
                if(union[mid]==key){
                    index = mid;
                    break;
                }else if(union[mid]<=key){
                    start = mid +1;
                }else{
                    end = mid-1;
                }

            }
            System.out.println("index on present :"+index);
        }
        public static void sqrt_root(int n ){
          int start = 0  ;
          int end = n;
          int mid =0 ;
          int ans = 0;
           while(start <= end ){

               mid = (start + end)/2;

               if(mid*mid<=n){
                   ans=mid;
                   start = mid +1;
               }
               else{

                   end=mid-1;
               }
           }
           System.out.println("sqrt is: "+ans );
        }
        public static int N_th_root(int n , int m){
         int start = 1;
          int end = m;
          int mid = 0;


          while(start <= end){
              mid =(start +end)/2;

              int power = 1 ;//every time 1 pahije mid change zala ki mnun
              for(int i = 0 ; i < n ;i++){
                  power=power*mid;
                  if(power>m){
                      break;
                  }
              }
              if(power==m){
                  return mid;
              }else if (power < m){
                  start = mid +1;
              }else{
                  end = mid -1 ;
              }
          }return -1;
        }
        public static void median_of_two_sorted(int num1[],int num2[],int n, int m){
        int union []= new int [m+n];
        int i = 0 ; int j = 0 ; int k = 0 ;
             while(i < n && j < m ){
                 if(num1[i]<num2[j]){
                     union[k++]= num1[i++];
                 }
                 else{
                     union[k++]=num2[j++];
                 }
             }
             while(i < n ){
                 union[k++]= num1[i++];
             }
            while(j < m ){
                union[k++]= num2[j++];
            }
            double median = 0;

            if( k%2==0){
                median =( union[k/2-1]+union[k/2])/2.0;
            }else{
                median = union[k/2]/2.0;
            }
            System.out.println("Median is: " + median);



        }
        public static void main (String args[]){

    //      1)coco eat banana
    //      int piles []= {3,7,6,11};
    //        int hour = 8 ;
    //        calc_total_hour(piles,hour);

//            2)find k th in two sorted array
//            int num1[] ={1,2,4,5};
//            int num2[]={2,3,5,6};
//            int n = num1.length;
//            int m =num2.length;
//            int key = 4;
//            search_in_two_sorted_array(num1,num2, n ,m,key);

//           3) suare root
//           int n = 50;
//            sqrt_root(n);

//           4) n_th root 
            int n = 3;
            int m = 125;
          int root =   N_th_root(n,m);
          System.out.println("n_th root is : "+root);

//
//            int num1 []={2,4,6};
//            int num2[]={1,3,5};
//            int n = num1.length;
//            int m = num2.length;
//            median_of_two_sorted(num1,num2,n,m);


        }
    }
