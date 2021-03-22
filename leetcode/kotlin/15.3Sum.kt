package com.programming

import java.util.LinkedList

import java.util.Arrays

internal class Test{
   companion object {
       fun threeSum(nums: IntArray): List<List<Int>>? {
           val result: MutableList<List<Int>> = LinkedList()
           Arrays.sort(nums)
           for (i in nums.indices) {
               if (i == 0 || nums[i] != nums[i - 1]) {
                   var start = i + 1
                   var end = nums.size - 1
                   while (start < end) {
                       val sum = nums[i] + nums[start] + nums[end]
                       if (sum == 0) {
                           val tmp: MutableList<Int> = LinkedList()
                           tmp.add(nums[i])
                           tmp.add(nums[start])
                           tmp.add(nums[end])
                           result.add(tmp)
                           val startVal = nums[start]
                           val endVal = nums[end]
                           while (start < end && startVal == nums[start]) {
                               start++
                           }
                           while (end > start && endVal == nums[end]) {
                               end--
                           }
                       } else if (sum < 0) {
                           start++
                       } else {
                           end--
                       }
                   }
               }
           }
           return result
       }
   }
}

fun main(){
    print(Test.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)))
}