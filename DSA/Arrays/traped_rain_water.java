package DSA.Arrays;
public class traped_rain_water {
    public static int trapped_water(int height[]){
        int n = height.length;
        //find leftmax boundry
        int left_max []= new int [n];
        left_max[0]=height[0];
        for( int i =1 ; i<n ; i++ ){
            left_max[i]=Math.max(left_max[i-1],height[i]);
        }
        //find rightmaax boundry
        int right_max[]=new int [n];
        right_max[n-1]=height[n-1];
        for(int i = n-2; i>=0;i--){
            right_max[i]=Math.max(right_max[i+1],height[i]);
        }
        //loop waterlevel+tarpped water
        int trappedwater=0;
        for(int i = 0 ; i<n ;i++){
            int waterlevel = Math.min(left_max[i],right_max[i]);
            trappedwater = trappedwater+(waterlevel-height[i]);
        }
        return trappedwater;

    }
    public static void main(String urgs[]){
        int height[]={4,2,0,6,3,2,5};
       System.out.println("traped water is:"+trapped_water(height)) ;
    }
}
