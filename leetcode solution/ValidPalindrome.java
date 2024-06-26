// 125. Valid Palindrome
// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// Example 1:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:
// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
        	char c = s.charAt(i);
        	char c1 = s.charAt(j);
        	if (!Character.isLetterOrDigit(c )) {
        		i++;
        	} else if(!Character.isLetterOrDigit(c1)) {
        		j--;
        	} else {
        		if (Character.toLowerCase(c) != Character.toLowerCase(c1)) {
        			return false;
        		}
        		i++;
        		j--;
        	}
        }
        return true;
    }    
}
