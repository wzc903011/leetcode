/*
* Write a function that takes a string as input and returns the string reversed.

* Example:
* Given s = "hello", return "olleh".

* Subscribe to see which companies asked this question
*/
public class Solution {
    public String reverseString(String s) {
        StringBuilder strBuilder = new StringBuilder(s);
        int length = s.length();
        char left;
        char right;
        for (int i = 0; i < length / 2; i++) {
            left = strBuilder.charAt(i);
            right = strBuilder.charAt(length - i -1);
            if( left == right)  continue;
            strBuilder.setCharAt(i, right);
            strBuilder.setCharAt(length - i - 1, left);
        }
        return strBuilder.toString();
    }
}

