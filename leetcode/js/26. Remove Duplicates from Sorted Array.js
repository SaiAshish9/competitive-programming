function removeDuplicates(nums){
    return Object.values(nums.reduce((a,b)=>{
     if(!b[a]){
       a[b] = nums.indexOf(b)
       return a
     }
    },{})).length
  }
  
  console.log(removeDuplicates([0,0,1,2,2,3,4]))