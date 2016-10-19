public class Solution {
    public void moveZeroes(int[] nums) {
        int zeroNum = 0;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                zeroNum++;
                continue;
            } else {
                nums[i-zeroNum] = nums[i];
            }
        }

        for (int i = (length - 1); i > (length - zeroNum -1); i--) {
            nums[i] = 0;
        }
    }
}