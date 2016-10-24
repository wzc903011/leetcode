/*
* Related to question Excel Sheet Column Title

* Given a column title as appear in an Excel sheet, return its corresponding column number.

* For example:

*    A -> 1
*    B -> 2
*    C -> 3
*    ...
*    Z -> 26
*    AA -> 27
*    AB -> 28 
*/

public class Solution {
    public int titleToNumber(String s) {
        int result = 0, carry = 1;
        for (int i = s.length() - 1; i >=0; i--) {
            int cInt = (s.charAt(i) - 64)*carry;
            carry*=26;
            result += cInt;
        }
        return result;
    }
}