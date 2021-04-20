class Solution {
  public int removeElement(int[] nums, int val) {
      int start = 0, end = nums.length -1;
      while (start <= end) {
          if (nums[start] != val) {
              start ++;
              continue;
          }
          if (nums[end] == val) {
              end --;
              continue;
          }
          nums[start] = nums[end];
          start ++;
          end --;
      }
      return start;
  }
}

// import java.util.*;
// import java.util.stream.Collectors;
// class Main
//   public static int removeElement(int[] nums,int val){
//    List<Integer> arr = Arrays.stream(nums).boxed().collect(Collectors.toList());
//    arr = arr.stream().filter(x->x!=val)
//    .collect(Collectors.toList())
//    ;
//    // Integer[] x = arr.toArray();
//    nums = arr.stream().mapToInt(i->i)   .toArray();
//   System.out.println(nums[0]+" "+nums[1]);
//    return arr.size();
//   }

//   public static void main(String ...s){
//     System.out.println(removeElement(new int[]{3,2,2,3},3));
//   }

// }