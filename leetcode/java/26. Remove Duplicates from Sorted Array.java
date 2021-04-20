import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
            TreeMap<Integer,Integer> map= new TreeMap<Integer,Integer>();
    for(int i=0;i<nums.length;i++){
      if(!map.containsValue(nums[i])){
        map.put(i,nums[i]);
      }
    }
    int i=0;
    for(Map.Entry m:map.entrySet()){
      nums[i]=(int)m.getValue();
      i++;
    }
    return map.size();
    }
}