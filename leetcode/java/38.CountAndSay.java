// countAndSay(4) = say countAndSay(3)
import java.io.*;

class Main{

    static PrintStream ps = System.out;

    public static String countAndSay(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result = "1";
                continue;
            }
            result = process(result);
        }
        return result;
    }

    private static String process(String s) {
        String result = "";
        char curr = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i ++) {
            if (s.charAt(i) != curr) {
                result += (count + "") + curr;
                curr = s.charAt(i);
                count = 1;
                continue;
            }
            count ++;
        }
        result += (count + "" )+ curr;
        return result;
    }

    public static void main(String ...st){
    //  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    //  String s = "33222112"; 
    //  for(int i=0;i<s.length();i++){
    //    int num= Integer.parseInt(String.valueOf(s.charAt(i)));
    //    if(!map.containsKey(num)){
    //      map.put(num,1);
    //    }else{
    //      map.put(num,map.get(num)+1);
    //    }
    //    ps.print(s.charAt(i) + " ");
    //  }
    //  ps.println("");
    //  for(Map.Entry m:map.entrySet()){
    //    ps.println(m.getKey() +" : "+ m.getValue());
    //  }
    //  int i=0;
    //  while(i<s.length()){
    //    int num = Character.getNumericValue(s.charAt(i));
    //    ps.print(map.get(num)+" "+s.charAt(i)+" ");
    //    i+=map.get(num);
    //  }
    // }
    ps.println(countAndSay(4));
}
}