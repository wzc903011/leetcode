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
