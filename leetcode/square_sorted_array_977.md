## 977. Square Sorted Array

### Description

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

### Solution

```
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i  = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        
        Arrays.sort(nums);
        
        return nums;
    }
}
```