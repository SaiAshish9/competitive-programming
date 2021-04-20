function removeElement(nums,val){
    return nums.filter(x=>x!=val).length
}  
console.log(removeElement([0,0,1,2,2,3,4],2))