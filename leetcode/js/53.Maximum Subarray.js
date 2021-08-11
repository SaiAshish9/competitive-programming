class Solution{
  
    static maxSubArray(nums){
      let currSum =0;
      let max = Number.MIN_SAFE_INTEGER
  
      for(let i=0;i<nums.length;i++){
         
        currSum = Math.max(currSum + nums[i],nums[i])
        max = Math.max(currSum,max)
      }
      
      return max
  
    }
  
  }
  
console.log(Solution.maxSubArray([1,2,3]))