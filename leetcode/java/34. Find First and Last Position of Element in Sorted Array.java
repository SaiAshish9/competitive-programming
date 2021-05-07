import java.util.Arrays;

class Main {

    public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[2];
        res[0] = -1;
        boolean has = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left++;
            } else if (nums[mid] == target) {
                has = true;
                right--;
            } else {
                right--;
            }
        }
        if (has) {
            res[0] = left;
        }
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left++;
            } else {
                right--;
            }
        }
        if (has) {
            res[1] = right;
        }
        return res;
    }

    public static void main(String... s) {
        System.out.println(Arrays.toString(searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8)));
    }
}