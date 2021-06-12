var findMissingPositive = function(A){
    let n = A.length
    let present = []
    for(let i=0;i<n;i++){
     if(A[i]>0&&A[i]<n){
       present[A[i]] = true
     }
    }
    for(let i=1;i<n+1;i++){
     if(!present[i]){
       return i
     }
    }
    return n+1
 }
 
 const nums = [0,-1,3,1]
 console.log(findMissingPositive(nums))