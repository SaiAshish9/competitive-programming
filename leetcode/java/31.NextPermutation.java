import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

class Main{

// Here are the steps we need to follow to solve the problem:
// 1 From right to left, find the first element that is violating the increase trend, this is called PartitionNumber
// 2 From right to left, find the first element that is larger than PartitionNumber, this is called ChangeNumber.
// 3 Switch PartitionNumber and ChangeNumber
// 4 Reverse all the digit on the right of particionNumber ( Original index)

  public static void nextPermutation(int nums[]){
    int paNumIndex = -1;
        for (int i = nums.length - 1; i >0; i --){
            if (nums[i-1] < nums[i]){ 
                paNumIndex = i-1; 
                break; 
            } 
        } 
        if (paNumIndex != -1){ 
            int chNumIndex = -1;
            for (int i = nums.length - 1; i > paNumIndex; i --){
                if (nums[i] > nums[paNumIndex]){
                    chNumIndex = i;
                    break;
                }
            }
            int tmp = nums[paNumIndex];
            nums[paNumIndex] = nums[chNumIndex];
            nums[chNumIndex] = tmp;
        }
        int start = paNumIndex + 1, end = nums.length -1;
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start ++;
            end --;
        }
    List<Integer> x = Arrays.stream(nums).boxed().collect(Collectors.toList());
    x.stream().forEach(System.out::print);
  }

  public static void main(String ...s){
    nextPermutation(new int[]{1,2,3});
  }
  
}