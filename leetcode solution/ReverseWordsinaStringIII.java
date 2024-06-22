// 557. Reverse Words in a String III
// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Example 2:
// Input: s = "Mr Ding"
// Output: "rM gniD"

class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            StringBuilder st=new StringBuilder(arr[i]);
            if(i!=0)
            str.append(" ");
            str.append(st.reverse());
        }
        return str.toString();
    }
}