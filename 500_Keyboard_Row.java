// Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

// Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

// In the American keyboard:

// the first row consists of the characters "qwertyuiop",
// the second row consists of the characters "asdfghjkl", and
// the third row consists of the characters "zxcvbnm".

 

// Example 1:

// Input: words = ["Hello","Alaska","Dad","Peace"]

// Output: ["Alaska","Dad"]

// Explanation:

// Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

// Example 2:

// Input: words = ["omk"]

// Output: []

// Example 3:

// Input: words = ["adsdf","sfd"]

// Output: ["adsdf","sfd"]



//PROGRAM 

import java.util.*;

class Solution {
    public String[] findWords(String[] words) {
        String a = "asdfghjkl";
        String b = "qwertyuiop";
        String c = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String s = words[i].toLowerCase();

            if (inSameRow(s, a) || inSameRow(s, b) || inSameRow(s, c)) {
                list.add(words[i]); 
            }
        }
        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }
        return str;
    }
    private boolean inSameRow(String word, String row) {
        for (char ch : word.toCharArray()) {
            if (row.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}

