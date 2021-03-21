import java.util.*;

class Main{

public static String lcp(List<String> s){
  if(s.size()==0){
    return "";
  }
  String prefix = s.get(0);
  for (int i = 0; i < s.size(); i++)
  {
      for (int j = 0; j < prefix.length();j++)
      {
          if (j == s.get(i).length() || prefix.charAt(j)!= s.get(i).charAt(j))
          {
              prefix = prefix.substring(0, j);
              break;
          }
      }
  }
  return prefix;
}

public static void main(String ...s){
  System.out.println(lcp(Arrays.asList("flower", "flow", "flight")));
}

}
