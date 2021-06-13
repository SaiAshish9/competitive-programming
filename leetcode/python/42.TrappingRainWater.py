class Main:

  @staticmethod
  def trap(height):
    if len(height)==0:
      return 0
    left=[None]*len(height)
    right=[None]*len(height)
    max=height[0]
    left[0]=height[0]
    for i in range(1,len(height)):
      if height[i] > max:
        max= height[i]
      left[i] = max
    max = height[len(height) - 1]
    right[len(height) - 1] = height[len(height) - 1]
    for i in range(len(height) - 2,-1,-1):
      if height[i] > max:
        max = height[i]
      right[i] = max
    water = 0
    for i in range(0,len(height)):
      water += min(left[i], right[i]) - height[i]
    return water    

print(Main.trap([4,2,0,3,2,5]))