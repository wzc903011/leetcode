/*
A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
Each LED represents a zero or one, with the least significant bit on the right.
Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
*/
public class Solution {
    public List<String> readBinaryWatch(int num) {
         List<String> result = new ArrayList();
         if (num == 0) {
            result.add("0:00");
            return result;
         }
         String fullBinary = Integer.toBinaryString(1023);
         List<String> binaryList = new ArrayList();
         for (int i = 1; i < 764; i++) {    // 11:59
             int temp = 0;
             String iBinary = Integer.toBinaryString(i);
             if (iBinary.length() < num) continue;
             for (int j = 0; j < iBinary.length(); j++) {
                 if(iBinary.charAt(j) == '1') temp++;
             }
             if(temp == num) binaryList.add(iBinary);   // match
         }
         for(String str:binaryList) {
             StringBuilder sb = new StringBuilder();
             int length = str.length();
             int hours,minutes;
             if (6>= length && length >0) {
                minutes = Integer.parseInt(str,2);
                if (minutes >= 60) continue;
                sb.append("0:");
                if (minutes > 9) {
                    sb.append(String.valueOf(minutes));
                } else {
                    sb.append("0");
                    sb.append(String.valueOf(minutes));
                }
             } else if (10 >= length && length > 6) {
                 minutes = Integer.parseInt(str.substring(length - 6,length),2);
                 if(minutes >= 60) continue;
                 hours = Integer.parseInt(str.substring(0,length - 6),2);
                 sb.append(String.valueOf(hours)).append(":");
                 if(minutes > 9) {
                    sb.append(String.valueOf(minutes));
                 } else {
                    sb.append("0");
                    sb.append(String.valueOf(minutes));
                 }
             }
             result.add(sb.toString());
         }
         return result;
    }
}