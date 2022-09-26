## 557. Reverse Words In A String

### Description

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

### Solution

```
import java.lang.StringBuilder;

class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            sb.append(reverseWord(words[i]));
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
    
    private String reverseWord(String s) {
        char[] sArr = s.toCharArray();
        char[] x = new char[sArr.length];
        for(int i = 0, j = sArr.length - 1; i < sArr.length; i++, j--) {
            x[i] = sArr[j];
        }
        
        return String.valueOf(x);
    }
}
```