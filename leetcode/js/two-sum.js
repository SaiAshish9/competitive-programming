function twoSum(a,b){
  var x = {}
  for(let i=0; i<a.length;i++){
    let diff = b - a[i] 
     if(x[diff] !== undefined){
         return [x[diff],i]
      }
     x[a[i]]=i
  }
  return
}

twoSum([1,3,2],3)