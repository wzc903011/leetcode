/*Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
* Example:
* Given a = 1 and b = 2, return 3.
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

