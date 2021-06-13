class Main {
  static trap(height = []) {
    if (height.length === 0) {
      return 0;
    }
    let left = [],
      right = [];
    let max = height[0];
    left[0] = height[0];
    for (let i = 1; i < height.length; i++) {
      if (height[i] > max) {
        max = height[i];
      }
      left[i] = max;
    }
    max = height[height.length - 1];
    right[height.length - 1] = height[height.length - 1];
    for (let i = height.length - 2; i >= 0; i--) {
      if (height[i] > max) {
        max = height[i];
      }
      right[i] = max;
    }
    let water = 0;
    for (let i = 0; i < height.length; i++) {
      water += Math.min(left[i], right[i]) - height[i];
    }
    return water;
  }
}

console.log(Main.trap([4, 2, 0, 3, 2, 5]));
