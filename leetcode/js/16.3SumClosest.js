class Test{

    static threeSumClosed(nums,target){
      if(nums.length==0){
        return 0
      }
      nums.sort((a,b)=>a-b)
      let minimum = Number.MAX_VALUE
      // Number.MIN_SAFE_INTEGER
      var closed = 0 
      for(let i=0;i<nums.length;i++){
        if(i==0||nums[i]!=nums[i-1]){
          let start = i+1
          let end = nums.length - 1
          while(start<end){
            let s = nums[i] + nums[start] + nums[end]
            if(Math.abs(s-target)<minimum){
              minimum = Math.abs(s-target)
              closed =s 
            }
            if(s<target){start+=1}
            else{end-=1}
            }
          }
        }
          return closed
      }
    }
    
    
    console.log(Test.threeSumClosed([-1, 0, 1, 2, -1, -4],8))