
package DSA.Arrays;
public class arrays_Strivers_easy {
    public static int sec_largest(int nums[]){
        int sec_larg = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i<nums.length;i++){
            if (largest<nums[i]){
                sec_larg=largest;
                largest=nums[i];
            }else if(sec_larg<nums[i]&&nums[i]!=largest){
                sec_larg = nums[i];

            }
        }return sec_larg;
    }
    public static boolean cheak_sorted(int nums[]){
        for(int i = 1 ;i<nums.length;i++){

            if(nums[i]<=nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static int remove_duplicate(int nums[]){
        int j = 0;
        for(int i = 0 ; i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i];
            }
        }
        nums[j++] = nums[nums.length - 1];
        return j ;
    }
    public static int move_all_zero_to_end(int nums[]){
        int j = 0 ;
        for(int i = 0 ; i<nums.length-1;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }nums[j++]=nums[nums.length-1];
        while(j<nums.length){
            nums[j++]=0;
        }
        return j;
    }
    public static int two_sum(int nums[],int target){
        for(int i = 0 ; i <nums.length; i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.print("index is:"+i+","+j);
                    break;
                }
            }
        }
        return -1;
    }
    public static void leaders(int nums[]){
        int max_right= nums[nums.length-1];
        for(int i= nums.length-2; i>0;i--){
            if(max_right<nums[i]){
                max_right=nums[i];
                System.out.print(max_right+",");
            }
        }
    }
    public static void main (String urgs[]){
        int nums[]= {5,12,7,1,4,2};

//      System.out.println("second largest no in arrays is:"+sec_largest(nums))  ;

//      boolean  cheak =cheak_sorted(nums);
//      if(cheak == true){
//          System.out.println("Array is sorted!!!");
//      }else{
//          System.out.println("Array is not sorted!!!");
//      }


//      int n = move_all_zero_to_end(nums);
//      for(int i = 0; i<n;i++){
//          System.out.print(nums[i]+" ");
//      }


//        int target = 7;
//        two_sum(nums,target);

        leaders(nums);

    }
}
