import java.util.*;

class Main {

  public static String convert(String str){
    int st=0,start=0,max=0,current=0;
    HashMap<Character,Integer> pos = new HashMap<>();
    int i;
    for(i=0;i<str.length();i++){
    if(!pos.containsKey(str.charAt(i))){
       pos.put(str.charAt(i),i);
    }else{
        if(pos.get(str.charAt(i))>=st){
          current = i - st;
          if(max < current){
             max = current;
             start = st;
          }
          st = pos.get(str.charAt(i)) + 1;
        }
       pos.put(str.charAt(i),i);
    }
    }
if (max < i - st) {
  max = i - st;
  start = st;
}
return str.substring(start,start+max);
  }

  public static void main(String[] args) {
    String x ="abcderffaccfcvccf";
    System.out.println(convert(x));
  }

}