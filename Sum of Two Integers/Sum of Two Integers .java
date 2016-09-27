/*
 *until carry == 0
 */

public class Solution {
    public int getSum(int a, int b) {
        int sum = 0;
        int carry = 0;
        do{
            carry = (a&b)<<1;
            sum = a^b;
            b = carry;
            a = sum;
        } while (carry != 0);  // carry ---- not a&b  
        return sum;
    }
}

