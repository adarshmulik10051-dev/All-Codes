import java.util.*;
public class ArrayLists {
    public static void main (String args[]){
           //1.what is ArrayList:
           // ArrayList is class in java that Store multipl element 
           // in dynamic array.
           //array vs ArrayList :
           // array--> fixed sizze 
           //ArrayList --> Dynamic size 
           //Array--> array can be store primitive data types 
           //ex- int ,char, String,bool,float,long,Double
           //ArrayList--> cannot be store primitive data type it can store class
           //ex- Integer , String , Boolean,Float
           
           //2. How to define ArrayList:
           //ArrayList<Class> Name = new ArrayList<>();
             ArrayList<Integer> List = new ArrayList<>();
           //ArrayList<String> List2 = new ArrayList<>();
           //ArrayList<Float>  List3 = new ArrayList<>();
           //ArrayList<String> List4 = new ArrayList<>();

           //3.how to get size of the ArrayList:-o(1)
           //.Size() -method 
           System.out.println(List.size());//initially-0

           //4.how to add element in Arraylist:-o(1)
           //4.1 add()-method
           //Add at the end -
           List.add(1);
           List.add(2);
           //Add at Specific index :-o(n)
           List.add(2,3);
           List.add(3,4);
           System.out.println(List);
           System.out.println("Size of ArrayList is :"+List.size());

           //5.How to get element from ArrayList : -o(1)
           //5.1.get()-Method -o(1)
           int ele = List.get(2);
           System.out.println("Element at index 2 is : "+ele);

           //6.how to remove element from ArrayList : -o(n)
           //6.1 .remove(idx)
           List.remove(2);
           System.out.println(List);

           //7.How to replace element in ArrayList:-o(n)
           //7.1 .set(idx,val)
           List.set(2,100);
           System.out.println(List);

           //8.How to  cheak wheather the  element  present  in ArrayList:-o(n)
           //8.1 .contains()-method 
           boolean ele2=List.contains(100);
           boolean ele3=List.contains(99);
           System.out.println(ele2);
           System.out.println(ele3);

           //8.2 how to print the element from ArrayList

           for(int i = 0 ; i < List.size(); i++){
                System.out.print(List.get(i)+" ");
           }
            System.out.println();

           //9.How to sort ArrayList:-->Collections class -->Collection.sort(List); 
           //9.1 Acending sorting:0(nlogn);
           Collections.sort(List);
           System.out.println(List);

           //9.2 Decending Order:0(nlogn)
           Collections.sort(List,Collections.reverseOrder());
           System.out.println(List);

           //ArrayList Implementation :
           /*
              *internal working
              *when created ArrayList :
              *ArrayList<Integer> List = new ArrayList<>();
              *
              *java create internally array.
              *Example: 
              *[10,20,30]
              * If Array becomes full:
              * [10,20,30] 
              *And we  add:
              *List.add(40);
              *
              * java create bigger array :
              * [10,20,30,40]
              * copied old element in new array.
              * this why ArrayList is dynaymic Array.
              * 
            * Advantages
             * Dynamic size
             * Easy insertion
             * Built-in methods
             * 
             * Disadvantages
             * Extra memory used
             * Shifting required during insertion/removal
              
            */

           //Multi-dimentional ArrayList:
           ArrayList<Integer> List1 = new ArrayList<>();
           List1.add(1);
           List1.add(2);
          
           ArrayList<Integer> List2 =new ArrayList<>();
           List2.add(3);
           List2.add(4);

          ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
           mainList.add(List1);
           mainList.add(List2);
           
           System.out.println(mainList);

           for(int i = 0 ; i < mainList.size();i++){
            ArrayList<Integer> currList =mainList.get(i);
            for(int j =0 ; j < currList.size();j++){
               System.out.print(currList.get(j)+" ");
            }
            System.out.println();
           }



           
           
           //Queations by ac:
           //1.print the reverse of the ArrayList:o(n)+o(1)
           ArrayList<Integer> reverse = new ArrayList<>();
           reverse.add(1);
           reverse.add(2);
           reverse.add(4);
           reverse.add(8);
           reverse.add(16);
           for(int i = reverse.size()-1; i>=0 ; i --){
                System.out.print(reverse.get(i)+" ");
           }
           System.out.println();

           //2. Maximum number in ArrayList :o(n)
           int maxNum = Integer.MIN_VALUE;
            for(int i = 0  ; i < reverse.size(); i++ ){
                if(maxNum<reverse.get(i)){
                  maxNum=reverse.get(i);
                }
            }
            System.out.println("Maxium number in array is: "+maxNum);
          
           //3.Swap two numbers : 
           ArrayList<Integer> swap = new ArrayList<>();
           swap.add(10);
           swap.add(20);
           swap.add(30);
           swap.add(40);
           swap.add(50);
           int idx1 =1;
           int idx2 =2;
           System.out.println(swap);

           int temp = swap.get(idx1);
           swap.set(idx1,swap.get(idx2));
           swap.set(idx2,temp);

           System.out.println(swap);

           //4.Make MultiDimensional ArrayList:
           /*1 2 3 4 5
           2 4 6 8 10
           3 6 9 12 15*/
          ArrayList<Integer> List5 = new ArrayList<>();
          ArrayList<Integer> List6 = new ArrayList<>();
          ArrayList<Integer> List7 = new ArrayList<>();
          for(int i = 0  ; i <=5 ; i++){
            List5.add(i*1);
            List6.add(i*2);
            List7.add(i*3);
          }
           ArrayList<ArrayList<Integer>> mainList1 = new ArrayList<>();
           mainList1.add(List5);
           mainList1.add(List6);
           mainList1.add(List7);
           System.out.println(mainList1);

           //5.Continer with most water :
           //5.1 brute force :o(n^2);
           ArrayList<Integer> Height =new ArrayList<>();
           Height.add(1);
           Height.add(8);
           Height.add(6);
           Height.add(2);
           Height.add(5);
           Height.add(4);
           Height.add(8);
           Height.add(3);
           Height.add(7);
           System.out.println( "Container with max water is:"+ContainerWithmwBF(Height));

           //5.2. Optimal Apporoch :o(n)
           System.out.println( "Container with max water is:"+ContainerWithmwOP(Height));

           //6. Pair-sum in sorted arrayList:
           ArrayList<Integer> nums =new ArrayList<>();
           nums.add(1);
           nums.add(2);
           nums.add(3);
           nums.add(4);
           nums.add(5);
          

           //6.1 Brute force:o(n^2)
           int target = 5;
           System.out.println(PairSumBF(nums, target));

           //6.2 Optimal Apporoch:
           System.out.println(PairSumOP(nums, target));


           //7.pairsum in sorted rotated arrayList:
           ArrayList<Integer>nums1 = new ArrayList<>();
           nums1.add(11);
           nums1.add(15);
           nums1.add(6);
           nums1.add(8);
           nums1.add(9);
           nums1.add(10);
           int n =nums1.size();
           int target1=16;
           System.out.println(sumRotatedSortedArray(nums1, target1, n));
           
          }
           //**5.1 //Brute Approch:o(n^2).
           public static int ContainerWithmwBF( ArrayList<Integer>Height){
            //Brute force:o(n^2).
             int maxwater = Integer.MIN_VALUE;
             int currMax=0;
             
              for(int i =  0 ; i < Height.size() ; i ++ ){
                for( int j= i+1; j < Height.size(); j++){
                 int ht=Math.min(Height.get(i),Height.get(j));
                 int wd = j-i;
                  currMax=ht*wd;
                }
               maxwater= Math.max(currMax,maxwater);

              }
              return maxwater;
           }

