import java.io.*;

class Main{

  static PrintStream ps = System.out;
  
  public static int findMissingPositive(int[] A){
  int n = A.length; 
  boolean[] present = new boolean[n + 1];
  for (int i = 0; i < n; i++) {
  if (A[i] > 0 && A[i] <= n)
    present[A[i]] = true;
  }
  for (int i = 1; i <= n; i++)
    if (!present[i])
      return i;
  return n + 1;
  }

  public static void main(String ...s){
   int[] nums={0,-1,3,1};
   ps.println(findMissingPositive(nums));
  }

}