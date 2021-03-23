import java.util.*;

public class Main {
    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int closed = 0;
        for (int i = 0; i < nums.length; i ++){
            if (i == 0 || nums[i] != nums[i-1]){
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end){
                    int sum = nums[i] + nums[start] + nums[end];
                    if (Math.abs(sum - target) < min){
                        min = Math.abs(sum - target);
                        closed = sum;
                    }
                    if (sum < target){ 
                        start ++; } 
                    else{ 
                        end --;
                    }
                }
             }
        }
        return closed;
    }

    public static void main(String ...s){
      System.out.println(threeSumClosest(new int[]{-1,3,3},5));
    }

}