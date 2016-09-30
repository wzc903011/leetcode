/*
 *  n = d1 + 10d2 + 100d3 + .... + 10...dm     n % 9 = (d1 + d2 + d3 +....+ dm) % 9;   
 *  n = 9m --- 
 */
public class Solution {
     public int addDigits(int num) {
     	return (num -1) % 9 + 1;
     }
}
