internal object Main {
    var ps = System.out
    private fun countAndSay(n: Int): String {
        var result = ""
        for (i in 0 until n) {
            if (i == 0) {
                result = "1"
                continue
            }
            result = process(result)
        }
        return result
    }

    private fun process(s: String): String {
        var result = ""
        var curr = s[0]
        var count = 1
        for (i in 1 until s.length) {
            if (s[i] != curr) {
                result += count.toString() + "" + curr
                curr = s[i]
                count = 1
                continue
            }
            count++
        }
        result += count.toString() + "" + curr
        return result
    }

    @JvmStatic
    fun main(st: Array<String>) {
        //  Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        val s = "33222112"
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
        ps.println(countAndSay(4))
    }
}