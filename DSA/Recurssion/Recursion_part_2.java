package DSA.Recurssion;

public class Recursion_part_2 {
    public static int tiling_problem(int n ){ //where n is th siz of floar 2*n
        if(n==0||n==1){

            return 1 ;
        }

        int vertical_ways = tiling_problem(n-1);

        int horizontal_ways = tiling_problem(n-2);

        int total_ways = vertical_ways+horizontal_ways;

        return total_ways;
    }
    public static void remove_duplicate(String str ,int idx,  StringBuilder newstr,boolean map []){
        if(idx==str.length()){
            System.out.print(newstr);
            return;
        }
         char curr = str.charAt(idx);
        if(map[curr-'a']==true){
            remove_duplicate(str,idx+1,newstr, map);
        }
        else{
           map[ curr-'a']=true;
           remove_duplicate(str,idx+1,newstr.append(curr),map);
        }
    }
    public static int pairing_ways(int n){
        if(n==1||n==2){
            return n;
        }
        //choice
        //singe
        int single_way=pairing_ways(n-1);
        //pairs
        int pairing = pairing_ways(n-2);
        int pairing_way= (n-1)*pairing;//(n-1) will choices 1 with remaining(n-1)
        //total ways
        int total_ways = single_way+pairing_way;
        return total_ways;

        //qnother way
        // return pairing_way(n-1)+(n-1)*pairing_way(n-2);
    }
    public static void binary_String(int n , int lastpo,String str){
        if(n==0){
            System.out.println(str);
            return ;
        }
        binary_String(n-1 ,0,str+"0");
        if(lastpo==0){
            binary_String(n-1,1,str+"1");
        }

    }

    public static void main(String args[]){
//     1)tiling problem
//        int n = 4 ;
//        System.out.println(tiling_problem(n));

//        2)remove duplicates in strings
//        String str = "appnacollege";
//        int idx =0 ;
//        StringBuilder newstr = new StringBuilder();
//        boolean map [] = new boolean [26];
//        remove_duplicate(str,idx,newstr,map);

//        int n = 3;
//        System.out.println(pairing_ways(n));

        binary_String(3,0,"");

    }
}
