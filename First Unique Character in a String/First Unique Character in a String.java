//Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
// You may assume the string contain only lowercase letters.

public class Solution {
    public int firstUniqChar(String s) {
        int result = -1;
        int length = s.length();
        if (length == 0) return result;
        if (length == 1) return 0;
        int[] chars = new int[26];
        for(int i = 0; i < length; i++) {
            final char c = s.charAt(i);
            chars[c - 'a'] += 1;
        }
        
        for(int i = 0; i < length; i++) {
            final char c = s.charAt(i);
            if(chars[c -'a'] == 1) 
            {
                result = i;
            return result;
            }
        }
        return result;
}
}

 
//  if not only lowercase letters
public class Solution {
    public int firstUniqChar(String s) {
        int result = -1;
        int length = s.length();
        if (length == 0) return result;
        if (length == 1) return 0;
        Set<Character> getFirsts = new LinkedHashSet();
        Set<Character> repeats = new HashSet();
        int firstsSize = 0;
        char resultChar = ' ';
        
        for (int i = 0; i < length; i++) {
            getFirsts.add(s.charAt(i));
            if(getFirsts.size() == firstsSize) repeats.add(s.charAt(i));
            firstsSize = getFirsts.size();
        }
        for (Character c : getFirsts) {
            boolean exist = false;
            if(!repeats.contains(c)) {
                resultChar = c;
                break;
            }
        }
        for(int i = 0; i < length; i++) {
            if(s.charAt(i) == resultChar) {
                result = i;
                break;
            }
        }
        
        return result;
    }
}