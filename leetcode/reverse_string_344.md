## 344. Reverse String

### Description

Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

### Solution

```
func reverseString(s []byte) {
	j := len(s) - 1
	for i := 0; i < len(s)-1 && j > i; i++ {
		temp := s[i]
		s[i] = s[j]
		s[j] = temp
		j--
	}
}
```