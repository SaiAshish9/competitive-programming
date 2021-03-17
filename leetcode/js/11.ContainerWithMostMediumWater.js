class Solution{

    static maxArea(height){
      let max=0,min=0,left=0;
      let right=height.length-1
      while(left<right){
        max=Math.max(max,Math.min(height[left],height[right])*(right-left))
        if(height[left]<height[right]){
          left+=1
        }else{
          right-=1
        }
        return max
      }
    }
    }
    
    console.log(Solution.maxArea([1,2,1]))