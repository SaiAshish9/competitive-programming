import static java.lang.System.*;

public class Main {

    public static int searchInsert(int[] nums, int target) {
        return bs(nums, 0, nums.length - 1, target);
    }

    private static int bs(int[] nums, int start, int end, int target) {
        if (start > end) {
            return end + 1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] < target) {
            return bs(nums, mid + 1, end, target);
        }
        if (nums[mid] > target) {
            return bs(nums, start, mid - 1, target);
        }
        return mid;
    }

    public static void main(String... s) {
        out.println(searchInsert(new int[] { 2, 3, 4, 5, 6 }, 5));
    }
}