// 1143. Longest Common Subsequence
// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.
// Example 1:
// Input: text1 = "abcde", text2 = "ace" 
// Output: 3  
// Explanation: The longest common subsequence is "ace" and its length is 3.
// Example 2:
// Input: text1 = "abc", text2 = "abc"
// Output: 3
// Explanation: The longest common subsequence is "abc" and its length is 3.
// Example 3:
// Input: text1 = "abc", text2 = "def"
// Output: 0
// Explanation: There is no such common subsequence, so the result is 0.
//package subsequence;

public class LongestCommonSubsequence {
    public static  int lcs(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j]);
            }
        }
        return dp[n][m];
    }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     String s1="abcde";
    //     String s2="ace";
    //     System.out.println(lcs(s1,s2));
    // }
}



// Function Signature and Initialization:

// public int lcs(String text1, String text2) {
//     int n = text1.length();
//     int m = text2.length();
//     int[][] dp = new int[n + 1][m + 1];
// The method lcs takes two strings, text1 and text2, as input.
// n and m store the lengths of text1 and text2, respectively.
// A 2D array dp of size (n+1) x (m+1) is created and initialized to 0. This array will be used to store the lengths of the longest common subsequences for substrings of text1 and text2.

// Filling the DP Table:

// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= m; j++) {
//         if (text1.charAt(i - 1) == text2.charAt(j - 1))
//             dp[i][j] = 1 + dp[i - 1][j - 1];
//         else
//             dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
//     }
// }
// The nested loops iterate over each character of text1 (indexed by i) and each character of text2 (indexed by j).
// If the characters at text1[i-1] and text2[j-1] match, it means the character is part of the longest common subsequence for substrings ending at i and j. Therefore, dp[i][j] is set to 1 + dp[i-1][j-1].
// If the characters do not match, dp[i][j] is set to the maximum value between dp[i-1][j] and dp[i][j-1]. This step ensures that the longest common subsequence length is carried forward from the previous computations.
// Returning the Result:


// return dp[n][m];
// The value at dp[n][m] contains the length of the longest common subsequence for the entire strings text1 and text2.
// Example Walkthrough:
// For text1 = "abcde" and text2 = "ace", the DP table dp will be filled as follows:

// Initial DP table:

// Copy code
//    0  0  0  0
// 0  0  0  0  0
// 0  0  0  0  0
// 0  0  0  0  0
// 0  0  0  0  0
// 0  0  0  0  0
// 0  0  0  0  0
// After filling the table:

// Copy code
//    0  0  0  0
// 0  0  0  0  0
// 0  0  1  1  1
// 0  0  1  1  1
// 0  0  1  2  2
// 0  0  1  2  2
// 0  0  1  2  3
// For i=1 and j=1, text1[0] is 'a' and text2[0] is 'a'. They match, so dp[1][1] = 1 + dp[0][0] = 1.
// For i=2 and j=2, text1[1] is 'b' and text2[1] is 'c'. They do not match, so dp[2][2] = max(dp[1][2], dp[2][1]) = 1.
// For i=3 and j=3, text1[2] is 'c' and text2[2] is 'e'. They do not match, so dp[3][3] = max(dp[2][3], dp[3][2]) = 1.
// For i=3 and j=2, text1[2] is 'c' and text2[1] is 'c'. They match, so dp[3][2] = 1 + dp[2][1] = 2.
// Continuing this process, the final value dp[5][3] = 3 represents the length of the longest common subsequence "ace".