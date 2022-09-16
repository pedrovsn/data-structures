## 35. Search Insert Position

### Description

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

### Solution

```
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length - 1]) {
            return nums.length;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int i = nums.length - 1;
        do {
            i--;
        } while (i >= 0 && nums[i] > target);

        return ++i;
    }
}
```