// 139. Word Break
// Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
// Note that the same word in the dictionary may be reused multiple times in the segmentation.
// Example 1:
// Input: s = "leetcode", wordDict = ["leet","code"]
// Output: true
// Explanation: Return true because "leetcode" can be segmented as "leet code".
// Example 2:
// Input: s = "applepenapple", wordDict = ["apple","pen"]
// Output: true
// Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
// Note that you are allowed to reuse a dictionary word.
// Example 3:
// Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
// Output: false





public class WordBreak {
    //mwthod 1 time limit excedeed error
    // public boolean helper(int n,List<String> ls,String s)
    // {
    //     if(n<0) return true;
    //     for(String word:ls)
    //     {
    //         if(n-word.length()+1<0)
    //             continue;
    //         if(s.substring(n-word.length()+1,n+1).equals(word) && helper(n-word.length(),ls,s)){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // public boolean wordBreak(String s, List<String> wordDict) {
    //     int n=s.length()-1;
    //     return helper(n,wordDict,s);
    // }
}
