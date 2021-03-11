import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {

    public static String convert(String s,int numRows){
        if(numRows==0||s.length()<numRows){
            return s;
        }
        int currentRow=0;
        boolean reverse=false;
        String result="";
        List<ArrayList<Character>> rows = new ArrayList<ArrayList<Character>>();
        for(int i=0;i<numRows;i++){
           rows.addAll(Collections.singleton(new ArrayList<Character>()));
        }
        
        for (int i=0;i<s.length();i++){
            rows.get(currentRow).add(s.charAt(i));
            if(!reverse){
                currentRow++;
            }else{
                currentRow--;
            }
            if(currentRow == numRows -1 || currentRow ==0 ){
                reverse = !reverse;
            }
        }

        for(int i=0;i<rows.size();i++){
        String str="";
        for(int j=0;j<rows.get(i).size();j++){
          str += rows.get(i).get(j);    
        }
        result+= str;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
    
}