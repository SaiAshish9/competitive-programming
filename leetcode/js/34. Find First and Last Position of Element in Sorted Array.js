var searchRange = function(nums,target){
    var left = 0
    var right = nums.length -1
    var res = []
    res[0] = -1
    var has = false
    while(left <= right){
      var mid = left + parseInt((right-left)/2)
      if(nums[mid]<target){
        left++
      }else if(nums[mid]==target){
        has = true
        right--
      }else{
        right--
      }
    }
    if(has){
      res[0] = left
    }
    left = 0
    right = nums.length - 1
    while (left <= right) {
      let mid = left + parseInt((right - left) / 2)
      if (nums[mid] <= target) {
        left++
      } else {
        right--
      }
      }
      if (has) {
        res[1] = right
      }else{
          res[1] = -1
      }
    return res
  }
  
  console.log(searchRange([5,7,7,8,8,10],8))