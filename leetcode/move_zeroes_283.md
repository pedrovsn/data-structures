## 283. Move Zeroes

### Description

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

### Solution

```
func moveZeroes(nums []int) {
	for i := len(nums) - 1; i >= 0; i-- {
		if nums[i] == 0 {
			for j := i; j < len(nums)-1; j++ {
				temp := nums[j+1]
				nums[j+1] = nums[j] // current zero
				nums[j] = temp
			}
		}
	}
}
```