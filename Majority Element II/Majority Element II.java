/*
Given an integer array of size n, find all elements that appear more than ? n/3 ? times. The algorithm should run in linear time and in O(1) space.
最多有2个解，保证res1 ！= res2，就可以用净个数 > 0 来做
*/

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int res1 = 0,res2 = 0;
        int cnt1 = 0,cnt2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(cnt1 != 0 && nums[i] == res1) cnt1++;
            else if(cnt2 != 0 && nums[i] == res2) cnt2++;
            else if(cnt1 == 0) {
                res1 = nums[i];
                cnt1++;
            } else if(cnt2 == 0) {
                res2 = nums[i];
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        
        int sum1 = 0,sum2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(cnt1 != 0 && nums[i] == res1) sum1++;
            if(cnt2 != 0 && nums[i] == res2) sum2++;
        }
        List<Integer> result = new ArrayList<>();
        if(sum1 > nums.length/3) result.add(res1);
        if(sum2 > nums.length/3) result.add(res2);
        
        return result;
    }
}