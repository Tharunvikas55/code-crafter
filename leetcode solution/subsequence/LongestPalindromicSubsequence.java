// 516. Longest Palindromic Subsequence
// Medium
// Topics
// Companies
// Given a string s, find the longest palindromic subsequence's length in s.

// A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.

 

// Example 1:

// Input: s = "bbbab"
// Output: 4
// Explanation: One possible longest palindromic subsequence is "bbbb".
// Example 2:

// Input: s = "cbbd"
// Output: 2
// Explanation: One possible longest palindromic subsequence is "bb".
 


public class LongestPalindromicSubsequence {
    int [][] dp;
    int n;
    public int longestPalindromeSubseq(String s) {
        n = s.length();
        dp = new int[n][n];
        return helper(0, n - 1, s);
    }
    int helper(int i,int j,String s)
    {
        if(i>j)
        return 0;
        if(i==j)
        return 1;
        if(dp[i][j]!=0)
        return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
        return dp[i][j]=2+helper(i+1,j-1,s);
        else
        return dp[i][j]=Math.max(helper(i+1,j,s),helper(i,j-1,s));
    }
}