          //**5.2Optimal Approch :o(n).
           public static int ContainerWithmwOP(ArrayList<Integer>Height) {
            int lp = 0 ;
            int rp = Height.size()-1;
            int maxwater=Integer.MIN_VALUE;
            int currWater=0;
            while(lp<rp){
              int ht=Math.min(Height.get(lp),Height.get(rp));
              int wd = rp-lp;
              currWater = ht*wd;
              if(Height.get(lp)<Height.get(rp)){
                lp++;
              }
              else{
                rp--;
              }
              maxwater=Math.max(currWater,maxwater);
            }
             return maxwater;

            
           }
           //*6.1PairSumBF:o(n^2) */
           public static boolean PairSumBF(ArrayList<Integer>nums,int target) {
            for(int i = 0 ; i< nums.size() ; i ++){
              for(int j = i + 1 ; j < nums.size(); j++){
                if(nums.get(i)+nums.get(j)==target){
                  int idx1= i ;
                  int idx2=j;
                  System.out.println("present on idx:"+idx1+","+idx2);
                  return true;
                }
              }
            }
            return false;
           }

           //6.2pairsum: optimal approch: two pointer:o(n)
           public static boolean PairSumOP(ArrayList<Integer>nums,int target){

            int lp = 0 ;
            int rp = nums.size()-1;
            while(lp<rp){
              if(nums.get(lp)+nums.get(rp)==target){
                System.out.println("present on idx:"+lp+","+rp);
                return true;
              }
              else if(nums.get(lp)+nums.get(rp)<target){
                lp++;
              }
              else{
                rp--;
              }
            }
            return false;

           }
           //7.find sum in rotated sorted arraylist
           public static boolean sumRotatedSortedArray(ArrayList<Integer>nums1,int target,int n){

            int bp = -1;
              for(int i = 0 ;  i < n-1 ; i ++){
                if(nums1.get(i)>nums1.get(i+1)){
                  bp=i;
                  break;
                }
              }
             
              int lp = bp+1;
              int rp = bp;
              while(lp!=rp){

                if(nums1.get(lp)+nums1.get(rp)==target){

                  return true;

                }
                if(nums1.get(lp)+nums1.get(rp)<target){

                  lp=(lp+1)%n;

                }
                else{

                  rp=(n+rp-1)%n;

                }
              }
              return false;
           }
           
    }

