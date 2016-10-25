/*
* Given a positive integer, return its corresponding column title as appear in an Excel sheet.

* For example:

*    1 -> A
*    2 -> B
*    3 -> C
*    ...
*    26 -> Z
*    27 -> AA
*    28 -> AB 
*/
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder strBuilder = new StringBuilder();
        do {
            int bit = (n - 1) % 26 + 1;
            char c = (char)(bit + 64);
            strBuilder.append(c);
            n = (n - bit) / 26;
        }while (n != 0);
        
        return strBuilder.reverse().toString();
    }
}