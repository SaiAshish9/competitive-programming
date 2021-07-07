import java.util.*;
import java.io.*;

class Main {
      
    public static PrintStream ps = System.out;

    public static List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, Integer> helper = new HashMap<String, Integer>();
        for (int i = 0; i < strs.length; i ++) {
            char[] tmpChar = strs[i].toCharArray();
            Arrays.sort(tmpChar);
            String tmp = new String(tmpChar);
            if (helper.containsKey(tmp)) {
                result.get(helper.get(tmp)).add(strs[i]);
                continue;
            }
            List<String> curr = new LinkedList<String>();
            curr.add(strs[i]);
            result.add(curr);
            helper.put(tmp, result.size() - 1);
        }
        return result;     
    }

    public static void main(String ...s){
       String[] dataSet = new String[] {"eat","tea","tan","ate","nat","bat"};
       for(List<String> c:groupAnagrams(dataSet)){
         c.stream().forEach(ps::println);
         ps.println("###############");
       }
    }

}