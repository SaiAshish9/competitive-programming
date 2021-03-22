class Test{

    static threeSum(nums){
      var result=[]
      nums.sort((a,b)=>a-b)
      for(let i=0;i<nums.length;i++){
        if(i==0||nums[i]!=nums[i-1]){
          let start = i+1
          let end = nums.length - 1
          while(start<end){
            let s = nums[i] + nums[start] + nums[end]
            if(s==0){
                let temp = [nums[i],nums[start],nums[end]]
                result.push(temp)
                let startVal = nums[start]
                let endVal = nums[end]
                while(start < end && startVal == nums[start]){
                   start+=1        
                }
                while(end > start && endVal == nums[end]){
                  end-=1
                }
            }else if(s<0){start+=1}
            else{end-=1}
          }
        }
      }
      return result
    }
    
    }
    
    console.log(Test.threeSum([-1, 0, 1, 2, -1, -4]))