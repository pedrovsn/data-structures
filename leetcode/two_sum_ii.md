## 167. Two Sum II

### Description

### Solution

```
public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        for (int i = mid; i < numbers.length; i++) {
            if (numbers[mid] + numbers[i] == target) {
                return new int[]{mid + 1, i + 1};
            }

            if (numbers[mid] + numbers[i] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    return new int[]{};
}
```