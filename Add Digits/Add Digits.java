Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

/*
 *  n = d1 + 10d2 + 100d3 + .... + 10...dm     n % 9 = (d1 + d2 + d3 +....+ dm) % 9;   
 *  n = 9m --- 
 */
public class Solution {
     public int addDigits(int num) {
     	return (num -1) % 9 + 1;
     }
}
