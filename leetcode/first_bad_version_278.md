## 278. First Bad Version

### Description

### Solution

```
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int minBad = n;
        int left = 0;
        int right = n;
        
        while(left <= right){
            int mid = left + (right - left) / 2;        
            
            if(!isBadVersion(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
                minBad = mid;
            }
        }
        
        return minBad;
    }
}
```