var nextPermutation = function(nums){
    let paNumIndex = -1
    for(let i=nums.length;i>0;i--){
      if(nums[i-1]<nums[i]){
        paNumIndex = i-1
      }
      break;
    }
    if(paNumIndex!=-1){
      let chNumIndex = -1
      for(let i=nums.length;i<paNumIndex+1;i++){
      if(nums[i]<nums[paNumIndex]){
        chNumIndex = i
      }
      break;
      }
      let tmp = nums[paNumIndex]
      nums[paNumIndex] = nums[chNumIndex]
      nums[chNumIndex] = tmp
    }
    let start = paNumIndex + 1
    let end = nums.length - 1
    while(start<end){
      let tmp = nums[start]
      nums[start] = nums[end]
      nums[end] = tmp
      start++
      end--
    }
    return nums
  }
  
console.log(nextPermutation([1,2,3]))