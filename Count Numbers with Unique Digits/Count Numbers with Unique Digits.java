Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

Example:
Given n = 2, return 91. (The answer should be the total numbers in the range of 0 ≤ x < 100, excluding [11,22,33,44,55,66,77,88,99])
/*
 * while(n<11) 9(10-1)(10-2)....(10-n)   
 * if n > 11  always has repeat digits
*/
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        // 0
        int uniqueNum = 1;
    
        for(int i = 1; i < n + 1; i++) {
            if(i > 10) {
                break;
            }	
  	    int temp = 9;
            for(int j = 1; j < i; j++) {
                temp = temp*(10 - j);
            }
            uniqueNum += temp;
        }
        return uniqueNum;
    }
}
