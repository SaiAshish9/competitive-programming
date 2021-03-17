class Main {
 
    public static int maxArea(int[] height) {
          int left = 0, right = height.length -1;
          int max = 0;
          while (left < right) {
              max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
              if (height[left] < height[right]) {
                  left ++;
              }
              else {
                  right --;
              }
          }
          return max;
    }
  
    public static void main(String[] args) {
      System.out.println(maxArea(new int[]{1,2,1}));
     }
  
  }