// We define the usage of capitals in a word to be right when one of the following cases holds:

// All letters in this word are capitals, like "USA".
// All letters in this word are not capitals, like "leetcode".
// Only the first letter in this word is capital, like "Google".
// Given a string word, return true if the usage of capitals in it is right.

 

// Example 1:

// Input: word = "USA"
// Output: true
// Example 2:

// Input: word = "FlaG"
// Output: false

//PROGRAM 
class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;
        int lowerCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int ascii = (int) ch;

            if (ascii >= 65 && ascii <= 90) {
                upperCount++;
            } else if (ascii >= 97 && ascii <= 122) {
                lowerCount++;
            }
        }
        if (upperCount == word.length()) {
            return true;
        }
        if (lowerCount == word.length()) {
            return true;
        }
        if ((int)word.charAt(0) >= 65 && (int)word.charAt(0) <= 90 && lowerCount == word.length() - 1) {
            return true;
        }

        return false;
    }
}
