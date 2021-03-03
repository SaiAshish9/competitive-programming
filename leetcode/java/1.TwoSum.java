package com.programming;
import java.util.*;

public class TwoSum {

        private static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[] { numMap.get(complement), i };
                } else {
                    numMap.put(nums[i], i);
                }
            }
            return new int[] {};
        }


    public static void main(String[] args) {
        int ans[] = twoSum(new int[]{1,5,4}, 5);
        Arrays.stream(ans).forEach(System.out::println);
    }

}
