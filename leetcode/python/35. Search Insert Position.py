class Main:
  
  def searchInsert(self,nums,target):
    return self.bs(nums,0,len(nums)-1,target)
  
  def bs(self,nums,start,end,target):
    if start > end:
      return end + 1
    mid = (start+end)//2
    if nums[mid] < target:
      return self.bs(nums,mid+1,end,target)
    elif nums[mid] > target:
      return self.bs(nums,start,mid-1,target) 
    return mid

m = Main()

print(m.searchInsert([2,3,4,5,6],5))