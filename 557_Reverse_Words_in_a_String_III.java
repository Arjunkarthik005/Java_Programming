// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

// Example 1:

// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2:

// Input: s = "Mr Ding"
// Output: "rM gniD"

//PROGRAM 
class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
           StringBuilder st = new StringBuilder(str[i]);
            sb.append(st.reverse());
            sb.append(" ");
        }
        String a = sb.toString();
        String b = a.trim();
        return b;
    }
}
