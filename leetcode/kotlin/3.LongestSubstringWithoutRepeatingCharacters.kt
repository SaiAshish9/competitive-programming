package com.programming

fun convert(str: String): String {
    var st=0;
    var start=0;
    var max=0;
    var current=0;
    var pos = mutableMapOf<Char,Int>();
    var i:Int=0;
    for(i in 0 until str.length-1){
        if(!pos.containsKey(str[i])){
            pos[str[i]]=i;
        }else{
            if(pos[str[i]]!! >= st){
                current = i - st;
                if(current>max){
                    max=current;
                    start=st;
                }
                st = pos[str[i]]?.plus(1) ?: 0;
            }
            pos[str[i]]=i;
        }
    }
    if(max<i-st){
        max=i-st;
        start=st;
    }
    return str.substring(start,start+max)
}

fun main(){
    val str:String = "abcderffaccfcvccf";
    print(convert(str))
}