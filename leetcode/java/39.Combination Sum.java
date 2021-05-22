import java.util.*;
import java.io.*;

class Main{

   static PrintStream ps = System.out;
  
   public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(candidates == null || candidates.length == 0) return result;
        ArrayList<Integer> current = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combinationSum(candidates, target, 0, current, result);
        return result;
    }

    public static void combinationSum(int[] candidates, int target, int j, ArrayList<Integer> curr, List<List<Integer>> result){
        if(target == 0){
            ArrayList<Integer> temp = new ArrayList<Integer>(curr);
            result.add(temp);
            return;
        }
        // if target is zero add curr to result & clear it
        for(int i=j; i<candidates.length; i++){
            if(target < candidates[i])
                return;
            curr.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i, curr, result);
            curr.remove(curr.size()-1);
       }
   }

  public static void main(String ...st){
    combinationSum(new int[]{2,3,6,7},7).stream().forEach(x->{
       ps.println(x);
     });
  }

}