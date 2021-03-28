import java.util.*;

class Main {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int max = nums[nums.length -1];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] + 3 * max < target) {
                continue;
            }
            if (nums[i] * 4 > target) {
                break;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int start = j + 1;
                int end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> tmp = new LinkedList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[start]);
                        tmp.add(nums[end]);
                        result.add(tmp);
                        int startVal = nums[start];
                        int endVal = nums[end];
                        while (start < end && startVal == nums[start]) {
                            start ++;
                        }
                        while (start < end && endVal == nums[end]) {
                            end --;
                        }
                    }
                    else if (sum < target) {
                        start ++;
                    }       
                    else {
                        end --;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String ...s){
      Main m = new Main();
      System.out.println(m.fourSum(new int[]{1,0,-1,0,-2,2},0).toString());
    }

}