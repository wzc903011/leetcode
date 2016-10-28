/* 
* Given two strings s and t, write a function to determine if t is an anagram of s.

* For example,
* s = "anagram", t = "nagaram", return true.
* s = "rat", t = "car", return false.

* Note:
* You may assume the string contains only lowercase alphabets.

* Follow up:
* What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/

public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sChar = new int[26];
        int[] tChar = new int[26];
        for(int i = 0; i < s.length(); i++) {
            sChar[s.charAt(i)-'a'] += 1;
        }
        for(int i = 0; i < t.length(); i++) {
            tChar[t.charAt(i)-'a'] += 1;
        }
        
        for(int i = 0; i < 26; i++) {
            if(sChar[i] != tChar[i]) return false;
        }
        return true;
    }
}