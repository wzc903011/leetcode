/*
 *先手的话，保证对手是4n就一定赢
 */

public class Solution {
    public boolean canWinNim(int n) {
        return (n%4 == 0 ? false : true);
    }
}

