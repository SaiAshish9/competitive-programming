package com.programming

fun findMedianSortedArray(arr1:MutableList<Int>,arr2:MutableList<Int>):Double{
    var list = mutableListOf<Int>();
    list.addAll(arr1)
    list.addAll(arr2)
    list.sort()
    if(list.size==0){
        return list[0].toDouble()
    }
    var median:Double = 0.0;
    var mid:Int;
    mid = list.size/2;
    if(list.size %2 !=0){
        median = list[mid].toDouble()
    }else{
        median = (list[mid-1]+list[mid]).toDouble()/2
    }
    return median
}

fun main(){
    val arr1 = mutableListOf<Int>(1,4)
    val arr2 = mutableListOf<Int>(2,5)
    print(findMedianSortedArray(arr1,arr2))
}