import java.io.*;

class Main{

  static PrintStream ps = System.out;

  public static int trap(int[] height){

  //   store the maximum height upto the current index in a separate array . Start storing the maximum index in reverse order and compute the difference at a given index between 2 arrays as per the algorithm.

       if (height.length == 0) {
            return 0;
        }
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int max = height[0];
        left[0] = height[0];
        for (int i = 1; i < height.length; i ++) {
            if (height[i] > max) {
                max = height[i];
            }
            left[i] = max;
        }
        max = height[height.length - 1];
        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i --) {
            if (height[i] > max) {
                max = height[i];
            }
            right[i] = max;
        }
        int water = 0;
        for (int i = 0; i < height.length; i ++) {
            water +=Math.min(left[i], right[i]) - height[i];
        }
        return water;
  }

  public static void main(String ...s){
    ps.println(trap(new int[]{4,2,0,3,2,5}));
  }
}