public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        boolean flag = false;
        if(ransomNote.length() == 0) return result;
        StringBuilder strBuilder = new StringBuilder(magazine);
        
        for (int i = 0; i < ransomNote.length(); i++) {
            if(!flag && i != 0) return !result;
            flag = false;
            char temp = ransomNote.charAt(i);
            for (int j = 0; j < strBuilder.length(); j++) {
                if (strBuilder.charAt(j) == temp) {
                    strBuilder.deleteCharAt(j);
                    flag = true;
                    break;
                } 
            }
        } 
        
        // length() == 1
        if(!flag) return !result;
        return true;
    }
}