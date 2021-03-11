import java.util.*

fun convert(s:String, numRows:Int):String{

    if(numRows==0 || s.length <numRows){
        return s;
    }
    var currentRow:Int=0;
    var reverse:Boolean=false;
    var result:String="";

    var rows= mutableListOf<MutableList<Char>>()

    for(i  in 0..numRows){
        rows.addAll(Collections.singleton(mutableListOf()))
    }

    for (element in s){
        rows[currentRow].add(element)
        if(!reverse){
            currentRow++;
        }else{
            currentRow--;
        }
        if(currentRow == numRows -1 || currentRow ==0 ){
            reverse = !reverse;
        }
    }

    for (i in 0 until rows.size){
        var str=""
        for(j in 0 until rows[i].size){
        str += rows[i][j];
    }
        result+= str;
    }

    return result;
}

fun main(){
    println(convert("PAYPALISHIRING",3))
}