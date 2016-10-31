/*Given an array of integers, find if the array contains any duplicates. 
Your function should return true if any value appears at least twice in the array,
 and it should return false if every element is distinct.
*/

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            int start = set.size();
            final Integer temp = nums[i];
            set.add(temp);
            if(set.size() == start) return true;
        }
        return false;
    }
}


//   85%  --- related to the TestCase
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }
}



