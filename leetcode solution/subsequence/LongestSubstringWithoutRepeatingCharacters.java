// 3. Longest Substring Without Repeating Characters
// Solved
// Medium
// Topics
// Companies
// Hint
// Given a string s, find the length of the longest 
// substring
//  without repeating characters.
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:
// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:
// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

//sliding window concept






import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlen=Math.min(s.length(),1);
        Set<Character> seen=new HashSet<>();
        while(end<s.length())   
        {
            char c=s.charAt(end);
            while(seen.contains(c))
            {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(c);
            int windowsize=end-start+1;
            maxlen=Math.max(maxlen,windowsize);
            end++;
        }
        return maxlen;
    }
}
