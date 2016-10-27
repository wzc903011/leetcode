/*Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
* This is case sensitive, for example "Aa" is not considered a palindrome here.
* Note:
* Assume the length of given string will not exceed 1,010.
*/
public class Solution {
    public int longestPalindrome(String s) {
        final int length = s.length();
        Character[] chars = new Character[length*2];
        int index = 0;
        if(length == 0) return 0;
        for(int i = 0; i < length; i++) {
            if(i == 0) {
                chars[index++] = s.charAt(i);
                continue;
            }
            char c = s.charAt(i);
            boolean exist = false;
            int tempIndex = 0;
            for(int j = index - 1; j >= 0; j--) {
                if(chars[j] == c) {
                    tempIndex = j;
                    exist = true;
                    break;
                } 
            }
            if(!exist) chars[index++] = c;
            else {
                int palindromeIndex = 2*length -1 -tempIndex;
                if(chars[palindromeIndex] != null) chars[index++] = c;
                else chars[palindromeIndex] = c;
            }
        }
        
        int pairs = 0;
        for(int i = length; i < 2*length; i++) {
            if(chars[i] != null) pairs++;
        }
        
        if(length%2 == 0) {
            if(pairs*2 < length) return pairs*2+1;
            else return pairs*2;
        } 
        else return pairs*2 + 1;
        
        
    }
}
